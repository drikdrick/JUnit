/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitTask;

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
public class Reverse_2Test3 {
    
    public Reverse_2Test3() {
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
     * Test of methodReverse_2 method, of class Reverse_2.
     */
    @Test
    public void testMethodReverse_2() {
        System.out.println("methodReverse_2");
        String original = "isi";
        Reverse_2 instance = new Reverse_2();
        String expResult = "The reverse of isi is isi";
        String result = instance.methodReverse_2(original);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
