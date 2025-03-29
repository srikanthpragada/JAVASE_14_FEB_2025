package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		var names = new ArrayList<String>();

		names.add("James Gosling");
		names.add("Van Rossum");
		names.add(0, "Dennis Ritche");

		for (var name : names)
			System.out.println(name);

		System.out.println(names.indexOf("Anders"));
		System.out.println(names.contains("James Gosling"));

	}

}
