package chapter05;

import java.util.Scanner;

public class ECarTest {

	public static void main(String[] args) {
		ECar eCar = ECar.getInstance();
		Scanner scan = new Scanner(System.in);

		eCar.disBattery();
		eCar.disDistance();
		
		System.out.println("∏Ó km øÓ«‡«œ±‚∏¶ »Ò∏¡«œΩ≈∞°ø‰?");
		int user = scan.nextInt();
		

		while (true) {
			eCar.drive();
			System.out.println(eCar);
			if (eCar.getBattery() <= 0 ||eCar.getDistance() == user) {
				if(eCar.getBattery() <= 0)
				System.out.println("∏ÿ√„");
				break;
			}
		}
	}
}
