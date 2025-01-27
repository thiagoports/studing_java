package entities;

public class Account {
	 public int number;
	 public String holder;
	 public double balance;
	
	 public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposite(initialDeposit);
	}
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void deposite(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
	public String toString() {
		return "Account "
				+ number
				+", Holder: "
				+ holder
				+", Balance: "
				+ String.format("%.2f", balance);
				
	}
}
