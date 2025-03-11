package lib1;

import java.util.Arrays;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] names = new String[5];

		for (int i = 0; i < 5; i++) {
			names[i] = s.nextLine();
		}

		Arrays.sort(names);
		
		for(String n : names)
			System.out.println(n);
		
	}

}
