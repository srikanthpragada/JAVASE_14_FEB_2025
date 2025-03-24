package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames2 {

	public static void main(String[] args) {
		String[] names = { "Java", "C#", "C++", "Python" };

		// Try with resource - ARM 
		try(FileWriter fw = new FileWriter("names.txt")){
			for(var name : names)
				fw.write(name + "\n");
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
