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
public class LongOptTest {
    
    public LongOptTest() {
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
     * Test of getName method, of class LongOpt.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        LongOpt instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHasArg method, of class LongOpt.
     */
    @Test
    public void testGetHasArg() {
        System.out.println("getHasArg");
        LongOpt instance = null;
        int expResult = 0;
        int result = instance.getHasArg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlag method, of class LongOpt.
     */
    @Test
    public void testGetFlag() {
        System.out.println("getFlag");
        LongOpt instance = null;
        StringBuffer expResult = null;
        StringBuffer result = instance.getFlag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVal method, of class LongOpt.
     */
    @Test
    public void testGetVal() {
        System.out.println("getVal");
        LongOpt instance = null;
        int expResult = 0;
        int result = instance.getVal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
