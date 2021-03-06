package org.apache.commons.io;

import org.junit.After;
import java.util.ArrayList;
import org.junit.Before;
import java.io.BufferedReader;
import java.io.File;
import org.apache.commons.io.testtools.FileBasedTestCase;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.io.Reader;
import java.io.StringReader;
import org.junit.Test;
import java.nio.charset.UnsupportedCharsetException;

/** 
 * This is used to test LineIterator for correctness.
 * 
 * @version $Id$
 */
public class LineIteratorTestCase extends FileBasedTestCase {
    public LineIteratorTestCase(String name) {
        super(name);
    }

    private void assertLines(List<java.lang.String> lines, LineIterator iterator) {
        try {
            for (int i = 0 ; i < (lines.size()) ; i++) {
                String line = iterator.nextLine();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,("nextLine() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,lines,5703,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,iterator,5706,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
        }
    }

    /** 
     * Creates a test file with a specified number of lines.
     */
private List<java.lang.String> createLinesFile(File file, int lineCount) throws Exception {
        List<java.lang.String> lines = createStringLines(lineCount);
        org.apache.commons.io.FileUtils.writeLines(file, lines);
        return lines;
    }

    /** 
     * Creates a test file with a specified number of lines.
     */
private List<java.lang.String> createLinesFile(File file, String encoding, int lineCount) throws Exception {
        List<java.lang.String> lines = createStringLines(lineCount);
        org.apache.commons.io.FileUtils.writeLines(file, encoding, lines);
        return lines;
    }

    /** 
     * Creates String data lines.
     * 
     * @param lineCount
     * @return a new lines list.
     */
private List<java.lang.String> createStringLines(int lineCount) {
        List<java.lang.String> lines = new ArrayList<java.lang.String>();
        for (int i = 0 ; i < lineCount ; i++) {
            lines.add(("LINE " + i));
        }
        return lines;
    }

    /** 
     * @see junit.framework.TestCase#setUp()
     */
@Override
    @Before
    protected void setUp() throws Exception {
        File dir = FileBasedTestCase.getTestDirectory();
        if (dir.exists()) {
            org.apache.commons.io.FileUtils.deleteDirectory(dir);
        } 
        dir.mkdirs();
    }

    /** 
     * @see junit.framework.TestCase#tearDown()
     */
@Override
    @After
    protected void tearDown() throws Exception {
        org.apache.commons.io.FileUtils.deleteDirectory(FileBasedTestCase.getTestDirectory());
    }

    /** 
     * Test constructor.
     */
@Test
    public void testConstructor() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructor");
        try {
            new LineIterator(((Reader)(null)));
        } catch (IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with no lines.
     */
@Test(timeout = 1000)
    public void testZeroLines_add2097() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLines_add2097");
        doTestFileWithSpecifiedLines(0);
        doTestFileWithSpecifiedLines(0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with no lines.
     */
@Test
    public void testZeroLines() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLines");
        doTestFileWithSpecifiedLines(1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with no lines.
     */
@Test
    public void testZeroLines_literalMutation6868() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLines_literalMutation6868");
        doTestFileWithSpecifiedLines(-1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with no lines.
     */
@Test
    public void testZeroLines_literalMutation6869() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLines_literalMutation6869");
        doTestFileWithSpecifiedLines(0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with no lines.
     */
@Test(timeout = 1000)
    public void testZeroLines_remove1528() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroLines_remove1528");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 1 line.
     */
@Test(timeout = 1000)
    public void testOneLines_add2092() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOneLines_add2092");
        doTestFileWithSpecifiedLines(1);
        doTestFileWithSpecifiedLines(1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 1 line.
     */
@Test
    public void testOneLines() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOneLines");
        doTestFileWithSpecifiedLines(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 1 line.
     */
@Test
    public void testOneLines_literalMutation6849() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOneLines_literalMutation6849");
        doTestFileWithSpecifiedLines(0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 1 line.
     */
@Test
    public void testOneLines_literalMutation6850() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOneLines_literalMutation6850");
        doTestFileWithSpecifiedLines(0);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 1 line.
     */
@Test(timeout = 1000)
    public void testOneLines_remove1524() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOneLines_remove1524");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 2 lines.
     */
@Test(timeout = 1000)
    public void testTwoLines_add2094() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoLines_add2094");
        doTestFileWithSpecifiedLines(2);
        doTestFileWithSpecifiedLines(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 2 lines.
     */
@Test
    public void testTwoLines() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoLines");
        doTestFileWithSpecifiedLines(1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 2 lines.
     */
@Test
    public void testTwoLines_literalMutation6856() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoLines_literalMutation6856");
        doTestFileWithSpecifiedLines(4);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 2 lines.
     */
@Test
    public void testTwoLines_literalMutation6857() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoLines_literalMutation6857");
        doTestFileWithSpecifiedLines(3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 2 lines.
     */
@Test(timeout = 1000)
    public void testTwoLines_remove1526() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoLines_remove1526");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 3 lines.
     */
@Test(timeout = 1000)
    public void testThreeLines_add2093() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLines_add2093");
        doTestFileWithSpecifiedLines(3);
        doTestFileWithSpecifiedLines(3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 3 lines.
     */
@Test
    public void testThreeLines() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLines");
        doTestFileWithSpecifiedLines(4);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 3 lines.
     */
@Test
    public void testThreeLines_literalMutation6852() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLines_literalMutation6852");
        doTestFileWithSpecifiedLines(2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 3 lines.
     */
@Test
    public void testThreeLines_literalMutation6853() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLines_literalMutation6853");
        doTestFileWithSpecifiedLines(1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 3 lines.
     */
@Test
    public void testThreeLines_literalMutation6854() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLines_literalMutation6854");
        doTestFileWithSpecifiedLines(6);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with 3 lines.
     */
@Test(timeout = 1000)
    public void testThreeLines_remove1525() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLines_remove1525");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a missing File.
     */
@Test(timeout = 1000)
    public void testMissingFile_add2085() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingFile_add2085");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "dummy-missing-file.txt");
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, "UTF-8");
        } catch (FileNotFoundException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a missing File.
     */
@Test
    public void testMissingFile() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingFile");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "bar");
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, "UTF-8");
        } catch (FileNotFoundException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a missing File.
     */
@Test
    public void testMissingFile_literalMutation6819() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMissingFile_literalMutation6819");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "dummy-missing-file.txt");
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, "foo");
        } catch (FileNotFoundException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test(timeout = 1000)
    public void testValidEncoding_add2095() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_add2095");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 3);
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test(timeout = 1000)
    public void testValidEncoding_add2096() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_add2096");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test
    public void testValidEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding");
        String encoding = "foo";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test
    public void testValidEncoding_literalMutation6859() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_literalMutation6859");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "foo");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test
    public void testValidEncoding_literalMutation6860() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_literalMutation6860");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 4);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test
    public void testValidEncoding_literalMutation6861() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_literalMutation6861");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 2);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test
    public void testValidEncoding_literalMutation6862() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_literalMutation6862");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 1);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test
    public void testValidEncoding_literalMutation6863() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_literalMutation6863");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 6);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test
    public void testValidEncoding_literalMutation6864() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_literalMutation6864");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 1;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test
    public void testValidEncoding_literalMutation6865() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_literalMutation6865");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = -1;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test
    public void testValidEncoding_literalMutation6866() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_literalMutation6866");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with a Valid encoding.
     */
@Test(timeout = 1000)
    public void testValidEncoding_remove1527() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidEncoding_remove1527");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-validEncoding.txt");
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            int count = 0;
            while (iterator.hasNext()) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,iterator,5739,iterator.next());
                count++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,count);
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test(timeout = 1000)
    public void testInvalidEncoding_add2083() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_add2083");
        String encoding = "XXXXXXXX";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-invalidEncoding.txt");
        createLinesFile(testFile, "UTF-8", 3);
        createLinesFile(testFile, "UTF-8", 3);
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test(timeout = 1000)
    public void testInvalidEncoding_add2084() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_add2084");
        String encoding = "XXXXXXXX";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-invalidEncoding.txt");
        createLinesFile(testFile, "UTF-8", 3);
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test
    public void testInvalidEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding");
        String encoding = "bar";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-invalidEncoding.txt");
        createLinesFile(testFile, "UTF-8", 3);
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test
    public void testInvalidEncoding_literalMutation6810() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation6810");
        String encoding = "XXXXXXXX";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "foo");
        createLinesFile(testFile, "UTF-8", 3);
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test
    public void testInvalidEncoding_literalMutation6811() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation6811");
        String encoding = "XXXXXXXX";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-invalidEncoding.txt");
        createLinesFile(testFile, "foo", 3);
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test
    public void testInvalidEncoding_literalMutation6812() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation6812");
        String encoding = "XXXXXXXX";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-invalidEncoding.txt");
        createLinesFile(testFile, "UTF-8", 4);
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test
    public void testInvalidEncoding_literalMutation6813() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation6813");
        String encoding = "XXXXXXXX";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-invalidEncoding.txt");
        createLinesFile(testFile, "UTF-8", 2);
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test
    public void testInvalidEncoding_literalMutation6814() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation6814");
        String encoding = "XXXXXXXX";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-invalidEncoding.txt");
        createLinesFile(testFile, "UTF-8", 1);
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test
    public void testInvalidEncoding_literalMutation6815() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_literalMutation6815");
        String encoding = "XXXXXXXX";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-invalidEncoding.txt");
        createLinesFile(testFile, "UTF-8", 6);
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test a file with an Invalid encoding.
     */
@Test(timeout = 1000)
    public void testInvalidEncoding_remove1519() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidEncoding_remove1519");
        String encoding = "XXXXXXXX";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-invalidEncoding.txt");
        LineIterator iterator = null;
        try {
            iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        } catch (UnsupportedCharsetException expected) {
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test(timeout = 1000)
    public void testNextLineOnlyDefaultEncoding_add2086() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyDefaultEncoding_add2086");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile);
        assertLines(lines, iterator);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyDefaultEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyDefaultEncoding");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "foo");
        List<java.lang.String> lines = createLinesFile(testFile, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyDefaultEncoding_literalMutation6821() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyDefaultEncoding_literalMutation6821");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, 4);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyDefaultEncoding_literalMutation6822() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyDefaultEncoding_literalMutation6822");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, 2);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyDefaultEncoding_literalMutation6823() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyDefaultEncoding_literalMutation6823");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, 1);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyDefaultEncoding_literalMutation6824() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyDefaultEncoding_literalMutation6824");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, 6);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test(timeout = 1000)
    public void testNextLineOnlyDefaultEncoding_remove1520() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyDefaultEncoding_remove1520");
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test(timeout = 1000)
    public void testNextLineOnlyNullEncoding_add2087() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyNullEncoding_add2087");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyNullEncoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyNullEncoding");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "foo");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyNullEncoding_literalMutation6827() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyNullEncoding_literalMutation6827");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 4);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyNullEncoding_literalMutation6828() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyNullEncoding_literalMutation6828");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 2);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyNullEncoding_literalMutation6829() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyNullEncoding_literalMutation6829");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 1);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyNullEncoding_literalMutation6830() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyNullEncoding_literalMutation6830");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 6);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test(timeout = 1000)
    public void testNextLineOnlyNullEncoding_remove1521() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyNullEncoding_remove1521");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test(timeout = 1000)
    public void testNextLineOnlyUtf8Encoding_add2088() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyUtf8Encoding_add2088");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyUtf8Encoding() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyUtf8Encoding");
        String encoding = "bar";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyUtf8Encoding_literalMutation6832() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyUtf8Encoding_literalMutation6832");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "foo");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyUtf8Encoding_literalMutation6833() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyUtf8Encoding_literalMutation6833");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 4);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyUtf8Encoding_literalMutation6834() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyUtf8Encoding_literalMutation6834");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 2);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyUtf8Encoding_literalMutation6835() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyUtf8Encoding_literalMutation6835");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 1);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test
    public void testNextLineOnlyUtf8Encoding_literalMutation6836() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyUtf8Encoding_literalMutation6836");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 6);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        assertLines(lines, iterator);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the nextLine() method.
     */
@Test(timeout = 1000)
    public void testNextLineOnlyUtf8Encoding_remove1522() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextLineOnlyUtf8Encoding_remove1522");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the next() method.
     */
@Test(timeout = 1000)
    public void testNextOnly_add2089() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextOnly_add2089");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            for (int i = 0 ; i < (lines.size()) ; i++) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,("next() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,lines,5734,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,iterator,5737,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the next() method.
     */
@Test
    public void testNextOnly() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextOnly");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "bar");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            for (int i = 0 ; i < (lines.size()) ; i++) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,("next() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,lines,5734,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,iterator,5737,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the next() method.
     */
@Test
    public void testNextOnly_literalMutation6839() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextOnly_literalMutation6839");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 4);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            for (int i = 0 ; i < (lines.size()) ; i++) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,("next() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,lines,5734,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,iterator,5737,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the next() method.
     */
@Test
    public void testNextOnly_literalMutation6840() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextOnly_literalMutation6840");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 2);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            for (int i = 0 ; i < (lines.size()) ; i++) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,("next() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,lines,5734,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,iterator,5737,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the next() method.
     */
@Test
    public void testNextOnly_literalMutation6841() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextOnly_literalMutation6841");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 1);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            for (int i = 0 ; i < (lines.size()) ; i++) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,("next() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,lines,5734,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,iterator,5737,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the next() method.
     */
@Test
    public void testNextOnly_literalMutation6842() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextOnly_literalMutation6842");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 6);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            for (int i = 0 ; i < (lines.size()) ; i++) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,("next() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,lines,5734,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,iterator,5737,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the next() method.
     */
@Test
    public void testNextOnly_literalMutation6843() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextOnly_literalMutation6843");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            for (int i = 1 ; i < (lines.size()) ; i++) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,("next() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,lines,5734,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,iterator,5737,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the next() method.
     */
@Test
    public void testNextOnly_literalMutation6844() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextOnly_literalMutation6844");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            for (int i = -1 ; i < (lines.size()) ; i++) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,("next() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,lines,5734,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,iterator,5737,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the iterator using only the next() method.
     */
@Test
    public void testNextOnly_literalMutation6845() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextOnly_literalMutation6845");
        String encoding = null;
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-nextOnly.txt");
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            for (int i = 0 ; i < (lines.size()) ; i++) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,("next() line " + i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,lines,5734,lines.get(i));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,line);
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,iterator,5737,iterator.hasNext());
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests hasNext when it throws an exception.
     */
@Test(timeout = 1000)
    public void testNextWithException_add2090() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextWithException_add2090");
        Reader reader = new BufferedReader(new StringReader("")) {
            @Override
            public String readLine() throws IOException {
                throw new IOException("hasNext");
            }
        };
        try {
            new LineIterator(reader).hasNext();
        } catch (IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests hasNext when it throws an exception.
     */
@Test(timeout = 1000)
    public void testNextWithException_add2091() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextWithException_add2091");
        Reader reader = new BufferedReader(new StringReader("")) {
            @Override
            public String readLine() throws IOException {
                throw new IOException("hasNext");
            }
        };
        try {
            new LineIterator(reader).hasNext();
            new LineIterator(reader).hasNext();
        } catch (IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests hasNext when it throws an exception.
     */
@Test
    public void testNextWithException() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextWithException");
        Reader reader = new BufferedReader(new StringReader("bar")) {
            @Override
            public String readLine() throws IOException {
                throw new IOException("hasNext");
            }
        };
        try {
            new LineIterator(reader).hasNext();
        } catch (IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests hasNext when it throws an exception.
     */
@Test
    public void testNextWithException_literalMutation6847() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextWithException_literalMutation6847");
        Reader reader = new BufferedReader(new StringReader("")) {
            @Override
            public String readLine() throws IOException {
                throw new IOException("bar");
            }
        };
        try {
            new LineIterator(reader).hasNext();
        } catch (IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests hasNext when it throws an exception.
     */
@Test(timeout = 1000)
    public void testNextWithException_remove1523() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNextWithException_remove1523");
        Reader reader = new BufferedReader(new StringReader("")) {
            @Override
            public String readLine() throws IOException {
                throw new IOException("hasNext");
            }
        };
        try {
            new LineIterator(reader).hasNext();
        } catch (IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test(timeout = 1000)
    public void testCloseEarly_add2068() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_add2068");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 3);
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test(timeout = 1000)
    public void testCloseEarly_add2069() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_add2069");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test(timeout = 1000)
    public void testCloseEarly_add2070() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_add2070");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test(timeout = 1000)
    public void testCloseEarly_add2071() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_add2071");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test(timeout = 1000)
    public void testCloseEarly_add2072() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_add2072");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test(timeout = 1000)
    public void testCloseEarly_add2073() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_add2073");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test(timeout = 1000)
    public void testCloseEarly_add2074() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_add2074");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test(timeout = 1000)
    public void testCloseEarly_add2075() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_add2075");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test
    public void testCloseEarly() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly");
        String encoding = "bar";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test
    public void testCloseEarly_literalMutation6764() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_literalMutation6764");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "bar");
        createLinesFile(testFile, encoding, 3);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test
    public void testCloseEarly_literalMutation6765() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_literalMutation6765");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 4);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test
    public void testCloseEarly_literalMutation6766() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_literalMutation6766");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 2);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test
    public void testCloseEarly_literalMutation6767() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_literalMutation6767");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 1);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test
    public void testCloseEarly_literalMutation6768() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_literalMutation6768");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        createLinesFile(testFile, encoding, 6);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test closing the iterator before all the file has been processed.
     */
@Test(timeout = 1000)
    public void testCloseEarly_remove1515() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCloseEarly_remove1515");
        String encoding = "UTF-8";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , "LineIterator-closeEarly.txt");
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5718,iterator,5717,iterator.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,iterator,5719,iterator.hasNext());
            iterator.close();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,iterator,5721,iterator.hasNext());
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
            iterator.close();
            try {
                iterator.next();
            } catch (NoSuchElementException ex) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException ex) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Utility method to create and test a file with a specified number of lines.
     */
private void doTestFileWithSpecifiedLines(int lineCount) throws Exception {
        String encoding = "UTF-8";
        String fileName = ("LineIterator-" + lineCount) + "-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, lineCount);
        LineIterator iterator = org.apache.commons.io.FileUtils.lineIterator(testFile, encoding);
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,lines,5709,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,(idx < (lines.size())));
                idx++;
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,lines,5715,lines.size());
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
    }

    @Test
    public void testFilteringFileReader() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringFileReader");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new FileReader(testFile);
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilteringFileReader_add2082() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringFileReader_add2082");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new FileReader(testFile);
        testFiltering(lines, reader);
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringFileReader_literalMutation6803() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringFileReader_literalMutation6803");
        String encoding = "bar";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new FileReader(testFile);
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringFileReader_literalMutation6804() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringFileReader_literalMutation6804");
        String encoding = "UTF-8";
        String fileName = "foo";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new FileReader(testFile);
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringFileReader_literalMutation6805() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringFileReader_literalMutation6805");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 8);
        Reader reader = new FileReader(testFile);
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringFileReader_literalMutation6806() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringFileReader_literalMutation6806");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 4);
        Reader reader = new FileReader(testFile);
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringFileReader_literalMutation6807() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringFileReader_literalMutation6807");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 18);
        Reader reader = new FileReader(testFile);
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringFileReader_literalMutation6808() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringFileReader_literalMutation6808");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 10);
        Reader reader = new FileReader(testFile);
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilteringFileReader_remove1518() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringFileReader_remove1518");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new FileReader(testFile);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringBufferedReader() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringBufferedReader");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new BufferedReader(new FileReader(testFile));
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilteringBufferedReader_add2081() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringBufferedReader_add2081");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new BufferedReader(new FileReader(testFile));
        testFiltering(lines, reader);
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringBufferedReader_literalMutation6797() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringBufferedReader_literalMutation6797");
        String encoding = "bar";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new BufferedReader(new FileReader(testFile));
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringBufferedReader_literalMutation6798() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringBufferedReader_literalMutation6798");
        String encoding = "UTF-8";
        String fileName = "bar";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new BufferedReader(new FileReader(testFile));
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringBufferedReader_literalMutation6799() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringBufferedReader_literalMutation6799");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 8);
        Reader reader = new BufferedReader(new FileReader(testFile));
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringBufferedReader_literalMutation6800() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringBufferedReader_literalMutation6800");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 4);
        Reader reader = new BufferedReader(new FileReader(testFile));
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringBufferedReader_literalMutation6801() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringBufferedReader_literalMutation6801");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 18);
        Reader reader = new BufferedReader(new FileReader(testFile));
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testFilteringBufferedReader_literalMutation6802() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringBufferedReader_literalMutation6802");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 10);
        Reader reader = new BufferedReader(new FileReader(testFile));
        testFiltering(lines, reader);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFilteringBufferedReader_remove1517() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFilteringBufferedReader_remove1517");
        String encoding = "UTF-8";
        String fileName = "LineIterator-Filter-test.txt";
        File testFile = new File(FileBasedTestCase.getTestDirectory() , fileName);
        List<java.lang.String> lines = createLinesFile(testFile, encoding, 9);
        Reader reader = new BufferedReader(new FileReader(testFile));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testFiltering_add2076(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_add2076");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testFiltering_add2077(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_add2077");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testFiltering_add2078(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_add2078");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testFiltering_add2079(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_add2079");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testFiltering_add2080(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_add2080");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 2));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6771(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6771");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 0));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6772(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6772");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 0));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6773(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6773");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 47) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6774(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6774");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 49) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6775(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6775");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 24) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6776(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6776");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 96) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6777(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6777");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 4) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6778(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6778");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 2) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6779(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6779");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 1) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6780(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6780");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 6) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6781(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6781");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 2;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6782(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6782");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 0;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6783(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6783");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 0;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6784(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6784");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 1;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6785(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6785");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = -1;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6786(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6786");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6787(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6787");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 1;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6788(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6788");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = -1;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6789(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6789");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6790(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6790");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 4) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6791(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6791");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 2) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6792(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6792");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 1) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6793(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6793");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 6) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6794(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6794");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 2) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6795(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6795");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 0) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testFiltering_literalMutation6796(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_literalMutation6796");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 0) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    private void testFiltering_remove1516(List<java.lang.String> lines, Reader reader) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFiltering_remove1516");
        LineIterator iterator = new LineIterator(reader) {
            @Override
            protected boolean isValidLine(String line) {
                char c = line.charAt(((line.length()) - 1));
                return ((c - 48) % 3) != 1;
            }
        };
        try {
            try {
                iterator.remove();
            } catch (UnsupportedOperationException ex) {
            }
            int idx = 0;
            int actualLines = 0;
            while (iterator.hasNext()) {
                String line = iterator.next();
                actualLines++;
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,("Comparing line " + idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,lines,5724,lines.get(idx));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,line);
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,((("Exceeded expected idx=" + idx) + " size=") + (lines.size())));
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,(idx < (lines.size())));
                idx++;
                if ((idx % 3) == 1) {
                    idx++;
                } 
            }
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,lines,5729,lines.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,idx);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,actualLines);
            try {
                iterator.next();
            } catch (NoSuchElementException expected) {
            }
            try {
                iterator.nextLine();
            } catch (NoSuchElementException expected) {
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

