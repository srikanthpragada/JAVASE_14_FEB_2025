package oop;

 abstract class Product {
	protected String title;
	protected double price;

	public Product(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public void print() {
		System.out.println(this.title);
		System.out.println(this.price);
	}
	
	public abstract double getNetPrice();
}

class ImportedProduct extends Product  {
    protected double importTax;
	public ImportedProduct(String title, double price, double importTax) {
		super(title, price);
        this.importTax = importTax; 
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.importTax);
	}
	
	@Override 
	public double getNetPrice() {
		return this.price + this.price * this.importTax / 100;
	}
}

class DiscountedProduct extends Product  {
    protected double discountRate;
	public DiscountedProduct(String title, double price, double discountRate) {
		super(title, price);
        this.discountRate = discountRate; 
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.discountRate);
	}
	
	@Override 
	public double getNetPrice() {
		return this.price - this.price * this.discountRate / 100;
	}
}

public class TestProducts {

	public static void main(String[] args) {
		 ImportedProduct ip = new ImportedProduct("iPhone 16", 100000, 12);
		 DiscountedProduct dp = new DiscountedProduct("Bose Speakers", 50000, 20);
		 
		 ip.print();
		 System.out.println(ip.getNetPrice());
		 
		 dp.print();
		 System.out.println(dp.getNetPrice());
		 
		 // Upcasting 
		 Product p = new ImportedProduct("IPad", 50000, 12);
		 p.print();  // print() comes from ImportedProduct 
		 System.out.println(p.getNetPrice());
		 
		 
		 p = new DiscountedProduct("Logitech Mouse", 10000, 10);
		 p.print();   // runtime polymorphism 
		 System.out.println(p.getNetPrice());
		 
		 
	 
		 
	}
}
