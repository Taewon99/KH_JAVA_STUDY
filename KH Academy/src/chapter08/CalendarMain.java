package chapter08;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		Calendar d = Calendar.getInstance();

		System.out.println(d);
		System.out.println(d.get(Calendar.YEAR)+"��");
		System.out.println(d.get(Calendar.MONTH)+1+"��");
	}

}
