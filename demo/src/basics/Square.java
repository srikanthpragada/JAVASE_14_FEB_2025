package basics;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		 int num;
		 
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter a number :");
		 // Read integer from keyboard 
		 num = s.nextInt();
		 
		 System.out.printf("Square of %d is %d", num, num * num);
		 s.close();
	}

}
