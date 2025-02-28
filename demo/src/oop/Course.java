package oop;

public class Course {
   private String title;
   private int duration, fee;
   
   // Constructor 
   public Course(String t, int d, int f) {
	   title = t;
	   duration = d;
	   fee = f;
   }
   
   public void print() {
	   System.out.println(title);
	   System.out.println(duration);
	   System.out.println(fee);
   }
   
   public int getNetFee() {
	   return   fee + fee * 12 / 100; 
   }
}
