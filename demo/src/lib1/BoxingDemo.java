package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		 Object obj;
		 
		 obj = 10;      // Covert 10 to Integer object - Auto-boxing 
		 obj = 10.50;   // Covert 10.50 to Double object - Auto-boxing 
		 
		 System.out.println(obj.getClass());
		 
		 Integer iobj = 10; 
		 
		 int a = iobj;   // Auto-unboxing 
		 
		 
		 

	}

}
