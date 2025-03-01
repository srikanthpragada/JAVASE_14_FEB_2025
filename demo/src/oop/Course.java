package oop;

public class Course {
	private String title;
	private int duration, fee;

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
		return this.fee + this.fee * 12 / 100;
	}
}
