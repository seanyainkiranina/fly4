/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
/**
 *
 * @author seany_000
 */
public class RenderEngine {
    private int width;
    private int height;
    private String inImage;
    private String outImage;
    
    public void setWidth(int width){
        this.width=width;
    }
    
    public void setHeight(int height){
        this.height=height;
    }
    
    public void setInImageName(String name){
        
        this.inImage = name;
    }
    
    public void setOutImageName(String name){
     
        this.outImage = name;
        
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
