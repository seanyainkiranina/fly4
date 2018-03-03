/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;
import javax.imageio.*;
import java.util.HashMap;
/**
 *
 * @author seany_000
 */
public class RenderEngine {
    private int width =100;
    private int height =100;
    private String inImageName;
    private String outImageName ="out.png";
    private File inputFileIO;
    private BufferedImage inputImageBufferedImage;
    private BufferedImage outputImageBufferedImage;
    private Graphics2D g2d;
    private HashMap<String,Color> colorMap;
    
   
    
    public RenderEngine(){
        
        this.colorMap = new HashMap<>();
       
        
    }
    public String end() throws IOException{
  
         // this.g2d.dispose();
        
         if (this.outputImageBufferedImage==null){
             this.buildImage();
         }
 
           // extracts extension of output file
         String formatName = this.outImageName.substring(this.outImageName.lastIndexOf(".") + 1);
   
        // writes to output file
            ImageIO.write(this.outputImageBufferedImage, formatName, new File(this.outImageName));
          
        
        
        return "Done";
    }
    
    private void buildImage(){
        
        this.outputImageBufferedImage = new BufferedImage(this.width, this.height, BufferedImage.TYPE_4BYTE_ABGR);
        this.g2d = outputImageBufferedImage.createGraphics();
        
        Color transparent = new Color(255,255,255,0); 
        
        this.g2d.setBackground(transparent);
        this.g2d.clearRect(0, 0, this.width, this.height);
        
    }
    
    public void setWidth(int width){
        this.width=width;
    }
    
    public void setHeight(int height){
        this.height=height;
    }
    
    public void setHeightWidth(double height,double width)
    {
        this.height = (int)height;
        this.width = (int)width;
    }
    
    public void setInImageName(String name){
        
        if (this.outputImageBufferedImage==null){
            
            this.buildImage();
        }
        
        this.inImageName = name;
    }
    
    public void setOutImageName(String name){
     
        this.outImageName = name;
        
    }
    
    private Color checkColor(double r,double g, double b){
        
        if (this.g2d == null){
            
            this.buildImage();
                    
        }
        
        String colorKey = Double.toHexString(r) + Double.toHexString(g) + Double.toHexString(b);
        
        if (this.colorMap.containsKey(colorKey)){
            
            return this.colorMap.get(colorKey);
            
        }
        Color newColor = new Color((int)r, (int)g, (int)b); 
        
        this.colorMap.put(colorKey,newColor);
        
        return newColor;
    }
    
    public String setPixel(double x,double y,double r, double g, double b){
        
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
        this.g2d.drawLine((int)x, (int)y, (int)x, (int)y);
        
        return "Point Drawn";
        
    }
   
    public String line(double x1,double y1,double x2,double y2,double r, double g, double b){
        
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
        this.g2d.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
        
        return "line drawn";
        
        
    }
      public String dline(double x1,double y1,double x2,double y2,double r, double g, double b){
   
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
        this.g2d.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
        
        return "line drawn";
        
        
    }
  
    public String rect(double x1,double y1,double x2,double y2,double r, double g, double b)
    {
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
         this.g2d.drawRect((int)x1,(int)y1,(int)x2,(int)y2);
        
        return "rect drawn";
    }
    
    public String frect(double x1,double y1,double x2,double y2,double r, double g, double b)
    {
   
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
        
         this.g2d.fillRect((int)x1,(int)y1,(int)x2,(int)y2);
        
        return "rect drawn";
    }
    public String fill(double r, double g, double b)
    {
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
        
         this.g2d.fillRect(0,this.height,this.width,this.height);
       
        return "fill";
    }
    
    public String arc(double x1,double y1,double x2,double y2,double x3,double y3,double r, double g, double b)
    {
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
         double rad = x2/2;
   
         this.g2d.drawArc((int) ((int)x1 - rad), (int) ((int) y1 -rad), (int)x2,(int)y2,(int)x3, -(int)y3);
            
        return "drawn";
    }
    
    public String circle(double x1,double y1,double x2,double r, double g, double b)
    {
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
        double rad = x2/2;
   
         this.g2d.drawOval((int) ((int)x1 - rad), (int) ((int) y1 -rad), (int)x2,(int) x2);
                 // drawCircle((int)x1,(int)y1,(int)x2);
        
        return "drawn";
    }
    
    public String oval(double x1,double y1,double x2,double y2,double r, double g, double b)
    {
         this.g2d.setColor(this.checkColor(r, g, b));
   
         this.g2d.drawOval((int)x1,(int) y1, (int)x2,(int) y2);
                 // drawCircle((int)x1,(int)y1,(int)x2);
        
        return "drawn";
    }
    
    public String foval(double x1,double y1,double x2,double y2,double r, double g, double b)
    {
         this.g2d.setColor(this.checkColor(r, g, b));
   
         this.g2d.fillOval((int)x1,(int) y1, (int)x2,(int) y2);
                 // drawCircle((int)x1,(int)y1,(int)x2);
        
        return "drawn";
    }
    
    
    public String fcircle(double x1,double y1,double x2,double r, double g, double b)
    {
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
        double rad = x2/2;
   
         this.g2d.fillOval((int) ((int)x1 - rad), (int) ((int) y1 -rad), (int)x2,(int) x2);
                 // drawCircle((int)x1,(int)y1,(int)x2);
                 
                 
        return "drawn";
    }
    
    
    private Double parameterShift(ArrayList<Parameter> polyOptions){
        
        Parameter p = polyOptions.get(0);
        polyOptions.remove(0);
        
        
        return p.getDouble();
    }
    
    
    private Double parameterPop(ArrayList<Parameter> polyOptions){
        
        int length = polyOptions.size() -1;
        Parameter p = polyOptions.get(length);
        polyOptions.remove(length);
        while (p != null && length>-1){
            length = polyOptions.size() -1;
            p = polyOptions.get(length);
            polyOptions.remove(length);
        }
        
        return p.getDouble();
    }
    
    
    public String poly(ArrayList<Parameter> polyOptions) throws Exception
    {
        Double r = this.parameterShift(polyOptions);
        Double g = this.parameterShift(polyOptions);
        Double b = this.parameterShift(polyOptions);
        Double xPoint = 0.0;
        Double yPoint = 0.0;

        int numberOfPoints = polyOptions.size();
        if (numberOfPoints % 2 != 0) {

            throw new Exception("uneven number of points");

        }
        int halfPoints = numberOfPoints / 2;

        int counter = 0;
        Polygon p = new Polygon();
        while (counter < halfPoints) {
            xPoint = this.parameterShift(polyOptions);
            yPoint = this.parameterShift(polyOptions);
            if (xPoint != null && yPoint != null) {
                p.addPoint(xPoint.intValue(), yPoint.intValue());
            }
            counter++;
        }

        Color myColor = this.checkColor(r, g, b);
        this.g2d.setColor(myColor);
        this.g2d.drawPolygon(p);

        return "drawn";

    }
    
    public String flood(int x, int y,Color tgtColor) {
        
        
        
        return "filled";
    }
    
     public String fpoly(ArrayList<Parameter> polyOptions) throws Exception
    {
        
        Double r =  this.parameterShift(polyOptions);
        Double g =  this.parameterShift(polyOptions);
        Double b =  this.parameterShift(polyOptions);
        Double xPoint =0.0;
        Double yPoint =0.0;
        
        int numberOfPoints = polyOptions.size();
        if (numberOfPoints % 2 !=0){
            
            throw new Exception("uneven number of points");
            
        }
        int halfPoints=numberOfPoints/2;
   
        int counter=0;
        Polygon p = new Polygon();
        while (counter<halfPoints){
            xPoint= this.parameterShift(polyOptions);
            yPoint = this.parameterShift(polyOptions);
            if (xPoint != null && yPoint != null){
                    p.addPoint(xPoint.intValue(), yPoint.intValue());
            }
            counter++;
        }
        
      
        Color myColor = this.checkColor(r, g, b);
        this.g2d.setColor(myColor);
        this.g2d.drawPolygon(p);
      
        this.g2d.fillPolygon(p);
   
        return "drawn";
        
    }
   public String transparent(Double r,Double g,Double b){
       
        if (this.g2d == null){
            
            this.buildImage();
                    
        }
       Color newColor = new Color(r.intValue(), g.intValue(), b.intValue(),0); 
       this.g2d.setColor(newColor);
       String colorKey = Double.toHexString(r) + Double.toHexString(g) + Double.toHexString(b);
       this.colorMap.put(colorKey,newColor);
    
        return "tranparent";
       
   }
     
   public String string(Double r,Double g,Double b,Double x, Double y,String size,String[] text){
       
        
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
        int fontSize =10;
        
        switch (size){
            case "tiny":
                fontSize =5;
                break;
            case "small":
                fontSize =10;
                break;
            case "medium":
                fontSize =12;
                break;
            case "large":
                fontSize = 15;
                break;
            case "giamt":
                fontSize =20;
                break;
            default:
                fontSize =10;
                break;
        }
        this.g2d.setFont(new Font("Courier", Font.PLAIN, fontSize));
        
        String outputString ="";
         for (int i = 0; i < text.length; i++)
         {
             outputString = outputString + text[i] + " ";

        }
        this.g2d.drawString(outputString,x.intValue(), y.intValue());
        
        return "text drawn";
   }
   
    public String stringUp(Double r,Double g,Double b,Double x, Double y,String size,String[] text){
       
        Color myColor = this.checkColor(r, g, b);
        
        this.g2d.setColor(myColor);
        
        int fontSize =10;
        int angle =90;
        
        switch (size){
            case "tiny":
                fontSize =5;
                break;
            case "small":
                fontSize =10;
                break;
            case "medium":
                fontSize =12;
                break;
            case "large":
                fontSize = 15;
                break;
            case "giamt":
                fontSize =20;
                break;
            default:
                fontSize =10;
                break;
        }
        
        
        
        String outputString ="";
         for (int i = 0; i < text.length; i++)
         {
             outputString = outputString + text[i] + " ";

        }
        
        
        this.g2d.translate(x.floatValue(),y.floatValue());
        this.g2d.rotate(Math.toRadians(angle));
           
        this.g2d.setFont(new Font("Courier", Font.PLAIN, fontSize));
     
        this.g2d.drawString(outputString,0, 0);
        
        this.g2d.rotate(-Math.toRadians(angle));
        this.g2d.translate(-x.floatValue(),-y.floatValue());
        
        return "text drawn";
   }  
  
   
    public String resize(){
        try
        {
            File inputFile = new File(this.inImageName);
            BufferedImage inputImage = ImageIO.read(inputFile);
            BufferedImage outputImage = new BufferedImage(this.width,
                this.height, inputImage.getType());
        
            Graphics2D g2d = outputImage.createGraphics();
            g2d.drawImage(inputImage, 0, 0, this.width, this.height, null);
            g2d.dispose();
 
        // extracts extension of output file
            String formatName = this.outImageName.substring(this.outImageName
                    .lastIndexOf(".") + 1);
 
        // writes to output file
            ImageIO.write(outputImage, formatName, new File(this.outImageName));
            
            return "Success";
        
        }
        catch(Exception ex){
            
            return "Error XX " + this.inImageName + " " + this.outImageName + ' ' + ex.getMessage();
        }
        
        
    }
    
    
    
}
