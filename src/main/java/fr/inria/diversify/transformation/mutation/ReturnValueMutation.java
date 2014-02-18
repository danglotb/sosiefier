package fr.inria.diversify.transformation.mutation;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;

/**
 * User: Simon
 * Date: 17/02/14
 * Time: 17:29
 */
public class ReturnValueMutation extends AbstractTransformation {
    protected CtReturn ret;

    public void setReturn(CtReturn ret) {
        this.ret = ret;
    }

    @Override
    public void apply(String srcDir) throws Exception {
        Log.debug(getType());
        Log.debug("statement:\n {}", ret);
        Log.debug("--------------------\npostion:\n{}", ret.getPosition()); 
        CtLiteral literal = (CtLiteral)ret.getReturnedExpression();
        String type = literal.getType().getSimpleName();
        String newLiteral = null;

        if(type.equals("boolean")) {
            newLiteral = !((Boolean)literal.getValue()) + "";
        } else if(type.equals("short")) {
            newLiteral = ((Short)literal.getValue() + 1) + "";
        } else if(type.equals("int")) {
            newLiteral = ((Integer)literal.getValue() + 1) + "";
        } else if(type.equals("long")) {
            newLiteral = ((Long)literal.getValue() + 1) + "";
        } else if(type.equals("byte")) {
            newLiteral = ((Byte)literal.getValue() + 1) + "";
        } else if(type.equals("float")) {
            newLiteral = ((Float)literal.getValue() + 1.0f) + "";
        } else if(type.equals("double")) {
            newLiteral = ((Double)literal.getValue() + 1.0d) + "";
        }

        SourcePosition sp = literal.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/"+newLiteral, 0));

        printJavaFile(srcDir);
    }

    public void restore(String srcDir) throws Exception {
        removeSourceCode();
        printJavaFile(srcDir);
    }

    protected void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = ret.getPosition().getCompilationUnit().getMainType();
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    protected void removeSourceCode() {
        CompilationUnit compileUnit = ret.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFraments().clear();
    }

    @Override
    public String getType() {
        return "ReturnValueMutation";
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", getType());
        object.put("level", level());

        object.put("position", ret.getParent(CtPackage.class).getQualifiedName()
                + "." + ret.getParent(CtSimpleType.class).getSimpleName() + ":" + ret.getPosition().getLine());

        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(ret.getFactory().getEnvironment());
        ret.accept(pp);
        object.put("return", pp.toString());

        object.put("failures", failures);
        object.put("status", status);

        return object;
    }

    public String classLocationName() {
        return ret.getParent(CtSimpleType.class).getQualifiedName();
    }
    public String packageLocationName() {
        return ret.getParent(CtPackage.class).getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = ret.getParent(CtExecutable.class);
        if(elem != null)
            return elem.getSimpleName();
        return "field";
    }


    @Override
    public String level() {
        return "AST";
    }

    @Override
    public String stmtType() {
        return "Return";
    }

    @Override
    public int line() {
        return ret.getPosition().getLine();
    }

}
