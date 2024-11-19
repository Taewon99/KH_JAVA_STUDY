package chapter08;

import java.util.Arrays;
import java.util.Collections;

public class WrapperMain {

	public static void main(String[] args) {
		String data ="abcdef";
		System.out.println();
		int[] array = {1,2,3,4,5,6,7,8,9};
		int i = 100;
		System.out.println(i);

		Integer i2 = new Integer(100);
		Integer i3 = 1000;
		double i4 =Double.parseDouble("100.0");
		
		String a = "abcde";
		
		System.out.println(a.charAt(0));
		System.out.println(i4+100);
		System.out.println(i2.toString());
		
		Integer[] array2 = {1,4,7,3,10,9,5,6,2,7};
		Arrays.sort(array2, Collections.reverseOrder());
		for (int j=0; j<array2.length; j++) {
			System.out.print(array2[j]+", ");
		}
	}

}
