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
    private String inImage;
    private String outImage ="out.png";
    private File inputFile;
    private BufferedImage inputImage;
    private BufferedImage outputImage;
    private Graphics2D g2d;
    private HashMap<String,Color> colorMap;
    
   
    
    public RenderEngine(){
        
        this.colorMap = new HashMap<String,Color>();
       
        
    }
    public String end() throws IOException{
        
          this.g2d.dispose();
 
        // extracts extension of output file
          String formatName = this.outImage.substring(this.outImage
                    .lastIndexOf(".") + 1);
 
        // writes to output file
            ImageIO.write(this.outputImage, formatName, new File(this.outImage));
          
        
        
        return "Done";
    }
    
    private void buildImage(){
        
        this.outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.g2d = outputImage.createGraphics();
        
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
        
        this.inImage = name;
    }
    
    public void setOutImageName(String name){
     
        this.outImage = name;
        
    }
    
    private Color checkColor(double r,double g, double b){
        
        if (this.outputImage == null){
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
        
        this.g2d.setColor(this.checkColor(r, g, b));
        
        this.g2d.drawLine((int)x, (int)y, (int)x, (int)y);
        
        return "Point Drawn";
        
    }
   
    public String line(double x1,double y1,double x2,double y2,double r, double g, double b){
        
        this.g2d.setColor(this.checkColor(r, g, b));
        
        this.g2d.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
        
        return "line drawn";
        
        
    }
      public String dline(double x1,double y1,double x2,double y2,double r, double g, double b){
   
        this.g2d.setColor(this.checkColor(r, g, b));
   
        this.g2d.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
        
        return "line drawn";
        
        
    }
  
    public String rect(double x1,double y1,double x2,double y2,double r, double g, double b)
    {
         this.g2d.setColor(this.checkColor(r, g, b));
   
         this.g2d.drawRect((int)x1,(int)y1,(int)x2,(int)y2);
        
        return "rect drawn";
    }
    
    public String frect(double x1,double y1,double x2,double y2,double r, double g, double b)
    {
   
         this.g2d.setColor(this.checkColor(r, g, b));
   
         this.g2d.fillRect((int)x1,(int)y1,(int)x2,(int)y2);
        
        return "rect drawn";
    }
    public String fill(double r, double g, double b)
    {
    
        this.g2d.setColor(this.checkColor(r, g, b));
   
         this.g2d.fillRect(0,this.height,this.width,this.height);
       
        return "fill";
    }
    
    public String arc(double x1,double y1,double x2,double y2,double x3,double y3,double r, double g, double b)
    {
         this.g2d.setColor(this.checkColor(r, g, b));
   
         this.g2d.drawArc((int)x1,(int)y1,(int)x2,(int)y2,(int)x3,(int)y3);
        
        return "drawn";
    }
    
    public String circle(double x1,double y1,double x2,double r, double g, double b)
    {
         this.g2d.setColor(this.checkColor(r, g, b));
   
         this.g2d.drawOval((int)x1,(int) y1, (int)x2,(int) x2);
                 // drawCircle((int)x1,(int)y1,(int)x2);
        
        return "drawn";
    }
    
    public String fOval(double x1,double y1,double x2,double y2,double r, double g, double b)
    {
         this.g2d.setColor(this.checkColor(r, g, b));
   
         this.g2d.fillOval((int)x1,(int) y1, (int)x2,(int) y2);
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
         this.g2d.setColor(this.checkColor(r, g, b));
   
         this.g2d.fillOval((int)x1,(int) y1, (int)x2,(int) x2);
                 // drawCircle((int)x1,(int)y1,(int)x2);
        
        return "drawn";
    }
    
    
    private Double parameterPop(ArrayList<Parameter> polyOptions){
        
        Parameter p = polyOptions.get(polyOptions.size() - 1);
        polyOptions.remove(polyOptions.size() - 1);
        
        return p.getDouble();
    }
    
    
    public String poly(ArrayList<Parameter> polyOptions) throws Exception
    {
        
        Double b =  this.parameterPop(polyOptions);
        Double g =  this.parameterPop(polyOptions);
        Double r =  this.parameterPop(polyOptions);
        Double xPoint =0.0;
        Double yPoint =0.0;
        this.g2d.setColor(this.checkColor(r, g, b));
        
        int numberOfPoints = polyOptions.size();
        if (numberOfPoints % 2 !=0){
            
            throw new Exception("uneven number of points");
            
        }
        int x[] = new int[numberOfPoints/2]; 
        int y[] = new int[numberOfPoints/2]; 
        int counter=0;
        
        while (counter<(numberOfPoints/2)){
            yPoint = this.parameterPop(polyOptions);
            xPoint= this.parameterPop(polyOptions);
            y[counter]=yPoint.intValue();
            x[counter]=xPoint.intValue();
            
            counter++;
        }
        
        this.g2d.drawPolygon(x, y, numberOfPoints);
   
        return "drawn";
    }
    
     public String fpoly(ArrayList<Parameter> polyOptions) throws Exception
    {
        
        Double b =  this.parameterPop(polyOptions);
        Double g =  this.parameterPop(polyOptions);
        Double r =  this.parameterPop(polyOptions);
        Double xPoint =0.0;
        Double yPoint =0.0;
        this.g2d.setColor(this.checkColor(r, g, b));
        
        int numberOfPoints = polyOptions.size();
        if (numberOfPoints % 2 !=0){
            
            throw new Exception("uneven number of points");
            
        }
        int x[] = new int[numberOfPoints/2]; 
        int y[] = new int[numberOfPoints/2]; 
        int counter=0;
        
        while (counter<(numberOfPoints/2)){
            yPoint = this.parameterPop(polyOptions);
            xPoint= this.parameterPop(polyOptions);
            y[counter]=yPoint.intValue();
            x[counter]=xPoint.intValue();
            
            counter++;
        }
        
        this.g2d.fillPolygon(x, y, numberOfPoints);
   
        return "drawn";
    }
   public String transparent(Double r,Double g,Double b){
       Color newColor = new Color(r.floatValue(), g.floatValue(), b.floatValue(),1); 
       this.g2d.setColor(newColor);
       String colorKey = Double.toHexString(r) + Double.toHexString(g) + Double.toHexString(b);
       this.colorMap.put(colorKey,newColor);
    
        return "tranparent";
       
   }
     
   public String string(Double r,Double g,Double b,Double x, Double y,String size,String text){
       
        this.g2d.setColor(this.checkColor(r, g, b));
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
     
        this.g2d.drawString(text,x.intValue(), y.intValue());
        
        return "text drawn";
   }
   
    public String stringUp(Double r,Double g,Double b,Double x, Double y,String size,String text){
       
        this.g2d.setColor(this.checkColor(r, g, b));
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
        
        this.g2d.translate(x.floatValue(),y.floatValue());
        this.g2d.rotate(Math.toRadians(angle));
        this.g2d.drawString(text,0,0);
        
        this.g2d.setFont(new Font("Courier", Font.PLAIN, fontSize));
     
        this.g2d.drawString(text,0, 0);
        
        this.g2d.rotate(-Math.toRadians(angle));
        this.g2d.translate(-x.floatValue(),-y.floatValue());
        
        return "text drawn";
   }  
  
   
    public String resize(){
        try
        {
            File inputFile = new File(this.inImage);
            BufferedImage inputImage = ImageIO.read(inputFile);
            BufferedImage outputImage = new BufferedImage(this.width,
                this.height, inputImage.getType());
        
            Graphics2D g2d = outputImage.createGraphics();
            g2d.drawImage(inputImage, 0, 0, this.width, this.height, null);
            g2d.dispose();
 
        // extracts extension of output file
            String formatName = this.outImage.substring(this.outImage
                    .lastIndexOf(".") + 1);
 
        // writes to output file
            ImageIO.write(outputImage, formatName, new File(this.outImage));
            
            return "Success";
        
        }
        catch(Exception ex){
            
            return "Error XX " + this.inImage + " " + this.outImage + ' ' + ex.getMessage();
        }
        
        
    }
    
    
    
}
