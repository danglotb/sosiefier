package org.apache.commons.codec.language.bm;

import java.util.Map;
import org.junit.Test;
import java.util.TreeMap;

/** 
 * Tests PhoneticEngine and Languages.LanguageSet in ways very similar to code found in solr-3.6.0.
 * 
 * @since 1.7
 */
public class PhoneticEngineRegressionTest {
    @Test(timeout = 1000)
    public void testSolrGENERIC_add103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_add103");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_add104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_add104");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_add105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_add105");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_add106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_add106");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_add107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_add107");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_add108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_add108");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_add109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_add109");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_add110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_add110");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_add111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_add111");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("foo", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation270");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation271");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("foo", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation272");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation273");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("foo", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation274");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation275");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("bar", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation276");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation277");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("bar", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation278() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation278");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation279() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation279");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("bar", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation280");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation281");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("foo", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation282() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation282");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation283");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("foo", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation284");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation285() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation285");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("foo", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrGENERIC_literalMutation286() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_literalMutation286");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_remove86() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_remove86");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_remove87() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_remove87");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_remove88() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_remove88");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_remove89() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_remove89");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_remove90() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_remove90");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_remove91() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_remove91");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_remove92() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_remove92");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_remove93() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_remove93");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrGENERIC_remove94() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrGENERIC_remove94");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),266,null,265,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),268,null,267,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),270,null,269,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),272,null,271,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),274,null,273,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),276,null,275,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),278,null,277,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),280,null,279,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),282,null,281,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),284,null,283,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),286,null,285,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),288,null,287,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),290,null,289,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),292,null,291,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),294,null,293,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),296,null,295,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),298,null,297,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),300,null,299,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),302,null,301,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),304,null,303,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add100");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add101");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add102");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add91() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add91");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add92() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add92");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add93() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add93");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add94() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add94");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add95() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add95");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add96() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add96");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add97() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add97");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add98() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add98");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_add99() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_add99");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("foo", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation246");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation247");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("bar", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation248");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation249() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation249");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("bar", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation250");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation251");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("bar", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation252");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation253");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("bar", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation254");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation255() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation255");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("bar", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation256");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation257");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("foo", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation258");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation259");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("foo", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation260");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation261");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("foo", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation262");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation263");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("foo", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation264");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation265");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("bar", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation266");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation267");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("foo", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrASHKENAZI_literalMutation268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_literalMutation268");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove74() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove74");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove75() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove75");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove76() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove76");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove77() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove77");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove78() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove78");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove79() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove79");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove80() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove80");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove81() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove81");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove82() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove82");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove83() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove83");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove84() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove84");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrASHKENAZI_remove85() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrASHKENAZI_remove85");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),226,null,225,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),228,null,227,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),230,null,229,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),232,null,231,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),234,null,233,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),236,null,235,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),238,null,237,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),240,null,239,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),242,null,241,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),244,null,243,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),246,null,245,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),248,null,247,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),250,null,249,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),252,null,251,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),254,null,253,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "ASHKENAZI");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),256,null,255,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),258,null,257,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),260,null,259,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),262,null,261,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),264,null,263,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add112");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add113");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add114");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add115");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add116");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add117");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add118");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add119");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add120");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add121");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add122");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_add123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_add123");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("foo", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation288() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation288");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation289() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation289");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("foo", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation290() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation290");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation291");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("bar", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation292");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation293() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation293");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("bar", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation294");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation295");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("bar", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation296() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation296");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation297() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation297");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("bar", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation298() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation298");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation299() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation299");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("foo", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation300");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation301");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("bar", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation302");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation303() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation303");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("bar", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation304() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation304");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation305() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation305");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("bar", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation306() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation306");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation307() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation307");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("bar", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation308() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation308");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation309() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation309");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("foo", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testSolrSEPHARDIC_literalMutation310() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_literalMutation310");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove100");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove101");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove102");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove103");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove104");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove105");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove106");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove95() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove95");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove96() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove96");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove97() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove97");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove98() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove98");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSolrSEPHARDIC_remove99() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSolrSEPHARDIC_remove99");
        Map<java.lang.String, java.lang.String> args;
        args = new TreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),306,null,305,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),308,null,307,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),310,null,309,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),312,null,311,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),314,null,313,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),316,null,315,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "EXACT");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),318,null,317,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),320,null,319,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),322,null,321,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),324,null,323,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),326,null,325,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),328,null,327,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),330,null,329,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),332,null,331,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),334,null,333,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "1234"));
        args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "SEPHARDIC");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),336,null,335,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),338,null,337,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),340,null,339,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "D\'Angelo"));
        args.put("languageSet", "italian,greek,spanish");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),342,null,341,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "Angelo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),344,null,343,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, false, "1234"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCompatibilityWithOriginalVersion_add87() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_add87");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("nameType", "GENERIC");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCompatibilityWithOriginalVersion_add88() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_add88");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("ruleType", "APPROX");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCompatibilityWithOriginalVersion_add89() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_add89");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCompatibilityWithOriginalVersion_add90() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_add90");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCompatibilityWithOriginalVersion() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("bar", "GENERIC");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCompatibilityWithOriginalVersion_literalMutation238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_literalMutation238");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "bar");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCompatibilityWithOriginalVersion_literalMutation239() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_literalMutation239");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("bar", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCompatibilityWithOriginalVersion_literalMutation240() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_literalMutation240");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("ruleType", "bar");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCompatibilityWithOriginalVersion_literalMutation241() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_literalMutation241");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("bar", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCompatibilityWithOriginalVersion_literalMutation242() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_literalMutation242");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "foo");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCompatibilityWithOriginalVersion_literalMutation243() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_literalMutation243");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("foo", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testCompatibilityWithOriginalVersion_literalMutation244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_literalMutation244");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("nameType", "GENERIC");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCompatibilityWithOriginalVersion_remove70() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_remove70");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCompatibilityWithOriginalVersion_remove71() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_remove71");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCompatibilityWithOriginalVersion_remove72() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_remove72");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCompatibilityWithOriginalVersion_remove73() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompatibilityWithOriginalVersion_remove73");
        Map<java.lang.String, java.lang.String> args = new TreeMap<java.lang.String, java.lang.String>();
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),218,null,217,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),220,null,219,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Bendzin"));
        args.put("nameType", "ASHKENAZI");
        args.put("ruleType", "APPROX");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),222,null,221,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "abram"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),224,null,223,org.apache.commons.codec.language.bm.PhoneticEngineRegressionTest.encode(args, true, "Halpern"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This code is similar in style to code found in Solr:
     * solr/core/src/java/org/apache/solr/analysis/BeiderMorseFilterFactory.java
     * 
     * Making a JUnit test out of it to protect Solr from possible future
     * regressions in Commons-Codec.
     */
private static String encode(final Map<java.lang.String, java.lang.String> args, final boolean concat, final String input) {
        Languages.LanguageSet languageSet;
        PhoneticEngine engine;
        final String nameTypeArg = args.get("nameType");
        final NameType nameType = nameTypeArg == null ? NameType.GENERIC : NameType.valueOf(nameTypeArg);
        final String ruleTypeArg = args.get("ruleType");
        final RuleType ruleType = ruleTypeArg == null ? RuleType.APPROX : RuleType.valueOf(ruleTypeArg);
        engine = new PhoneticEngine(nameType , ruleType , concat);
        final String languageSetArg = args.get("languageSet");
        if ((languageSetArg == null) || (languageSetArg.equals("auto"))) {
            languageSet = null;
        } else {
            languageSet = Languages.LanguageSet.from(new java.util.HashSet<java.lang.String>(java.util.Arrays.asList(languageSetArg.split(","))));
        }
        if (languageSet == null) {
            return engine.encode(input);
        } else {
            return engine.encode(input, languageSet);
        }
    }
}

