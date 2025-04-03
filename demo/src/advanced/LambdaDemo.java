package advanced;

class MyCode implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread with runnable");
	}
}

public class LambdaDemo {
	public static void printNumbers() {
		for (int i = 1; i <= 10; i++)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		var t1 = new Thread(new MyCode());
		t1.start();

		var t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread with anonymous inner class");
			}
		});
		t2.start();

		// Lambda Expression
		var t3 = new Thread(() -> System.out.println("Lambda Expression"));
		t3.start();

		// Lambda Block
		var t4 = new Thread(() -> {
			for (int i = 1; i <= 10; i++)
				System.out.println(i);
		});
		t4.start();
		
		// Method reference 
		var t5 = new Thread(LambdaDemo::printNumbers);
		t5.start();
	}

}
