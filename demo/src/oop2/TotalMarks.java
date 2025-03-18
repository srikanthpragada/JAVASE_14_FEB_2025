package oop2;

import java.util.Scanner;

public class TotalMarks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = 0;
		while (true) {
			System.out.print("Enter marks [-1 to stop] :");
			try {
				int marks = Integer.parseInt(s.nextLine());
				if (marks == -1)
					break;

				total += marks;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid Number. Please try again!");
			}
		}

		System.out.println("Total marks : " + total);

	}

}
