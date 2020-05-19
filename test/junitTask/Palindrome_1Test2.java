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
public class Palindrome_1Test2 {
    
    public Palindrome_1Test2() {
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
     * Test of methodPalindrome_1 method, of class Palindrome_1.
     */
    @Test
    public void testMethodPalindrome_1() {
        System.out.println("methodPalindrome_1");
        int n1 = 22;
        Palindrome_1 instance = new Palindrome_1();
        String expResult = "palindrome number!";
        String result = instance.methodPalindrome_1(n1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
