package oop;

abstract class Shape {
	private int x,y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract int area();
}

class Circle extends Shape {
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public int area() {
		 return  (int) (Math.PI * this.radius * radius);
	}
}

class Rectangle extends Shape {
	private int length, width;
	
	public Rectangle(int x, int y, int length, int width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}
  

	@Override
	public int area() {
		 return  this.length * this.width; 
	}
}

public class TestShapes {

	public static void main(String[] args) {
		 
      Shape s  = new Circle(10,20, 15);
      System.out.println(s.area());  // Runtime Polymorphism 
      
      s  = new Rectangle(10,20, 15, 20);
      System.out.println(s.area()); // Runtime Polymorphism 
	}

}
