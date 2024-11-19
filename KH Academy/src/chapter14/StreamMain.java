package chapter14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		String[] name = { "KIM", "LEE", "JU", "CHOI", "CHEE", "PARK" };
		List<String> list1 = Arrays.asList(name);
		
		Stream<String> stream = Arrays.stream(name);
		Stream<String> stream2 = stream.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.startsWith("C");
			}
		});

		Stream<String> stream3 = stream2.sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		List<String> list = stream3.collect(Collectors.toList());

		for (String data : list) {
			System.out.println(data + "\t");
		}
	}
}
