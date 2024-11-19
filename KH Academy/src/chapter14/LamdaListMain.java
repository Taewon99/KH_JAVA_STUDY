package chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaListMain {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[] { 12, 3, 34, 27, 56, 14 };

		List<Integer> list1 = null;
		List<Integer> list2 = new ArrayList<Integer>();

		list1 = Arrays.asList(intArray);

		for (Integer data : list1) {
			if (data % 2 == 0) {
				list2.add(data);
			}
		}

		for (Integer data : list2) {
			System.out.println(data);
		}
		System.out.println("========================");
		Stream<Integer> stream = list1.stream();
		list1.stream().filter(data -> data % 2 == 0).forEach(data -> System.out.println(data));

		System.out.println("========================");
		list1.stream().filter(data -> data % 2 == 0).forEach(System.out::println);
	}

}
