package fr.inria.diversify.sosie.stackTraceCompare;

import fr.inria.diversify.util.DiversifyProperties;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.maven.MavenDependencyResolver;
import spoon.compiler.SpoonCompiler;
import spoon.reflect.factory.Factory;
import spoon.reflect.factory.FactoryImpl;
import spoon.support.DefaultCoreFactory;
import spoon.support.StandardEnvironment;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;

import java.io.File;
import java.io.IOException;

/**
 * Created by Simon on 18/04/14.
 */
public class Main {
    private String dirOriginal;
    private String varToExclude;
    private String dirSosie;

    public static void main(String[] args) throws Exception {
        new DiversifyProperties(args[0]);
        Main clm = new Main();
        clm.init();
    }

    protected void init() throws Exception {

        initLogLevel();
//        try {
//            if(DiversifyProperties.getProperty("builder").equals("maven")) {
//                MavenDependencyResolver t = new MavenDependencyResolver();
//                t.DependencyResolver(DiversifyProperties.getProperty("project") + "/pom.xml");
//            }
//        } catch (Exception e) {}
//
//        initSpoon();

        dirOriginal = DiversifyProperties.getProperty("dirOriginal");
        dirSosie = DiversifyProperties.getProperty("dirSosie");
//        varToExclude = DiversifyProperties.getProperty("varToExclude");

//        if(DiversifyProperties.getProperty("logTrace").equals("same"))
//            same();
//        else
            diff();
    }


    protected void diff() throws Exception {
        Log.debug("loading log from dir {}",dirSosie);
        try {
            CompareAllStackTrace un = new CompareAllStackTrace(dirOriginal, dirSosie);
//            un.setSyncroRange(Integer.parseInt(DiversifyProperties.getProperty("syncroRange")));

            un.findDiff();
//            allDiff.addAll(un.getDiffs());

        } catch (Exception e) {
            Log.error("error",e);
            e.printStackTrace();
        }
    }


    protected void initSpoon() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String srcDirectory = DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("src");

        StandardEnvironment env = new StandardEnvironment();
        int javaVersion = Integer.parseInt(DiversifyProperties.getProperty("javaVersion"));
        env.setComplianceLevel(javaVersion);
        env.setVerbose(true);
        env.setDebug(true);

        DefaultCoreFactory f = new DefaultCoreFactory();
        Factory factory = new FactoryImpl(f, env);
        SpoonCompiler c = new JDTBasedSpoonCompiler(factory);

        for (String dir : srcDirectory.split(System.getProperty("path.separator")))
            try {
                c.addInputSource(new File(dir));
            } catch (IOException e) {
                Log.error("error in initSpoon", e);
            }
        try {
            c.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(DiversifyProperties.getProperty("logLevel"));
        Log.set(level);
    }
}
