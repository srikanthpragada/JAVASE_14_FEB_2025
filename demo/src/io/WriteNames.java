package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) {
		String[] names = { "Java", "C#", "C++", "Python" };

		try {
			// 1. Open 
			FileWriter fw = new FileWriter("names.txt", true);
			
			// 2. Write
			for(var name : names)
				fw.write(name + "\n");
			
			// 3. Close 
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
