package chapter04;

public class BankAccount {
	private String owner;
	private int accountNumber;
	private int balance;
	
	public BankAccount(String owner, int accountNumber, int balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	@Override
	public String toString() {
		return "현재 잔액은 " + balance + "원 입니다.";
	}

}
