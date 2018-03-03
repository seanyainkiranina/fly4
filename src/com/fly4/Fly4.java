/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;


import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author seany_000
 */
public class Fly4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        InternalHandler iHandler = new InternalHandler();
        Engine parserEngine = new Engine();
        Controller commandController = new Controller();
        ArrayList<Parameter> parameterList = new ArrayList<>();
    
        int success = iHandler.process_args(args);
        
        if (success == MasterEnum.FALSE ){
            return;
        }
       // success = iHandler.setInFile()
       int numberParameters =0; 
       Boolean eof =false;
       do{
           int token = iHandler.getToken();
           String command ="";
           switch(token){
                case StreamTokenizer.TT_EOF:
                  iHandler.print("EOF reached");
                  eof = true;
                  break;
                case StreamTokenizer.TT_WORD:
               //   try
               //   {
                      command = iHandler.getString();
                      parameterList = commandController.parameterList(command);
                      numberParameters=parameterList.size();
                //     System.out.println(numberParameters);
                      for (int counter = 0; counter < numberParameters; counter++) {
                          Parameter param = parameterList.get(counter);
                          token = iHandler.getToken();
                          
                          if (token == StreamTokenizer.TT_EOF || token == StreamTokenizer.TT_EOL){
                              break;
                          }
                       
                          if (param.getKindOfParameter() != token && param.getAlternateKindOfParameter() != token){
                              throw new Exception( param.getKindOfParameter() + " " + param.getAlternateKindOfParameter()  + " " + command + " " + token + " Bad Parameter");
                          }
                          
                          if (token==param.getAlternateKindOfParameter()){
                              numberParameters++;
                              parameterList.add(new Parameter(param.getKindOfParameter(),param.getAlternateKindOfParameter()));
                              param.setKindOfParameter(token);
                          }
                          
                          if (token == StreamTokenizer.TT_WORD){
                              param.setText(iHandler.getString());
                          }
                          if (token == StreamTokenizer.TT_NUMBER){
                              param.setDouble(iHandler.getDouble());
                          }
                          
                         
                      }
                          parserEngine.execute(command, parameterList);
                      
                      
             //     }
             //     catch(Exception ex){
             //         System.err.println(ex);
               
             //         System.err.println(ex.getMessage());
             //         return;
             //     }
                  break;
           }
       }while (eof != true);
       iHandler.close();
       parserEngine.close();
       
        
    }
    
}
