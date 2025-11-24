package com.demo.test;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestBufferedInputStream {
      public static void main(String args[]) {
    	  File f = new File("src/myfilecopy.txt");
    	  BufferedOutputStream bos = null;
    	  try{
    		  if(f.exists()) {
    			  bos = new BufferedOutputStream(new FileOutputStream(f,true));  
    		    }
    		  else {
    			  bos = new BufferedOutputStream(new FileOutputStream(f));
    		     }
    	  }catch(FileNotFoundException e) {
    		System.out.println(e.getMessage());  
    	   }
    	  
    	  try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/myfile.txt"));
    	      BufferedOutputStream bos1 = bos ;){
    		  int i = bis.read();
    		  while(i!=-1) {
    			  bos.write(i);
    			  i = bis.read();
    		  }
    		  
    	  }catch(IOException e) {
    		  System.out.println(e.getMessage());
    	  }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
	
	
}
