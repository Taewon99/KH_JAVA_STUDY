package chapter14;

import java.util.ArrayList;
import java.util.List;

public class CarMainLamda {

	public static void main(String[] args) {
		List<CarLamda> list = new ArrayList<CarLamda>();
		List<CarLamda> list2 = null;

		list.add(new CarLamda(1, "Bens SCLASS", "BLACK", 11000));
		list.add(new CarLamda(2, "BNW 9", "BLUE", 8000));
		list.add(new CarLamda(3, "KEA 9", "WHITE", 7000));
//
//		for (CarLamda data : list) {
//			if (data.getColor().equals("WHITE")) {
//				list2.add(data);
//			}
//		}
//
//		for (CarLamda data : list2) {
//			System.out.println(data.toString());
//		}
//		// 1단계
//		String color = "WHITE";
//		int price = 7000;
//		MyCarPredicate mcp = new MyCarPredicate();
//		list2 = filterCar(list, mcp);
//		for (CarLamda data : list2) {
//			System.out.println(data.toString());
//		}
//
//		// 2단계
//
//		CarPredicate cp = new CarPredicate() {
//
//			@Override
//			public boolean test(CarLamda data) {
//				return (data.getColor().equals("WHITE") && data.getPrice() >= 7000);
//			}
//
//		};
//		list2 = filterCar(list, mcp);
//		for (CarLamda data : list2) {
//			System.out.println(data.toString());
//		}
//
//		// 3단계
//		list2 = filterCar(list, new CarPredicate() {
//
//			@Override
//			public boolean test(CarLamda data) {
//				return (data.getColor().equals("WHITE") && data.getPrice() >= 7000);
//
//			}
//		});
//		for (CarLamda data : list2) {
//			System.out.println(data.toString());
//		}

		// 4단계 람다식
		list2 = filterCar(list, data -> (data.getColor().equals("WHITE") && data.getPrice() >= 7000));

		for (CarLamda data : list2) {
			System.out.println(data.toString());
		}
	}

//	private static List<CarLamda> filterCar(List<CarLamda> list, String color, int price) {
//		List<CarLamda> list2 = new ArrayList<CarLamda>();
//		for (CarLamda data : list) {
//			if (data.getColor().equals("WHITE") && data.getPrice() >= price) {
//				list2.add(data);
//			}
//		}
//		return list2;
//	}
	private static List<CarLamda> filterCar(List<CarLamda> list, CarPredicate carPredicate) {
		List<CarLamda> list2 = new ArrayList<CarLamda>();
		for (CarLamda data : list) {
			if (carPredicate.test(data)) {
				list2.add(data);
			}
		}
		return list2;
	}

}
