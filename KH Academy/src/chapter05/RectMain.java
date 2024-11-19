package chapter05;

public class RectMain {

	public static void main(String[] args) {
		int[] intArray = new int[3];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = 10 * (i + 1);
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}

		Rect[] objArray = new Rect[3];

		for (int i = 0; i < objArray.length; i++) {
			objArray[i] = new Rect(10 * (i + 1), 10 * (i + 1));
		}

		for (int i = 0; i < objArray.length; i++) {
			System.out.println("objArray[" + i + "] = " + objArray[i].toString());
			System.out.println("objArray[" + i + "] Area = " + objArray[i].getArea());
		}

	}

}
