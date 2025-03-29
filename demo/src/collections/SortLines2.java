package collections;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortLines2 {

	public static void main(String[] args) throws IOException {
		var path = Path.of("names.txt");
		var lines = new TreeSet<String>(Files.readAllLines(path));

		for (var line : lines)
			System.out.println(line);
	}

}
