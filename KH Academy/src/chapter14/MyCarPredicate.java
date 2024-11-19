package chapter14;


public class MyCarPredicate implements CarPredicate {

	@Override
	public boolean test(CarLamda data) {
		return (data.getColor().equals("WHITE") && data.getPrice() >= 7000);
	}

}
