/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

/**
 *
 * @author seany_000
 */
public class Parameter {
    private Double number;
    private String text;
    private int kindOfParameter;
    private int alternateKindOfParameter;
    private int otherAlternateKindOfParameter;
    
    public Parameter(int kindOfParameter){
        this.kindOfParameter = kindOfParameter;
        this.alternateKindOfParameter = 9999;
        this.otherAlternateKindOfParameter = 9999;
    }
    
    public Parameter(int kindOfParameter,int alternateKindOfParameter){
        this.kindOfParameter = kindOfParameter;
        this.alternateKindOfParameter = alternateKindOfParameter;
    }
    public Parameter(int kindOfParameter, int alternateKindOfParameter, int otherKind){
        this.kindOfParameter = kindOfParameter;
        this.alternateKindOfParameter = alternateKindOfParameter;
        this.otherAlternateKindOfParameter = otherKind;
    }
    
    
    public void setText(String text){
        
        this.text = text;
    }
    
    public void setDouble(Double number){
        this.number = number;
    }
    
    public String getText(){
  
        int local = 0;
        if (this.text == null && this.number !=null){
            
            local = number.intValue();
            
            return String.valueOf(local);
        }
        
        return this.text;
    }
    public Double getDouble(){
        
        return this.number;
        
    }
    public int getKindOfParameter(){
        
        return this.kindOfParameter;
        
    }
    public void setKindOfParameter(int kindOfParameter){
        
        this.kindOfParameter = kindOfParameter;
        this.alternateKindOfParameter = 9999;
    }
    
    public int getAlternateKindOfParameter(){
        
        return this.alternateKindOfParameter;
        
    }
    public int getOtherKindOfParameter(){
        
        return this.otherAlternateKindOfParameter;
    }
    
    
}
