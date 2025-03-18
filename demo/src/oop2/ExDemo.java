package oop2;

public class ExDemo {

	public static void main(String[] args) {
		String s = "0";

		try {
			int n = Integer.parseInt(s);
			System.out.println(100 / n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} catch (ArithmeticException ex) {
			System.out.println("Zero is not valid number!");
		}

		System.out.println("The End!");

	}

}
