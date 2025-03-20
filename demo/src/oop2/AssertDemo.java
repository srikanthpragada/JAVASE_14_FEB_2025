package oop2;

public class AssertDemo {

	public static boolean isEven(int n) {
		return   n % 2 == 0;
	}
	
	public static void main(String[] args) {
		assert isEven(10) == true: "Error with isEven() for even number!";
		assert isEven(11) == false: "Error with isEven() for odd number!";
	}

}
