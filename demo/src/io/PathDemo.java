package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathDemo {

	public static void main(String[] args) throws IOException {
		var p = Path.of("c:\\classroom\\java\\demo\\names.txt");
		System.out.println(p.getClass());

		System.out.println(Files.readString(p));

	}

}
