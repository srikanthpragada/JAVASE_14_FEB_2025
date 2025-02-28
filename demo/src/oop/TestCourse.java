package oop;

public class TestCourse {

	public static void main(String[] args) {
		 Course c1 = new Course("Generative AI", 18, 6000);
		 
		 //c1.init("Generative AI", 18, 6000);
		 
		 c1.print();
		 
		 System.out.println(c1.getNetFee());

		 
		 Course c2 = new Course("AWS", 24, 5000);
	}

}
