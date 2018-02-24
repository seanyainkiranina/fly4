/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seany_000
 */
public class Engine {
  
    private RenderEngine rE = null;
    private final HashMap<String, ArrayList<Parameter>> map = new HashMap<>();
    
    
    public Engine(){
        
        this.rE = new RenderEngine();
        
    }
    
    public void close(){
        
        
    }
    public String execute(String command,ArrayList<Parameter> parameterList){
      
        switch(command){
            case "new":
                this.rE = new RenderEngine();
                break;
            case "name":
                this.rE.setOutImageName(parameterList.get(0).getText());
                break;
            case "size":
                this.rE.setHeightWidth(parameterList.get(0).getDouble(), parameterList.get(0).getDouble());
                break;
            case "end":
                try {
                    this.rE.end();
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                    return ex.getLocalizedMessage();
               }
                break;
            
              
            
        }
         this.map.put(command, parameterList);
    
        return "Sucess";
    }
    
}
