package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class ChangeMarks {

	public static void main(String[] args) throws Exception {
		var s = new Scanner(System.in);
		var raf = new RandomAccessFile("marks.dat", "rw");

		while (true) {
			System.out.println("Enter rollno [0 to stop] :");
			int rollno = s.nextInt();
			if (rollno == 0)
				break;

			int pos = rollno - 1;
			raf.seek(pos);

			try {
				// Make sure rollno is valid
				int oldMarks = raf.readByte();
                System.out.printf("Old Marks : %d\n", oldMarks);
                
            	System.out.println("Enter new marks :");
    			int marks = s.nextInt();
    			
				// Go back to same position
				raf.seek(pos);
				raf.writeByte(marks);
				System.out.println("Updated Marks!");
			} catch (Exception ex) {
				System.out.println("Sorry! Invalid Rollno!");
			}
		}

		raf.close();

	}

}
