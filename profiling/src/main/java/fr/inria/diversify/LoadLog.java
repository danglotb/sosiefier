package fr.inria.diversify;


import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.branch.CoverageReader;
import fr.inria.diversify.logger.branch.TestCoverage;
import fr.inria.diversify.logger.logvariable.TestLogVariableReader;
import fr.inria.diversify.logger.logvariable.TestLogVariable;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.processor.main.BranchPositionProcessor;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.LoggerUtils;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.factory.Factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * User: Simon
 * Date: 18/05/15
 * Time: 11:27
 */
public class LoadLog {

    protected final InputProgram inputProgram;
    protected final InputConfiguration inputConfiguration;
    protected final String logDir;
    private final Factory factory;

    Map<String, SourcePosition> branchPosition;
    Map<String, String> branchConditionType;


    public LoadLog(String propertiesFile) throws Exception, InvalidSdkException {
        inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        factory = InitUtils.initSpoon(inputProgram, false);
        logDir = inputConfiguration.getProperty("logDir");
    }

    protected  List<TestCoverage> loadTestCoverage() throws IOException {
        CoverageReader reader = new CoverageReader(logDir);
        List<TestCoverage> result = reader.loadTest();

        return result;
    }

    protected Collection<TestLogVariable> loadTestLogVariable() throws IOException {
        TestLogVariableReader reader = new TestLogVariableReader();
        Collection<TestLogVariable> result = reader.loadLog(logDir);

        return result;
    }

    protected void write(List<TestCoverage> testCoverage, Collection<Transformation> transformations, Map<String, SourcePosition> position, Map<String, String> conditionsType) throws IOException {

        PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new FileWriter("coverage.csv")));

        fileWriter.append("test;class;method;branch;branchGlobalId;deep;transformation;sosie;compile;branchConditionType\n");
        for(TestCoverage tc : testCoverage) {
            tc.csv(fileWriter, transformations, position, conditionsType);
        }

        fileWriter.close();
    }

    protected Collection<Transformation> loadTransformation() {
        JsonTransformationLoader loader = new JsonTransformationLoader(inputProgram);
        String transDir = inputConfiguration.getProperty("transformation.directory");
        return loader.load(transDir, true);
    }

    protected void intBranch() {

        BranchPositionProcessor processor = new BranchPositionProcessor();
        LoggerUtils.applyProcessor(factory, processor);

        branchPosition = processor.getBranchPosition();
        branchConditionType = processor.getBranchConditionType();
    }


    public void printNotCoveredBranch(List<TestCoverage> testCoverage) throws IOException {
        PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new FileWriter("notCoveredBranch.csv")));
        Set<String> covered = new HashSet<>();
        Set<String> allBranch = new HashSet<>();

        for(TestCoverage tc : testCoverage) {
            covered.addAll(tc.getCoveredBranchId());
            allBranch.addAll(tc.getAllBranch());
        }
        allBranch.removeAll(covered);

        fileWriter.append("branchId\n");
        for(String branch : allBranch) {
            fileWriter.append(branch + "\n");
        }
        fileWriter.close();
    }

    public static void main(String args[]) throws Exception, InvalidSdkException {
        LoadLog  load = new LoadLog(args[0]);
//        load.loadTestLogVariable();
        List<TestCoverage> testCoverage = load.loadTestCoverage();
        Collection<Transformation> transformations = load.loadTransformation();
        load.intBranch();
        load.write(testCoverage, transformations, load.branchPosition, load.branchConditionType);
        load.printNotCoveredBranch(testCoverage);
    }
}
