package oop;

public class TestCounter {

	public static void main(String[] args) {
		 Counter c;  // Object Reference 
		 c = new Counter();  // Object or Instance
		 
		 c.inc();
		 c.inc();
		 
		 System.out.println(c.getValue());
		 c.reset();
		 c.dec();
		 System.out.println(c.getValue());
		 
		 Counter c2 = new Counter();

	}

}
