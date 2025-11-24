package com.demo.test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class TestCopy {
     public static void main(String args[]) {
    	 try {
			FileInputStream fis = new FileInputStream("src/newfile.txt");
			FileOutputStream fos = new FileOutputStream("src/myfile2copy.txt"); 
			int i = fis.read();
			while(i!=-1) {
				fos.write(i);
				i = fis.read();
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
     }
}
