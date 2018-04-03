/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.StreamTokenizer;


/*
new\n\
size x,y\n\
name filename\n\
\n\
line    x1,y1,x2,y2,R,G,B             dline        x1,y1,x2,y2,R,G,B \n\
rect    x1,y1,x2,y2,R,G,B             frect        x1,y1,x2,y2,R,G,B \n\
square  x,y,s,R,G,B                   fsquare      x,y,s,R,G,B \n\
poly    R,G,B,x1,y1...,xn,yn          fpoly        R,G,B,x1,y1...,xn,yn \n\
fill    x,y,R,G,B                     filltoborder x,y,R1,G1,B1,R2,B2,G2 \n\
arc     x1,y1,w,h,start,finish,R,G,B  \n\
ellipse x1,y1,w,h,R,G,B  \n\
circle  x,y,d,R,G,B                   fcircle      x,y,d,R,G,B \n\
\n\
string   R,G,B,x,y,<size>,<string> \n\
stringup R,G,B,x,y,<size>,<string> \n\
(size = tiny, small, medium, large or giant) \n\
\n\
copy         x,y,x1,y1,x2,y2,filename \n\
copyresized  x1,y1,x2,y2,dx1,dy1,dx2,dy2,filename \n\
\n\
setpixel     x,y,R,G,B \n\
getpixel     x,y \n\
colourchange R1,G1,B1,R2,G2,B2 \n\
transparent  R,G,B \n\
interlace \n\
\n\
setbrush    filename                         killbrush \n\
settile     filename                         killtile \n\
setstyle    R1,G1,B1,R2,G2,B2,...,Rn,Bn,Gn       killstyle \n\n\
sizex \n\
sizey \n\
rotate      deg \n\
\n\
type        gif|png|jpeg\n\
quality     n (image quality when type = jpeg. Must be in the range 0-95)\n\
\n\



 */
/**
 *
 * @author seany_000
 */
public class Controller{
    private HashMap<String, ArrayList<Parameter>> map = new HashMap<>();
    
    public ArrayList<Parameter> parameterList(String command) throws Exception{
   
        
        if (this.map.containsKey(command)==false){
            
            throw new Exception("Bad Command " + command);
        }
        
        ArrayList alReturn = this.map.get(command);
        
        if (alReturn.isEmpty()){
            
            this.instanceParameters();
            alReturn = this.map.get(command);
        }
        
        return alReturn;
    }
    
    public void saveParmeterList(String command,ArrayList<Parameter> parameterList){
        this.map.put(command, parameterList);
    }
    
    private void instanceParameters(){
        
        this.map = new HashMap<>();
        ArrayList<String> commands = new ArrayList<>();
        commands.add("new");
        commands.add("size");
        commands.add("name");
        commands.add("line");
        commands.add("dline");
        commands.add("rect");
        commands.add("frect");
        commands.add("square");
        commands.add("fsquare");
        commands.add("poly");
        commands.add("fpoly");
        commands.add("fill");
        commands.add("filltoborder");
        commands.add("arc");
        commands.add("ellipse");
        commands.add("circle");
        commands.add("fcircle");
        commands.add("string");
        commands.add("stringup");
        commands.add("copy");
        commands.add("copyresized");
        commands.add("setpixel");
        commands.add("getpixel");
        commands.add("colourchange");
        commands.add("transparent");
        commands.add("interlace");
        commands.add("setbrush");
        commands.add("killbrush");
        commands.add("settile");
        commands.add("killtile");
        commands.add("setstyle");
        commands.add("killstyle");
        commands.add("sizex");
        commands.add("sizey");
        commands.add("rotate");
        commands.add("type");
        commands.add("quality");
        commands.add("end");
        
        
        for (String command: commands){
              this.map.put(command, new ArrayList<>());
              switch(command){
                  case "new":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                 case "end":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "interlace":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "killbrush":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "killtile":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "killstyle":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "size":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "quality":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "name":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_WORD));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "type":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_WORD));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "setbrush":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_WORD));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "settile":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_WORD));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "line":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(8,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "dline":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(8,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "rect":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(8,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                   case "frect":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(8,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                   case "getpixel":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                   case "transparent":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                   case "string":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_WORD));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_WORD,StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_EOL,StreamTokenizer.TT_WORD,StreamTokenizer.TT_NUMBER));
                      break;
                   case "stringup":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_WORD));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_WORD,StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_EOL,StreamTokenizer.TT_WORD,StreamTokenizer.TT_NUMBER));
                      break;
                   case "setpixel":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                    case "copy":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_WORD));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                    case "copyresized":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(8,new Parameter(StreamTokenizer.TT_WORD));
                      this.map.get(command).add(9,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                  case "colourchange":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                    case "poly":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_EOL,StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_EOL,StreamTokenizer.TT_NUMBER));
                    break;
                    case "fpoly":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_EOL,StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_EOL,StreamTokenizer.TT_NUMBER));
                      break;
                   case "rotate":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                   case "fill":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                   case "filltoborder":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(8,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(9,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                   case "arc":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(8,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(9,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                    case "ellipse":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(7,new Parameter(StreamTokenizer.TT_EOL));
                      break;
                    case "circle":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_EOL));
                      break;   
                    case "fcircle":
                      this.map.get(command).add(0,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(1,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(2,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(3,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(4,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(5,new Parameter(StreamTokenizer.TT_NUMBER));
                      this.map.get(command).add(6,new Parameter(StreamTokenizer.TT_EOL));
                      break;   
                      
                      
                
                      
       }
        }
        
    }
    
    public Controller(){
        
        this.instanceParameters();
        
    }
}
