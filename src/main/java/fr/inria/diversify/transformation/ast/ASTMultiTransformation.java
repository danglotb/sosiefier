package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.transformation.ITransformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 15/11/13
 * Time: 13:38
 */
public class ASTMultiTransformation implements ITransformation {
    protected Integer failures;
    protected List<ASTTransformation> transformations;

    public ASTMultiTransformation() {
        transformations = new ArrayList<ASTTransformation>();
    }

    @Override
    public void apply(String srcDir) throws Exception {
        for(ASTTransformation trans : transformations)
            trans.addSourceCode();

        for(ASTTransformation trans : transformations) {
            trans.printJavaFile(srcDir);
        }

        for(ASTTransformation trans : transformations)
            trans.removeSourceCode();
    }

    @Override
    public void restore(String srcDir) throws Exception {
        for(ASTTransformation trans : transformations)
            trans.restore(srcDir);
    }

    public void setJUnitResult(Integer result) {
        failures = result;
    }

    public int numberOfFailure() {
        return failures;
    }


    @Override
    public String getType() {
        return "ASTMulti";
    }

    @Override
    public void write(StringBuffer sb, char separator) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void writeHead(BufferedWriter sb, char separator) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addTransformation(ASTTransformation transformation) {
        transformations.add(transformation);
    }
}