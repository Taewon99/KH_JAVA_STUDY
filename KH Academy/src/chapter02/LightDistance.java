package chapter02;

import java.util.Scanner;

public class LightDistance {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input days for distance of the Light : ");
		int days = scan.nextInt();
		
		final double LIGHT_DISTANCE_PER_SEC = 3e5;
		double totalDistance = LIGHT_DISTANCE_PER_SEC*days*24*60*60;
		
		System.out.println("\nThe Light travels "+totalDistance+" km during "+ days+" days");
		
	}

}
