/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seany_000
 */
public class ParameterTest {
    
    public ParameterTest() {
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
     * Test of setText method, of class Parameter.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Parameter instance = null;
        instance.setText(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDouble method, of class Parameter.
     */
    @Test
    public void testSetDouble() {
        System.out.println("setDouble");
        Double number = null;
        Parameter instance = null;
        instance.setDouble(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Parameter.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Parameter instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDouble method, of class Parameter.
     */
    @Test
    public void testGetDouble() {
        System.out.println("getDouble");
        Parameter instance = null;
        Double expResult = null;
        Double result = instance.getDouble();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKindOfParameter method, of class Parameter.
     */
    @Test
    public void testGetKindOfParameter() {
        System.out.println("getKindOfParameter");
        Parameter instance = null;
        int expResult = 0;
        int result = instance.getKindOfParameter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKindOfParameter method, of class Parameter.
     */
    @Test
    public void testSetKindOfParameter() {
        System.out.println("setKindOfParameter");
        int kindOfParameter = 0;
        Parameter instance = null;
        instance.setKindOfParameter(kindOfParameter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlternateKindOfParameter method, of class Parameter.
     */
    @Test
    public void testGetAlternateKindOfParameter() {
        System.out.println("getAlternateKindOfParameter");
        Parameter instance = null;
        int expResult = 0;
        int result = instance.getAlternateKindOfParameter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOtherKindOfParameter method, of class Parameter.
     */
    @Test
    public void testGetOtherKindOfParameter() {
        System.out.println("getOtherKindOfParameter");
        Parameter instance = null;
        int expResult = 0;
        int result = instance.getOtherKindOfParameter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
