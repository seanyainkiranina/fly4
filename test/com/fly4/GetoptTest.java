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
public class GetoptTest {
    
    public GetoptTest() {
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
     * Test of setOptstring method, of class Getopt.
     */
    @Test
    public void testSetOptstring() {
        System.out.println("setOptstring");
        String optstring = "";
        Getopt instance = null;
        instance.setOptstring(optstring);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOptind method, of class Getopt.
     */
    @Test
    public void testGetOptind() {
        System.out.println("getOptind");
        Getopt instance = null;
        int expResult = 0;
        int result = instance.getOptind();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOptind method, of class Getopt.
     */
    @Test
    public void testSetOptind() {
        System.out.println("setOptind");
        int optind = 0;
        Getopt instance = null;
        instance.setOptind(optind);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArgv method, of class Getopt.
     */
    @Test
    public void testSetArgv() {
        System.out.println("setArgv");
        String[] argv = null;
        Getopt instance = null;
        instance.setArgv(argv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOptarg method, of class Getopt.
     */
    @Test
    public void testGetOptarg() {
        System.out.println("getOptarg");
        Getopt instance = null;
        String expResult = "";
        String result = instance.getOptarg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpterr method, of class Getopt.
     */
    @Test
    public void testSetOpterr() {
        System.out.println("setOpterr");
        boolean opterr = false;
        Getopt instance = null;
        instance.setOpterr(opterr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOptopt method, of class Getopt.
     */
    @Test
    public void testGetOptopt() {
        System.out.println("getOptopt");
        Getopt instance = null;
        int expResult = 0;
        int result = instance.getOptopt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLongind method, of class Getopt.
     */
    @Test
    public void testGetLongind() {
        System.out.println("getLongind");
        Getopt instance = null;
        int expResult = 0;
        int result = instance.getLongind();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exchange method, of class Getopt.
     */
    @Test
    public void testExchange() {
        System.out.println("exchange");
        String[] argv = null;
        Getopt instance = null;
        instance.exchange(argv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLongOption method, of class Getopt.
     */
    @Test
    public void testCheckLongOption() {
        System.out.println("checkLongOption");
        Getopt instance = null;
        int expResult = 0;
        int result = instance.checkLongOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getopt method, of class Getopt.
     */
    @Test
    public void testGetopt() {
        System.out.println("getopt");
        Getopt instance = null;
        int expResult = 0;
        int result = instance.getopt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
