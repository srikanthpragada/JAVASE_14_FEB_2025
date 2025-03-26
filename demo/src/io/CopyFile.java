package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyFile {

	public static void main(String[] args) throws Exception {
		 var sourceFile = "names.txt";
		 var targetFile = "newnames.txt";
		 
		 var contents = Files.readString(Path.of(sourceFile));
		 Files.writeString(Path.of(targetFile), contents.toUpperCase());
	}

}
