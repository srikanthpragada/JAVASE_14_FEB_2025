package io;

import java.io.FileReader;
import java.io.IOException;

public class ReadNames {

	public static void main(String[] args) {

		try {
			// 1. Open
			var fr = new FileReader("names.txt");
			while(true) {
				int ch = fr.read();  // read a char 
				if(ch == -1)  // EOF
					break;
				System.out.print((char) ch);
			}
			 
			// 3. Close
			fr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
