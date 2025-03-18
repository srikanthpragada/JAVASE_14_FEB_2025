package oop2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TotalMarks2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = 0;
		while (true) {
			System.out.print("Enter marks [-1 to stop] :");
			try {
				int marks = s.nextInt();
				if (marks == -1)
					break;

				total += marks;
			} catch (InputMismatchException ex) {
				s.next(); // clear buffer 
				System.out.println("Invalid Number. Please try again!");
			}
		}

		System.out.println("Total marks : " + total);
        s.close();
	}

}
