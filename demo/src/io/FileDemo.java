package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		 var f = new File("c:\\classroom\\java");
		 
		 System.out.println(f.exists());
		 System.out.println(f.isFile());
		 System.out.println(f.isDirectory());

	}

}
