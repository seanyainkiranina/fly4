/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;


import java.io.StreamTokenizer;
import java.util.ArrayList;

/**
 *
 * @author seany_000
 */
public class Fly4 {

    private static void execute(String[] args) throws Exception{
        // TODO code application logic here
        InternalHandler iHandler = new InternalHandler();
        Engine parserEngine = new Engine();
        Controller commandController = new Controller();
        ArrayList<Parameter> parameterList = new ArrayList<>();
        
        boolean positive = true;
        
        int success = iHandler.process_args(args);
        
        if (success == MasterEnum.FALSE ){
            return;
        }
       // success = iHandler.setInFile()
       int numberParameters =0; 
       Boolean eof =false;
       do{
           commandController = new Controller();
           int token = iHandler.getToken();
           String command ="";
           switch(token){
                case StreamTokenizer.TT_EOF:
                  iHandler.print("EOF reached");
                  eof = true;
                  break;
                case StreamTokenizer.TT_WORD:
                      command = iHandler.getString();
                      
                      parameterList = commandController.parameterList(command);
                      numberParameters=parameterList.size();
                      
                      for (int counter = 0; counter < numberParameters; counter++) {
                          
                          Parameter param = parameterList.get(counter);
                          token = iHandler.getToken();
                          
                          positive = true;
                          
                          if (token==45){
                              positive =false;
                              token = iHandler.getToken();
                          }
                          
                          if (token == StreamTokenizer.TT_EOF || token == StreamTokenizer.TT_EOL){
                              break;
                          }
                       
                          if (param.getKindOfParameter() != token && param.getAlternateKindOfParameter() != token && param.getOtherKindOfParameter() !=token){
                              throw new Exception( param.getKindOfParameter() + " " + param.getAlternateKindOfParameter()  + " " + command + " " + token + " Bad Parameter");
                          }
                          
                          if (token==param.getAlternateKindOfParameter()){
                              numberParameters++;
                              parameterList.add(new Parameter(param.getKindOfParameter(),param.getAlternateKindOfParameter()));
                              param.setKindOfParameter(token);
                          }
                          if (token==param.getOtherKindOfParameter()){
                              numberParameters++;
                              parameterList.add(new Parameter(param.getKindOfParameter(),param.getAlternateKindOfParameter(),param.getOtherKindOfParameter()));
                              param.setKindOfParameter(token);
                              
                          }
                          
                          if (token == StreamTokenizer.TT_WORD){
                              param.setText(iHandler.getString());
                          }
                          if (token == StreamTokenizer.TT_NUMBER){
                              if (positive==true){
                                    param.setDouble(iHandler.getDouble());
                              }
                              else{
                                    param.setDouble(0-iHandler.getDouble());
                              }
                          }
                          
                         
                      }
                     
                      parserEngine.execute(command, parameterList);
                      
                      
                  break;
           }
       }while (eof != true);
       iHandler.close();
       parserEngine.close();
       
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        int numberParameters =0;
        InternalHandler iHandler = new InternalHandler();
        Engine parserEngine = new Engine();
        Controller commandController = new Controller();
        Boolean positive =false;
         ArrayList<Parameter> parameterList = new ArrayList<>();
         parameterList = commandController.parameterList("size");
         
         numberParameters=parameterList.size();
         
         int token = iHandler.setInString("894,894");
             
              for (int counter = 0; counter < numberParameters; counter++) {
                          
                          Parameter param = parameterList.get(counter);
                          token = iHandler.getToken();
                          
                          positive = true;
                          
                          if (token==45){
                              positive =false;
                              token = iHandler.getToken();
                          }
                          
                          if (token == StreamTokenizer.TT_EOF || token == StreamTokenizer.TT_EOL){
                              break;
                          }
                       
                          if (param.getKindOfParameter() != token && param.getAlternateKindOfParameter() != token && param.getOtherKindOfParameter() !=token){
                              throw new Exception( param.getKindOfParameter() + " " + param.getAlternateKindOfParameter()  + " " +  " " + token + " Bad Parameter");
                          }
                          
                          if (token==param.getAlternateKindOfParameter()){
                              numberParameters++;
                              parameterList.add(new Parameter(param.getKindOfParameter(),param.getAlternateKindOfParameter()));
                              param.setKindOfParameter(token);
                          }
                          if (token==param.getOtherKindOfParameter()){
                              numberParameters++;
                              parameterList.add(new Parameter(param.getKindOfParameter(),param.getAlternateKindOfParameter(),param.getOtherKindOfParameter()));
                              param.setKindOfParameter(token);
                              
                          }
                          
                          if (token == StreamTokenizer.TT_WORD){
                              param.setText(iHandler.getString());
                          }
                          if (token == StreamTokenizer.TT_NUMBER){
                              if (positive==true){
                                    param.setDouble(iHandler.getDouble());
                              }
                              else{
                                    param.setDouble(0-iHandler.getDouble());
                              }
                          }
                      
                          System.out.println(token);
                          
                          
                          
                         System.out.println(param.getDouble());
                          
                      }
                 
         
         
    }    
    
    
}
