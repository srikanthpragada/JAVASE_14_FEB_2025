package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class FindMarks {

	public static void main(String[] args) throws Exception {
		var s = new Scanner(System.in);
		var raf = new RandomAccessFile("marks.dat", "r");

		while (true) {
			System.out.println("Enter rollno [0 to stop] :");
			int rollno = s.nextInt();
			if (rollno == 0)
				break;
			int pos = rollno - 1;
			raf.seek(pos);
			try {
				int marks = raf.readByte();
				System.out.println(marks);
			} catch (Exception ex) {
				System.out.println("Sorry! Invalid Rollno!");
			}
		}

		raf.close();

	}

}
