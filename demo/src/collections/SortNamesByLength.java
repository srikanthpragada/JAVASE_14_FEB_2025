package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class CompareByLength implements Comparator<String> {
//	@Override
//	public int compare(String s1, String s2) {
//		 return s1.length() - s2.length();
//	}
//}

public class SortNamesByLength {

	public static void main(String[] args) {
		 var names = new ArrayList<String>();
		 
		 names.add("Larry Ellison");
		 names.add("Jeff");
		 names.add("Larry Page");
		 names.add("Bill Gates");
		 names.add("Peter Norton");
		 
		// Collections.sort(names, new CompareByLength());
		 Collections.sort(names, 
				 (s1, s2) -> s1.length() - s2.length()
				 );
		 
		 
		 for(var n : names)
			 System.out.println(n);

	}

}
