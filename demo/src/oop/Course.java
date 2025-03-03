package oop;

public class Course {
	// instance variable 
	private String title;
	private int duration, fee;
	
	// class variable
	private static int taxRate = 12;
	
	public static int getTaxRate() {
		return Course.taxRate;
	}

	// Constructors
	public Course(String title, int duration, int fee) {
		this.title = title;
		this.duration = duration;
		this.fee = fee;
	}

	public Course(String title, int fee) {
		this(title, 36, fee); // call another constructor
	}

	public void print() {
		System.out.println(this.title);
		System.out.println(this.duration);
		System.out.println(this.fee);
	}

	public int getNetFee() {
		return this.fee + this.fee * Course.taxRate / 100;
	}
}
