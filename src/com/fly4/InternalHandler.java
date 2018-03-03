/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fly4;

import java.io.*;

/**
 *
 * @author seany_000
 */
public final class InternalHandler {

    private final MasterEnum me;
    private File inFile = null;
    private FileInputStream inputFile = null;
    private PrintWriter outputFile = null;
    StreamTokenizer stTokenizer = null;
    
    public MasterEnum getMasterEnum(){
        return this.me;
    }
    
    public void print(String text)
    {
        if (this.me.getVerbose()==this.me.FALSE){
            return;
        }
      
            if (this.outputFile == null){
                
             //  System.out.println("i " + text);
            }
            else{
                
                this.outputFile.println(text);
            }
    }
    public void close(){
  
       if (this.inputFile !=null){
            try
            {
                this.inputFile.close();
            }
            catch(Exception ex){
                System.err.println(ex.getMessage());
            }
       }
   
        if (this.outputFile == null){
         
            return;
        }
        
        try{
            this.outputFile.close();
          }
          catch( Exception ex ){
              
              System.err.println(ex.getMessage());
          }
            
        
   }
    
    public int getToken(){
        
        try
        {
            return this.stTokenizer.nextToken();
        }
        catch(Exception ex){
              System.err.println(ex.getMessage());
               return StreamTokenizer.TT_EOF;
        }
    }
    
    public String getString(){
        
        return this.stTokenizer.sval;
        
    }
    public double getDouble(){
        
        return this.stTokenizer.nval;
    }
    
   public int setOutFile(String filename){
       try{
           
           this.outputFile = new PrintWriter(filename);
           
       }
       catch(Exception ex)
       {
           System.err.println(ex.getMessage());
           return MasterEnum.FALSE;
       }
       
       return MasterEnum.TRUE;
   }
   
   public int setInFile(String filename){
       this.inFile = new File(filename);
       
       if (!this.inFile.exists() || !this.inFile.isFile()){
           this.print(filename + " error");
           return MasterEnum.FALSE;
           
       }
       try
       {
            this.inputFile = new FileInputStream(filename);
            Reader r = new BufferedReader(new InputStreamReader(this.inputFile));
            this.stTokenizer = new StreamTokenizer(r);
            this.stTokenizer.eolIsSignificant(true);
            this.stTokenizer.ordinaryChar('-'); // Don't parse minus as part of numbers.
            this.stTokenizer.ordinaryChar('/'); // Don't parse slash as part of numbers.
            this.stTokenizer.wordChars('_', '_'); // Don't parse slash as part of numbers.
            this.stTokenizer.wordChars('\\', '\\'); // Don't parse slash as part of numbers.
            this.stTokenizer.wordChars(':', ':'); // Don't parse slash as part of numbers.
            this.stTokenizer.wordChars('\'', '\''); // Don't parse slash as part of numbers.
   
            this.stTokenizer.whitespaceChars(' ', ' ');
            this.stTokenizer.whitespaceChars(',', ',');
           
            
       }
       catch(Exception ex){
           System.err.println(ex.getMessage());
           return MasterEnum.FALSE;
       }
       
       
       return MasterEnum.TRUE;
       
   }
    
    public InternalHandler(){
        
        this.me = new MasterEnum();
    }
    
    public int process_args(String argv[]){
        int c =0;
        int errflag =0;
        String arg;
        
        Getopt g = new Getopt("fly4", argv, "qhvi:o:");
 
        while ((c = g.getopt()) != -1) {
            switch (c) {
                case 'h':
                    errflag=1;
                    break;
                case 'q':
                    this.me.setQuiet(MasterEnum.TRUE);
                    break;
                case 'v':
                    this.me.setVerbose(MasterEnum.TRUE);
                    break;
                case 'o':
                    arg = g.getOptarg();
                    if (arg != null){
                        this.me.setOutFilename(arg);
                    }
                    break;
                case 'i':
                    arg = g.getOptarg();
                    if (arg !=null){
                        this.me.setInFilename(arg);
                    }
                    break;
                

            }
         
          
         }
        
          if (errflag==1 || this.me.getInFilename() == null){
                
                System.out.println(MasterEnum.version + ' ' + MasterEnum.usage);
                
                return MasterEnum.FALSE;
            }
          
          if (this.setInFile(this.me.getInFilename()) == MasterEnum.FALSE){
                     
               System.err.println("Infile does not exist " + this.me.getInFilename());
         
              return MasterEnum.FALSE;
          }
          
          
        
        
       return MasterEnum.TRUE;
    }
}
