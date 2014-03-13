package fr.inria.diversify.util;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.BinaryOperatorProcessor;
import fr.inria.diversify.codeFragmentProcessor.InlineConstantProcessor;
import fr.inria.diversify.codeFragmentProcessor.ReturnProcessor;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.QueueProcessingManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 20/02/14
 * Time: 13:26
 */
public class DiversifyEnvironment {
    protected static Map<Class, List<CtElement>> typeToObject = new HashMap<Class, List<CtElement>>();
    protected static CodeFragmentList codeFragments;
    protected static List<CtBinaryOperator<?>> binaryOperators;
    protected static List<CtReturn> returns;
    protected static List<CtLocalVariable> inlineConstant;
    protected static List<CtMethod> javassistMethods;
    protected static CtElement root;
    protected static Factory factory;

    public static CodeFragmentList getCodeFragments()  {
        if(codeFragments == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            StatementProcessor processor = new StatementProcessor();
            pm.addProcessor(processor);
            pm.process();

            codeFragments = processor.getCodeFragments();
        }
        return codeFragments;
    }

    public static List<CtLocalVariable> getInlineConstant() {
        if(inlineConstant == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            InlineConstantProcessor processor = new InlineConstantProcessor();
            pm.addProcessor(processor);
            pm.process();

            inlineConstant = processor.getInlineConstant();
        }
        return inlineConstant;
    }

    public static List<CtReturn> getReturns() {
        if(returns == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            ReturnProcessor processor = new ReturnProcessor();
            pm.addProcessor(processor);
            pm.process();

            returns = processor.getReturns();
        }
        return returns;
    }

    public static List<CtBinaryOperator<?>> getBinaryOperators() {
        if(binaryOperators == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            BinaryOperatorProcessor processor = new BinaryOperatorProcessor();
            pm.addProcessor(processor);
            pm.process();

            binaryOperators = processor.getBinaryOperators();
        }
        return binaryOperators;
    }

    public static List<CtMethod> getJavassistMethods() throws NotFoundException {
        if(javassistMethods == null) {
            javassistMethods = new ArrayList<CtMethod>();
            ClassPool pool = ClassPool.getDefault();
            pool.insertClassPath(DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes"));
            for (CtSimpleType cl: getCodeFragments().getAllClasses()) {
                try {
                    CtClass cc = pool.get(cl.getQualifiedName());
                    for(CtMethod method : cc.getDeclaredMethods())
                        if(!method.isEmpty()) {
                            javassistMethods.add(method);
                        }
                }  catch (Exception e) {
                    Log.error("error in getJavassistMethods", e);
                }
            }
        }
        return javassistMethods;
    }

    public static CtElement getRoot() {
        if(root == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            AbstractProcessor<CtPackage> processor = new AbstractProcessor<CtPackage>() {

                @Override
                public void process(CtPackage element) {
                    if(root == null) {
                        root = element;
                        while (root.getParent() != null)
                        root = root.getParent();
                    }
                }
            };
            pm.addProcessor(processor);
            pm.process();
        }
        return root;
    }

    public static List<CtElement> getAllElement(Class cl) {
        if(!typeToObject.containsKey(cl)) {
            QueryVisitor query = new QueryVisitor(new TypeFilter(cl));
            DiversifyEnvironment.getRoot().accept(query);
            typeToObject.put(cl, query.getResult());
        }
        return typeToObject.get(cl);
    }

    public static void setFactory(Factory factory) {
        DiversifyEnvironment.factory = factory;
    }
}