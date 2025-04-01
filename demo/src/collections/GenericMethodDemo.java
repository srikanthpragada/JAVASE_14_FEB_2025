package collections;

public class GenericMethodDemo {
	
	// Overloading of methods
	public static void print(String[] names) {
		for(var v : names)
			System.out.println(v);
	}

	public static void print(Integer[] nums) {
		for(var v : nums)
			System.out.println(v);
	}

	// Generic Method
	public static <T> void show(T [] values) {
		for(T v : values)
			System.out.println(v);
	}
	
	public static void main(String[] args) {
		  var names = new String [] { "Jack", "Mark", "Tom"};
		  var nums = new Integer[] {10,20,30};
		  
		  print(names);
		  print(nums);
		  
		  show(names);
		  show(nums);
	}

}
