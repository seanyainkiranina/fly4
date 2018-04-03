/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

import java.util.ArrayList;
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
public class RenderEngineTest {
    
    public RenderEngineTest() {
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
     * Test of end method, of class RenderEngine.
     */
    @Test
    public void testEnd() throws Exception {
        System.out.println("end");
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.end();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class RenderEngine.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int width = 0;
        RenderEngine instance = new RenderEngine();
        instance.setWidth(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class RenderEngine.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int height = 0;
        RenderEngine instance = new RenderEngine();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeightWidth method, of class RenderEngine.
     */
    @Test
    public void testSetHeightWidth() {
        System.out.println("setHeightWidth");
        double height = 0.0;
        double width = 0.0;
        RenderEngine instance = new RenderEngine();
        instance.setHeightWidth(height, width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInImageName method, of class RenderEngine.
     */
    @Test
    public void testSetInImageName() {
        System.out.println("setInImageName");
        String name = "";
        RenderEngine instance = new RenderEngine();
        instance.setInImageName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutImageName method, of class RenderEngine.
     */
    @Test
    public void testSetOutImageName() {
        System.out.println("setOutImageName");
        String name = "";
        RenderEngine instance = new RenderEngine();
        instance.setOutImageName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPixel method, of class RenderEngine.
     */
    @Test
    public void testSetPixel() {
        System.out.println("setPixel");
        double x = 0.0;
        double y = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.setPixel(x, y, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of line method, of class RenderEngine.
     */
    @Test
    public void testLine() {
        System.out.println("line");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.line(x1, y1, x2, y2, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dline method, of class RenderEngine.
     */
    @Test
    public void testDline() {
        System.out.println("dline");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.dline(x1, y1, x2, y2, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rect method, of class RenderEngine.
     */
    @Test
    public void testRect() {
        System.out.println("rect");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.rect(x1, y1, x2, y2, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frect method, of class RenderEngine.
     */
    @Test
    public void testFrect() {
        System.out.println("frect");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.frect(x1, y1, x2, y2, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fill method, of class RenderEngine.
     */
    @Test
    public void testFill() {
        System.out.println("fill");
        double x = 0.0;
        double y = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.fill(x, y, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arc method, of class RenderEngine.
     */
    @Test
    public void testArc() {
        System.out.println("arc");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        double x3 = 0.0;
        double y3 = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.arc(x1, y1, x2, y2, x3, y3, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of circle method, of class RenderEngine.
     */
    @Test
    public void testCircle() {
        System.out.println("circle");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.circle(x1, y1, x2, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of oval method, of class RenderEngine.
     */
    @Test
    public void testOval() {
        System.out.println("oval");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.oval(x1, y1, x2, y2, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of foval method, of class RenderEngine.
     */
    @Test
    public void testFoval() {
        System.out.println("foval");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.foval(x1, y1, x2, y2, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fcircle method, of class RenderEngine.
     */
    @Test
    public void testFcircle() {
        System.out.println("fcircle");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double r = 0.0;
        double g = 0.0;
        double b = 0.0;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.fcircle(x1, y1, x2, r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poly method, of class RenderEngine.
     */
    @Test
    public void testPoly() throws Exception {
        System.out.println("poly");
        ArrayList<Parameter> polyOptions = null;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.poly(polyOptions);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fpoly method, of class RenderEngine.
     */
    @Test
    public void testFpoly() throws Exception {
        System.out.println("fpoly");
        ArrayList<Parameter> polyOptions = null;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.fpoly(polyOptions);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transparent method, of class RenderEngine.
     */
    @Test
    public void testTransparent() {
        System.out.println("transparent");
        Double r = null;
        Double g = null;
        Double b = null;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.transparent(r, g, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of string method, of class RenderEngine.
     */
    @Test
    public void testString() {
        System.out.println("string");
        Double r = null;
        Double g = null;
        Double b = null;
        Double x = null;
        Double y = null;
        String size = "";
        String[] text = null;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.string(r, g, b, x, y, size, text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringUp method, of class RenderEngine.
     */
    @Test
    public void testStringUp() {
        System.out.println("stringUp");
        Double r = null;
        Double g = null;
        Double b = null;
        Double x = null;
        Double y = null;
        String size = "";
        String[] text = null;
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.stringUp(r, g, b, x, y, size, text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyresized method, of class RenderEngine.
     */
    @Test
    public void testCopyresized() throws Exception {
        System.out.println("copyresized");
        Double srcDX = null;
        Double srcDY = null;
        Double srcDWidth = null;
        Double srcDHeight = null;
        Double targetDX = null;
        Double targetDY = null;
        Double targetDWidth = null;
        Double targetDHeight = null;
        String inImage = "";
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.copyresized(srcDX, srcDY, srcDWidth, srcDHeight, targetDX, targetDY, targetDWidth, targetDHeight, inImage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resize method, of class RenderEngine.
     */
    @Test
    public void testResize() {
        System.out.println("resize");
        RenderEngine instance = new RenderEngine();
        String expResult = "";
        String result = instance.resize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
