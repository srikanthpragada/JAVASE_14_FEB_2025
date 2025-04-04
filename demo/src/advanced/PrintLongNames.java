package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrintLongNames {

	public static void main(String[] args) throws IOException {
		 var p = Path.of("names.txt");
		 
		 Files.lines(p)
		      .distinct()
		      .filter( s -> s.length() > 3)
		      .sorted()
		      .forEach(s -> System.out.println(s.toUpperCase()));
	}

}
