package basics;

public class FunsDemo {
	public static void wishAll(String message, String... names) {
		for (String name : names)
			System.out.println(message + " " + name);
	}

	public static void wish(String name) {
		System.out.println("Hello " + name);
	}

	public static String greet(String name) {
		return "Hello " + name;
	}

	public static void main(String[] args) {
		wish("James");
		System.out.println(greet("Gosling"));
		wishAll("Hi", "Scott", "Mark", "Anders");
		wishAll("Good Morning", "Jack", "Richards");
	}

}
