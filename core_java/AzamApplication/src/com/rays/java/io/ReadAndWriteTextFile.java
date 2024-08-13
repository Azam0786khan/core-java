package com.rays.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteTextFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader=new FileReader("D:\\Text.txt");
		
		BufferedReader br= new BufferedReader(reader);
		
		String value = br.readLine();
		String str=null;
		while(value!=null) {
			str = value;
			System.out.println(value);
			value = br.readLine();
		}
		reader.close();
		
		FileWriter w=new FileWriter("D:\\Text1.txt");
		
		w.write(str);
		w.close();
	}

}
