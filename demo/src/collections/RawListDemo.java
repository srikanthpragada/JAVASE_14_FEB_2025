package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

public class RawListDemo {

	public static void main(String[] args) {
		  var list = new ArrayList();
		  
		  list.add("Abc");
		  list.add(10);     // Integer 
		  list.add(LocalDate.now());
		  
		  String name = (String) list.get(1);
		  
		  // Type safe 
		  var list2 = new ArrayList<String>();
		  
		  list2.add("abc");
		  name = list2.get(0);
		  
		  
		  var list3 = new Vector<Integer>();
		  list3.add(10);
		  list3.add(100);
		  
		  for(var e : list3)
			  System.out.println(e);


	}

}
