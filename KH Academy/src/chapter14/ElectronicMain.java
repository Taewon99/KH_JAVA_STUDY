package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ElectronicMain {

	public static void main(String[] args) {
		List<Electronics> list = new ArrayList<Electronics>();

		list.add(new Electronics("TV", 3300000));
		list.add(new Electronics("Air Conditioner", 4000000));
		list.add(new Electronics("SmartPhone", 1000000));
		list.add(new Electronics("DeskTop", 2000000));

		List<String> result = list.stream().filter(price -> price.getPrice() >= 3000000)
				.sorted((o1, o2) -> o1.getPrice() - o2.getPrice()).map(Electronics::getName)
				.collect(Collectors.toList());

		System.out.println(result);
	}

}
