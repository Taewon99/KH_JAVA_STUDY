package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Stream", "Library");

		List<Integer> result = list.stream().map(str -> str.length()).sorted((o1, o2) -> o1 - o2)
				.collect(Collectors.toList());

		System.out.println(result);
	}

}
