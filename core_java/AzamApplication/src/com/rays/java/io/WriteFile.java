package com.rays.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter w=new FileWriter("D:\\Text.txt");
		
		
		char[] cArray= {'h', 'i'};
		
		w.write(cArray);
		w.write(',');
		w.write("Azam");
		System.out.println("success");
		
		w.close();
	}


	}


