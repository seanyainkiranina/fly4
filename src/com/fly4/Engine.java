/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author seany_000
 */
public class Engine {
  
    private RenderEngine rE = null;
    private String lastCommand;
    private int parameterCounter = -1;
    private final HashMap<String, ArrayList<Parameter>> map = new HashMap<>();
    
    
    public Engine(){
        
        
    }
    
    public void close(){
        
        
    }
    public void endLine(){
        
        this.parameterCounter=-1;
  
    }
    public String add(String token){
    
        if (this.parameterCounter == -1)
        {
            this.lastCommand = token;
        }
        
        this.parameterCounter++;

        switch (this.lastCommand){
            case "new":
                this.rE = new RenderEngine();
                break;
            case "name":
                if (this.parameterCounter>0){
                    this.rE.setOutImageName(token);
                }
                break;
            case "copyresized":
                 if (this.parameterCounter>0){
                     this.rE.setInImageName(token);
                 }
                break;
        }
        
        return "Added " + token;
    }
    public String addNumber(double token){
        
        this.parameterCounter++;
        switch(this.lastCommand){
            case "size":
                if (this.parameterCounter ==1){
                    this.rE.setHeight((int)token);
                }
                if (this.parameterCounter ==2){
                    this.rE.setWidth((int)token);
                }
                break;
        }
        
        
        return "Added " + token;
    }
    
    public String execute(String command,ArrayList<Parameter> parameterList){
        
         this.map.put(command, parameterList);
    
        return "Sucess";
    }
    
}
