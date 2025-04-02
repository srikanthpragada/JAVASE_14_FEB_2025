package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class SortUniqueWords {

	public static void main(String[] args) throws IOException {
       var p = Path.of("story.txt");
       // Read contents of the file 
       var contents = Files.readString(p);
       
       // Look for one or more non-words chars
       var re = Pattern.compile("\\W+");
       
       // Split contents using non-words chars to get words 
       var words = re.split(contents);
       
//       for(var w : words)
//    	   System.out.println(w);
       
       // Convert array of strings to List and create TreeSet from that
       var sortedWords = new TreeSet<String>(Arrays.asList(words));
       
       // Print unique words in sorted order 
       for(var w : sortedWords) 
    	   System.out.println(w);
       
	}

}
