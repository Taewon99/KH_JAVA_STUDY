package chapter03;

public class ArrayTest {

	public static void main(String[] args) {

		int[][] seats = new int[4][5];

		int count = 0;

		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = (int) (Math.random() * (1 - 0 + 1) + 0);
				System.out.print(seats[i][j] + " ");
				if (seats[i][j] == 1) {
					count++;
				}
			}
			System.out.println();
		}
		System.out.println("ÃÑ " + count + "¸í ÀÔ´Ï´Ù.");
	}

}