package lib1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SortDates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		LocalDate dates[] = new LocalDate[5];

		for (int i = 0; i < 5; i++) {
			String st = s.nextLine();
			dates[i] = LocalDate.parse(st, DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		}

		Arrays.sort(dates);

		for (var d : dates)
			System.out.println(d.format(DateTimeFormatter.ofPattern("dd-MM-uuuu")));

	}

}
