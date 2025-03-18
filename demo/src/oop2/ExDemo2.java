package oop2;

public class ExDemo2 {

	public static void main(String[] args) {
		String s = "A0";

		try {
			int n = Integer.parseInt(s);
			System.out.println(100 / n);
		} catch (Exception ex) {
			System.out.println("Error :" + ex.getMessage());
		}

		System.out.println("The End!");

	}

}
