package collections;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortLines {

	public static void main(String[] args) throws IOException {
		var path = Path.of("names.txt");
		var lines = Files.readAllLines(path);

		System.out.println(lines.getClass());
		
		lines.sort(null);

		for (var line : lines)
			System.out.println(line);
	}

}
