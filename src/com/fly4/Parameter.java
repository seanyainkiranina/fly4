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
    
    public Parameter(int kindOfParameter){
        this.kindOfParameter = kindOfParameter;
    }
    
    public void setText(String text){
        
        this.text = text;
    }
    
    public void setDouble(Double number){
        this.number = number;
    }
    
    public String getText(){
        
        return this.text;
    }
    public Double getDouble(){
        
        return this.number;
        
    }
    public int getKindOfParameter(){
        
        return this.kindOfParameter;
        
    }
    
}