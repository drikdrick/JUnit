/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author COMMAND'17
 */
public class JUnitIntro_Test4 {
    public JUnitIntro_Test4() {
    }
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }
    /**
    * Test of addDouble method, of class JUnitIntro.
    */
    @Test
    public void testAddDouble() {
    System.out.println("addDouble");
    double n1 = 5.03;
    double n2 = 2.09;
    JUnit_Introduction instance = new JUnit_Introduction();
    double expResult = 7.12;
    double result = instance.addDouble(n1, n2);
    assertEquals(expResult, result, 0.0);
    }
    /**
    * Test of addString method, of class JUnitIntro.
    */
    @Test
    public void testAddString() {
    System.out.println("addString");
    String s1 = "JUnit";
    String s2 = " for TDD";
    JUnit_Introduction instance = new JUnit_Introduction();
    String expResult = "JUnit for TDD";
    String result = instance.addString(s1, s2);
    assertEquals(expResult, result);
    }
    /**
    * Test of addInt method, of class JUnitIntro.
    */
    @Test
    public void testAddInt() {
    System.out.println("addInt");
    int n1 = 2;
    int n2 = 8;
    JUnit_Introduction instance = new JUnit_Introduction();
    int expResult = 10;
    int result = instance.addInt(n1, n2);
    assertEquals(expResult, result);
    }
    /**
    * Test of isOdd method, of class JUnitIntro.
    */
    @Test
    public void testIsOdd() {
    System.out.println("isOdd");
    int number = 10;
    JUnit_Introduction instance = new JUnit_Introduction();
    boolean expResult = false;
    boolean result = instance.isOdd(number);
    assertEquals(expResult, result);
    }
    /**
    * Test of isEven method, of class JUnitIntro.
    */
    @Test
    public void testIsEven() {
    System.out.println("isEven");
    int number = 142;
    JUnit_Introduction instance = new JUnit_Introduction();
    boolean expResult = true;
    boolean result = instance.isEven(number);
    assertEquals(expResult, result);
    }

}
