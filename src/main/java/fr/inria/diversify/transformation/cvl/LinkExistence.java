package fr.inria.diversify.transformation.cvl;

import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 15:09
 */
public class LinkExistence extends CVLTransformation {

    private CtTypeReference classOrInterfaceExistence;

    public LinkExistence() {
        type= "cvl";
        name = "linkExistence";
    }

    @Override
    public void apply(String srcDir) throws Exception {
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object ({}):\n {}", object.getClass().getSimpleName(), object);
        Log.debug("\npositiom:{}", object.getPosition());

        SourcePosition sp = object.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        if (object instanceof CtField) {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()),  "/** ", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), " **/\n", 0));
        }
        if(object instanceof CtSimpleType) {
            Factory factory = object.getFactory();
            CtClass classClone = factory.Core().clone((CtClass) object);
            String ollRefName = classOrInterfaceExistence.getSimpleName();

            if(classClone.getSuperclass() != null && classClone.getSuperclass().getSimpleName().equals(ollRefName))
                classClone.setSuperclass(null);
            else {
                CtTypeReference<?> ref = null;
                for(Object e : classClone.getSuperInterfaces()) {
                    ref = (CtTypeReference<?>)e;
                    if(ref.getSimpleName().equals(ollRefName))
                        break;
                }
                classClone.removeSuperInterface(ref);
            }

            int beginLine = -1;
            for(int i = 0; i < compileUnit.getOriginalSourceCode().length()-1; i++) {
                if(compileUnit.beginOfLineIndex(i) != beginLine) {
                    beginLine = compileUnit.beginOfLineIndex(i);
                    if(!isPackageOrImport(i, compileUnit.getOriginalSourceCode()))
                        compileUnit.addSourceCodeFragment(new SourceCodeFragment(beginLine,  "// ", 0));
                }

            }
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(compileUnit.getOriginalSourceCode().length()-1), "\n"+
                    classClone.toString(), 0));
        }

        printJavaFile(srcDir);
        removeSourceCode(object);
    }

    private boolean isPackageOrImport(int i, String originalSourceCode) {
        int max = Math.min(originalSourceCode.length()-1, i+10);
        String tmp = originalSourceCode.substring(i, max);

        return tmp.contains("package ") || tmp.contains("import ");
    }

    @Override
    public void restore(String srcDir) throws Exception {
        removeSourceCode(object);
        printJavaFile(srcDir);
    }

    public void setClassOrInterfaceExistance(CtTypeReference classOrInterfaceExistence) {
        this.classOrInterfaceExistence = classOrInterfaceExistence;
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = super.toJSONObject();

        if(classOrInterfaceExistence != null)
            json.put("classOrInterfaceExistence",classOrInterfaceExistence.getPackage()+"."+classOrInterfaceExistence.getSimpleName());

        return json;
    }
}
