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
public class InternalHandlerTest {
    
    public InternalHandlerTest() {
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
     * Test of getMasterEnum method, of class InternalHandler.
     */
    @Test
    public void testGetMasterEnum() {
        System.out.println("getMasterEnum");
        InternalHandler instance = new InternalHandler();
        MasterEnum expResult = null;
        MasterEnum result = instance.getMasterEnum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class InternalHandler.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        String text = "";
        InternalHandler instance = new InternalHandler();
        instance.print(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class InternalHandler.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        InternalHandler instance = new InternalHandler();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getToken method, of class InternalHandler.
     */
    @Test
    public void testGetToken() {
        System.out.println("getToken");
        InternalHandler instance = new InternalHandler();
        int expResult = 0;
        int result = instance.getToken();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getString method, of class InternalHandler.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        InternalHandler instance = new InternalHandler();
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDouble method, of class InternalHandler.
     */
    @Test
    public void testGetDouble() {
        System.out.println("getDouble");
        InternalHandler instance = new InternalHandler();
        double expResult = 0.0;
        double result = instance.getDouble();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutFile method, of class InternalHandler.
     */
    @Test
    public void testSetOutFile() {
        System.out.println("setOutFile");
        String filename = "";
        InternalHandler instance = new InternalHandler();
        int expResult = 0;
        int result = instance.setOutFile(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInFile method, of class InternalHandler.
     */
    @Test
    public void testSetInFile() {
        System.out.println("setInFile");
        String filename = "";
        InternalHandler instance = new InternalHandler();
        int expResult = 0;
        int result = instance.setInFile(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of process_args method, of class InternalHandler.
     */
    @Test
    public void testProcess_args() {
        System.out.println("process_args");
        String[] argv = null;
        InternalHandler instance = new InternalHandler();
        int expResult = 0;
        int result = instance.process_args(argv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
