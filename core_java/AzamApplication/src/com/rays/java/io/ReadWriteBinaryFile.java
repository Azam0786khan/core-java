package com.rays.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinaryFile {
	
	public static void main(String[] args) throws IOException {
		
	
	
	String source="E;//elonMuskBaba.jpeg";
	
	String target= "E;//elonMusk.jpeg";
	
	FileInputStream in=new FileInputStream(source);
	
	FileOutputStream out=new FileOutputStream(target);
	
	int ch=in.read();
	while(ch !=-1){
		out.write(ch);
	ch = in.read();	
	}
	System.out.println("ho gya");
	out.close();
	in.close();

}
}
