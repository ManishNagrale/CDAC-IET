package com.demo.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class TestCopy4 {
    public static void main(String args[]) {
	    File f = new File("src/myfilecopy.txt");
    	FileOutputStream fos = null;
	   try {
		  if(f.exists()) {
			  //append mode
			  fos = new FileOutputStream("src/myfilecopy.txt",true);  
		  }//write mode
		  else {
			  fos = new FileOutputStream("src/myfilecopy.txt");
		  }
	    }catch(FileNotFoundException e) {
		  System.out.println(e.getMessage());
	    }
    	//autoclosable resource block
	   try(FileInputStream fis = new FileInputStream("src/myfile.txt");
			 FileOutputStream fos1 =fos;  ){
		    int i = fis.read();
		    while(i!=-1) {
		    	fos.write(i);
		    	i= fis.read();
		    	
		    }
	   }catch(IOException e) {
		   System.out.println(e.getMessage());
	   }
    	
    	
   }
}
