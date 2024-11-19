package chapter04;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount taewon = new BankAccount("Taewon", 1, 10000);
		
		System.out.println(taewon);
		taewon.deposit(5000);
		System.out.println(taewon);
		taewon.withdraw(10000);
		System.out.println(taewon);
	}

}
