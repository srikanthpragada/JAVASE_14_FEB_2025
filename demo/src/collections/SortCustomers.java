package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class SortCustomers {

	public static void main(String[] args) throws IOException {
		var p = Path.of("customers.txt");
		var lines = Files.readAllLines(p);

		var customers = new TreeMap<String, String>();

		for (var line : lines) {
			var parts = line.split(",");
			if(parts.length >= 2)
			    customers.put(parts[0], parts[1]);
		}
		
		for (var name : customers.keySet()) {
			System.out.printf("%-20s - %-10s\n", 
					name, customers.get(name));
		}

	}

}
