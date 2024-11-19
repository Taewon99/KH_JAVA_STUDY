package chapter02;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input name : ");
		String name = scan.nextLine();
		System.out.print("Input age : ");
		int age = scan.nextInt();
		System.out.print("Input blood type : ");
		String bloodType = scan.next();
		
		System.out.println("\nÀÌ¸§ : "+name+"\n³ªÀÌ : "+age+"\nÇ÷ÇÙÇü : "+bloodType);
	}

}
