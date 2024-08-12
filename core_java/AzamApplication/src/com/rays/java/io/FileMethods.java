package com.rays.java.io;

import java.io.File;
import java.util.Date;



public class FileMethods {

	public static void main(String[] args) {
		
		File file = new File("D:\\FileTesting.txt");
		
		if(file.exists()) {
			System.out.println("file is avialable");
			//file name 
			System.out.println("file name = "+file.getName());
			//read and write
			System.out.println("read and write = " +file.canRead()+ " & " +file.canWrite());
			//directory
			System.out.println("directory = " +file.isDirectory());
			//last modified date 
			System.out.println("last modified on = " +new Date(file.lastModified()));
		}else {
			System.out.println("file is not avialable");
		}

	}

}
