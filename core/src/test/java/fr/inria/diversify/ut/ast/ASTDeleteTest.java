package fr.inria.diversify.ut.ast;

import fr.inria.diversify.codeFragmentProcessor.AllStatementsProcessor;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.exception.BuildTransplantException;
import fr.inria.diversify.ut.SpoonMetaFactoryTest;
import org.junit.Test;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.factory.Factory;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by marodrig on 20/01/2015.
 */
public class ASTDeleteTest {

    public class ASTDeleteForTest extends ASTDelete {
        public CtCodeElement buildReplacement() throws BuildTransplantException {
            return buildReplacementElement();
        }
    }

    /**
     * Test the transformation of the AST. Test that after the transformation, the TP is AFTER the transplant
     * @throws Exception
     */
    @Test
    public void testTransformation() throws Exception {
        Factory f = new SpoonMetaFactoryTest().build();
        InputProgram p = new InputProgram();
        p.setFactory(f);
        p.setCodeFragmentProcessor(new AllStatementsProcessor());
        p.processCodeFragments();

        CtCodeSnippetStatement snippetStatement = new CtCodeSnippetStatementImpl();
        snippetStatement.setValue("/** TRANSFORMATION FRAGMENT DELETED:\n" +
                "super()\n" +
                "**/");

        //Test that the replacement was properly built
        ASTDeleteForTest a = new ASTDeleteForTest();
        a.setTransplantationPoint(p.getCodeFragments().get(0));
        assertEquals(snippetStatement.getValue(), ((CtCodeSnippetStatement)a.buildReplacement()).getValue());
    }
}
