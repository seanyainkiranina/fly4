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
                System.out.println("new");
                break;
            case "name":
                this.rE.setOutImageName(parameterList.get(0).getText());
                System.out.println("name");
                break;
            case "frect":
                this.rE.frect(parameterList.get(0).getDouble(), parameterList.get(1).getDouble(), parameterList.get(2).getDouble(), parameterList.get(3).getDouble(), parameterList.get(4).getDouble(), parameterList.get(5).getDouble(), parameterList.get(6).getDouble());
                System.out.println("frect");
                break;
            case "size":
                this.rE.setHeightWidth(parameterList.get(0).getDouble(), parameterList.get(1).getDouble());
                System.out.println("set size");
                break;
            case "circle":
                this.rE.circle(parameterList.get(0).getDouble(), parameterList.get(1).getDouble(),parameterList.get(2).getDouble(), parameterList.get(3).getDouble(),parameterList.get(4).getDouble(), parameterList.get(5).getDouble());
                System.out.println("create circle");
                break;
            case "arc":
                this.rE.arc(parameterList.get(0).getDouble(), parameterList.get(1).getDouble(),parameterList.get(2).getDouble(), parameterList.get(3).getDouble(),parameterList.get(4).getDouble(), parameterList.get(5).getDouble(), parameterList.get(6).getDouble(), parameterList.get(7).getDouble(), parameterList.get(8).getDouble());
                System.out.println("create arc");
                break;
            case "string":
                int i = parameterList.size()-1;
                int start=6;
                String[] sString = new String[i-start];
                int counter=0;
                while (start<i){
                    sString[counter] = parameterList.get(start).getText();
                    start++;
                    counter++;
                }
                
                this.rE.string(parameterList.get(0).getDouble(), parameterList.get(1).getDouble(),parameterList.get(2).getDouble(), parameterList.get(3).getDouble(),parameterList.get(4).getDouble(), parameterList.get(5).getText(), sString);
                System.out.println("create string");
                break;
            case "transparent":
                this.rE.transparent(parameterList.get(0).getDouble(), parameterList.get(1).getDouble(),parameterList.get(2).getDouble());
                System.out.println("create transparent");
                break;
            case "end":
                try {
                    this.rE.end();
                    return "Done";
                } catch (IOException ex) {
                    return ex.getLocalizedMessage();
               }
        }
         this.map.put(command, parameterList);
    
        return "Sucess";
    }
    
}
