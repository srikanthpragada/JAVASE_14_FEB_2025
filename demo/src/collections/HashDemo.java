package collections;

import java.util.TreeSet;

class Course implements Comparable<Course>{
	private String title;
	private int fee;

	public Course(String title, int fee) {
		super();
		this.title = title;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return this.title + " - " + this.fee;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return this.fee == other.fee && this.title.equals(other.title);
	}

	@Override
	public int compareTo(Course other) {
		return this.title.compareTo(other.title);
	}
}

public class HashDemo {

	public static void main(String[] args) {
//		var courses = new HashSet<Course>();
//		
//		courses.add(new Course("Python",10000));
//		courses.add(new Course("Java",9000));
//		courses.add(new Course("Gen AI",15000));
//		courses.add(new Course("Python",10000));

//		for(var c : courses)
//			System.out.println(c);

		var sortedCourses = new TreeSet<Course>();

		sortedCourses.add(new Course("Python", 10000));
		sortedCourses.add(new Course("Java", 9000));
		sortedCourses.add(new Course("Gen AI", 15000));

		for (var c : sortedCourses)
			System.out.println(c);

	}

}
