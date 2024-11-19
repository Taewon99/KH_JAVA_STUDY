package chapter02;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input sec : ");
		int sec = scan.nextInt();
		
		int remains = sec%60;
		int min = sec/60%60;
		int hour = sec/60/60;
		
		if(hour>0) {
			System.out.println("\n"+sec+"sec is "+hour+"hour "+min+"min "+remains+"sec");
		}else if(min>0){
			System.out.println("\n"+sec+"sec is "+min+"min "+remains+"sec");
		}else {
			System.out.println("\n"+sec+"sec is "+remains+"sec");
		}

	}

}