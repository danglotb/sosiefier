/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.map.FixedSizeMap;
import org.junit.BeforeClass;

public class FixedSizeMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.remove(Ljava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.map.FixedSizeMap.fixedSizeMap(Ljava/util/Map;)Lorg/apache/commons/collections4/map/FixedSizeMap;: root-Branch
   * 3 org.apache.commons.collections4.map.FixedSizeMap.<init>(Ljava/util/Map;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(67,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test0");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<HashMap<String, Integer>, Integer> hashMap1 = new HashMap<HashMap<String, Integer>, Integer>();
      FixedSizeMap<HashMap<String, Integer>, Integer> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<HashMap<String, Integer>, Integer>) hashMap1);
      // Undeclared exception!
      try {
        fixedSizeMap0.remove((Object) hashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Map is fixed size
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.values()Ljava/util/Collection;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(68,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test1");
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      FixedSizeMap<Integer, String> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Integer, String>) hashMap0);
      Collection<String> collection0 = fixedSizeMap0.values();
      assertEquals(0, collection0.size());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.keySet()Ljava/util/Set;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(69,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test2");
      HashMap<Integer, HashMap<Object, String>> hashMap0 = new HashMap<Integer, HashMap<Object, String>>();
      FixedSizeMap<Integer, HashMap<Object, String>> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Integer, HashMap<Object, String>>) hashMap0);
      Set<Integer> set0 = fixedSizeMap0.keySet();
      assertEquals(true, set0.isEmpty());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.isFull()Z: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(70,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test3");
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      FixedSizeMap<String, Integer> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<String, Integer>) hashMap0);
      boolean boolean0 = fixedSizeMap0.isFull();
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.maxSize()I: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(71,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test4");
      HashMap<HashMap<Integer, Integer>, String> hashMap0 = new HashMap<HashMap<Integer, Integer>, String>();
      FixedSizeMap<HashMap<Integer, Integer>, String> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<HashMap<Integer, Integer>, String>) hashMap0);
      int int0 = fixedSizeMap0.maxSize();
      assertEquals(0, int0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.entrySet()Ljava/util/Set;: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(72,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test5");
      HashMap<Integer, HashMap<Object, String>> hashMap0 = new HashMap<Integer, HashMap<Object, String>>();
      FixedSizeMap<Integer, HashMap<Object, String>> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Integer, HashMap<Object, String>>) hashMap0);
      Set<Map.Entry<Integer, HashMap<Object, String>>> set0 = (Set<Map.Entry<Integer, HashMap<Object, String>>>)fixedSizeMap0.entrySet();
      assertEquals(true, set0.isEmpty());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.clear()V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(73,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test6");
      HashMap<HashMap<Object, Integer>, Object> hashMap0 = new HashMap<HashMap<Object, Integer>, Object>();
      FixedSizeMap<HashMap<Object, Integer>, Object> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<HashMap<Object, Integer>, Object>) hashMap0);
      // Undeclared exception!
      try {
        fixedSizeMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Map is fixed size
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I6 Branch 1 IFGT L117 - true
   */

  @Test
  public void test7()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(74,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test7");
      HashMap<HashMap<Integer, String>, HashMap<String, Integer>> hashMap0 = new HashMap<HashMap<Integer, String>, HashMap<String, Integer>>();
      FixedSizeMap<HashMap<Integer, String>, HashMap<String, Integer>> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<HashMap<Integer, String>, HashMap<String, Integer>>) hashMap0);
      HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
      HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
      hashMap0.put(hashMap1, hashMap2);
      fixedSizeMap0.put(hashMap1, (HashMap<String, Integer>) null);
      assertEquals(1, hashMap0.size());
      assertEquals("{{}=null}", fixedSizeMap0.toString());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;: I6 Branch 1 IFGT L117 - false
   */

  @Test
  public void test8()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(75,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test8");
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      HashMap<HashMap<Integer, Integer>, String> hashMap1 = new HashMap<HashMap<Integer, Integer>, String>();
      HashMap<String, HashMap<Integer, Object>> hashMap2 = new HashMap<String, HashMap<Integer, Object>>();
      FixedSizeMap<String, HashMap<Integer, Object>> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<String, HashMap<Integer, Object>>) hashMap2);
      fixedSizeMap0.toString();
      FixedSizeMap<HashMap<Integer, Integer>, String> fixedSizeMap1 = FixedSizeMap.fixedSizeMap((Map<HashMap<Integer, Integer>, String>) hashMap1);
      // Undeclared exception!
      try {
        fixedSizeMap1.put(hashMap0, "{}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot put new key/value pair - Map is fixed size
         //
      }
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.map.FixedSizeMap.putAll(Ljava/util/Map;)V: I9 Branch 2 IFEQ L125 - false
   * 2 org.apache.commons.collections4.map.FixedSizeMap.putAll(Ljava/util/Map;)V: I18 Branch 3 IFNE L126 - true
   * 3 org.apache.commons.collections4.map.FixedSizeMap.fixedSizeMap(Ljava/util/Map;)Lorg/apache/commons/collections4/map/FixedSizeMap;: root-Branch
   * 4 org.apache.commons.collections4.map.FixedSizeMap.<init>(Ljava/util/Map;)V: root-Branch
   * 5 org.apache.commons.collections4.map.FixedSizeMap.putAll(Ljava/util/Map;)V: I9 Branch 2 IFEQ L125 - true
   */

  @Test
  public void test9()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(76,"org.apache.commons.collections4.map.FixedSizeMapEvoSuiteTest.test9");
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      hashMap0.put((Integer) null, (Integer) null);
      FixedSizeMap<Integer, Integer> fixedSizeMap0 = FixedSizeMap.fixedSizeMap((Map<Integer, Integer>) hashMap0);
      fixedSizeMap0.putAll((Map<? extends Integer, ? extends Integer>) hashMap0);
      assertEquals(1, hashMap0.size());
  }
}