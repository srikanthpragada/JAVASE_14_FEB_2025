package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TakeNamesAndWrite {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		try (s; FileWriter fw = new FileWriter("names.txt")) {

			while (true) {
				System.out.print("Enter name [end to stop] :");
				String name = s.nextLine();
				if (name.equals("end"))
					break;
				fw.write(name + "\n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
