package basics;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = i * i;
			System.out.printf("%d ", a[i]);
		}
		
		// Enhanced for loop 
		for (int n : a) {
			System.out.printf("%d ", n);
		}
	}

}
