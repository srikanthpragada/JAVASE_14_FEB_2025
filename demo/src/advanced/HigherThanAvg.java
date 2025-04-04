package advanced;

import java.util.Arrays;

public class HigherThanAvg {

	public static void main(String[] args) {
		 int marks [] = {90,45,34,56,78,93,12,33, 88,45};
	 
         // Create a stream from an Array 
		 var s = Arrays.stream(marks);
		 
		 // Get average as OptionalDouble and get double from that
		 var avgMarks = s.average().getAsDouble();
		 System.out.println(avgMarks);
		
		 var s2 =  Arrays.stream(marks); 
		 s2.filter(m -> m > avgMarks)
		   .sorted()
		   .forEach(System.out::println);
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
