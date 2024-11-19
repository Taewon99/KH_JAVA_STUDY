package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNum {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 8; i++) {
			list.add(i);
		}

		List<Integer> list2 = list.stream().filter(num -> num % 2 == 0).map(n -> n * n).sorted((o1, o2) -> o1 - o2)
				.collect(Collectors.toList());

		System.out.println(list2);

	}

}
