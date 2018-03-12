/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

import java.awt.Font;
import java.awt.image.*;
/**
 *
 * @author seany_000
 */
public final class MasterEnum {

    private int quiet;
    private String outFilename;
    private String inFilename;
    private int outputType;
    private int finished;
    private int done;
    private int end_of_line;
    private int written_out;
    private int type;
    private int line_number;
    private int verbose;
    private boolean completed;
    private int fontSize;
    private String fontName;
    private int fontWeight;
    
    public void setFontName(String fontName){
        
        this.fontName = fontName;
    }
    
    public String getFontName(){
        
        return this.fontName;
    }
    
    public void setFontSize(int size){
        
        this.fontSize = size;
    }
    
    public int getFontStyle(){
        
        return this.fontWeight;
    }
    
    public void setFontStyle(String style){
        
        switch(style){
            case "italic":
                this.fontWeight = Font.ITALIC;
                break;
            case "bold":
                this.fontWeight = Font.BOLD;
                break;
            case "normal":
                this.fontWeight = Font.PLAIN;
                break;
            case "tt":
                this.fontWeight = Font.TRUETYPE_FONT;
                break;
            case "t1":
                this.fontWeight = Font.TYPE1_FONT;
                break;
        }
        
    }
    
    public int getTiny(){
        
        return this.fontSize -5;
    }
    public int getSmall(){
        
        return this.fontSize;
    }
    public int getMedium(){
        
        return this.fontSize +5;
    }
    public int getLarge(){
        
        return this.fontSize +10;
    }
    public int getGiant(){
        
        return this.fontSize + 20;
    }
    
    
    public boolean getCompleted(){
        
        return this.completed;
    }
    
    public void setCompleted(boolean status){
       
        this.completed =status;
    }

    public String getOutFilename() {

        return this.outFilename;
    }

    public void setOutFilename(String name) {

        this.outFilename = name;
     
    }

    public int getOutputType() {

        return this.outputType;
    }

    public String getInFilename() {

        return this.inFilename;
    }

    public void setInFilename(String name) {

        this.inFilename = name;
    }

    public int getQuiet() {
        return this.quiet;
    }

    public void setQuiet(int quiet) {

        this.quiet = quiet;
    }
    
    public int getVerbose() {
        return this.verbose;
    }

    public void setVerbose(int verbose) {

        this.verbose = verbose;
    }


    public MasterEnum() {
        this.quiet = FALSE;
        this.outputType = -1;
        this.finished = MasterEnum.FALSE;
        this.done = MasterEnum.FALSE;
        this.quiet = MasterEnum.FALSE;
        this.end_of_line = MasterEnum.FALSE;
        this.written_out = MasterEnum.FALSE;
        this.line_number = 1;
        this.verbose = MasterEnum.FALSE;
        this.completed = false;
        this.fontSize = 13;
        this.fontName="Courier";
        this.fontWeight = Font.PLAIN;
        
    }
    
    public static final int FALSE = 0;
    public static final int TRUE = 1;

    public static final int PNG = 5;
    public static final int GIF = 6;
    public static final int JPEG = 7;
    public static final int SMALL = 10;
    public static final int LARGE = 11;
    public static final int MEDIUM = 12;
    public static final int TINY = 13;
    public static final int GIANT = 14;
    public static final int FPOLY = 20;
    public static final int POLY = 21;
    public static final int LINE = 22;
    public static final int DLINE = 23;
    public static final int RECT = 24;
    public static final int FRECT = 25;
    public static final int ARC = 26;
    public static final int SIZE = 27;
    public static final int NEW = 28;
    public static final int EXISTING = 29;
    public static final int SETPIXEL = 30;
    public static final int FILLTOBORDER = 31;
    public static final int FILL = 32;
    public static final int STRING = 33;
    public static final int STRINGUP = 34;
    public static final int COPY = 35;
    public static final int COPYRESIZED = 36;
    public static final int INTERLACE = 37;
    public static final int SIZEX = 38;
    public static final int SIZEY = 39;
    public static final int SETBRUSH = 40;
    public static final int KILLBRUSH = 41;
    public static final int SETTILE = 42;
    public static final int KILLTILE = 43;
    public static final int SETSTYLE = 44;
    public static final int KILLSTYLE = 45;
    public static final int TRANSPARENT = 46;
    public static final int CIRCLE = 48;
    public static final int FCIRCLE = 49;
    public static final int GETPIXEL = 50;
    public static final int SQUARE = 51;
    public static final int FSQUARE = 52;
    public static final int EMPTY = 53;
    public static final int NAME = 54;
    public static final int END = 55;
    public static final int ELLIPSE = 56;
    public static final int COLOURCHANGE = 57;
    public static final int ROTATE = 58;
    public static final int TYPE = 59;
    public static final int QUALITY = 60;
    public static final int SETFONT = 61;
    public static final int FREETYPE = 62;

    public static final String version = "2.0.0";
    public static final String usage = "Usage : fly [-h] [-q] [-i inputfile] [-o outputfile]";

    public static final String help = "See <URL:http://martin.gleeson.com/fly/> for documentation.\n";

}
