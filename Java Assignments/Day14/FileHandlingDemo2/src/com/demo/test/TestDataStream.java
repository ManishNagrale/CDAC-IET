package com.demo.test;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) {
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("src/myfile.txt"));
			DataInputStream dis=new DataInputStream(new FileInputStream("src/myfile.txt"))	){
			 dos.writeDouble(3456.67);
			 dos.writeInt(777);
			 dos.writeUTF("Rajan");
			 dos.writeDouble(4006.67);
			 dos.writeInt(444);
			 dos.writeUTF("Saurabh");
			 System.out.println("read data");
			 double num=dis.readDouble();
			 int num1=dis.readInt();
			 String nm=dis.readUTF();
			 System.out.println(num+"----"+num1+"----"+nm);
			 double num3=dis.readDouble();
			 int num4=dis.readInt();
			 String nm5=dis.readUTF();
			 System.out.println(num3+"----"+num4+"----"+nm5);
		} catch (IOException e) {
	       e.printStackTrace();
		}

	}

}

