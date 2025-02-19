package basics;

import java.util.Scanner;

public class SumOf5Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter a number :");
			total += s.nextInt();
		}
		System.out.println(total);
		
		s.close();
	}

}
