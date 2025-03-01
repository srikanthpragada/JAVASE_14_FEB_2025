package oop;

class SavingsAccount {
	private int acno;
	private String customer;
	private int balance;
	
	public SavingsAccount(int acno, String customer, int balance) {
		this.acno = acno;
		this.customer = customer;
		this.balance = balance;
	}
	
	public SavingsAccount(int acno, String customer) {
		this.acno = acno;
		this.customer = customer;
		this.balance = 0;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
}


public class TestSavingsAccount {

	public static void main(String[] args) {
		 SavingsAccount s1 = new SavingsAccount(1, "George");
		 s1.deposit(10000);
		 s1.withdraw(5000);
		 System.out.println(s1.getBalance());
		 
		 SavingsAccount s2 = new SavingsAccount(2, "Gladwell", 30000);
			

	}

}
