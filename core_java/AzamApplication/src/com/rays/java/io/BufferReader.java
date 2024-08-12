package com.rays.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader r=new FileReader("D:\\FileTesting.txt");
		
		BufferedReader br =new BufferedReader(r);
		
		String ch=br.readLine();
		
		while(ch!=null) {
			System.out.println(ch);
		ch=br.readLine();
		}

	}

}
