package chapter03;

public class Star {

	public static void main(String[] args) {

		System.out.println("1번");

		int n = 7;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("2번");

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("3번");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("_");
			}
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("4번");

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print("_");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("5번");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("_");
			}
			for (int j = n * 2; j > i * 2 + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("6번");

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i + 1; j--) {
				System.out.print("_");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("7번");

		for (int i = 0; i < n; i++) {
			if (i / 4 == 0) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = n; j > i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("8번");

		for (int i = 0; i < n; i++) {
			if (i / 4 == 0) {
				for (int j = n - 1; j > i; j--) {
					System.out.print("_");
				}
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i; j++) {
					System.out.print("_");
				}
				for (int j = n; j > i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("9번");

		for (int i = 0; i < n; i++) {
			if (i / 4 == 0) {
				for (int j = 0; j < i; j++) {
					System.out.print("_");
				}
				for (int j = n; j >= i * 2 + 1; j--) {
					System.out.print("*");
				}
			} else {
				for (int j = n; j > i + 1; j--) {
					System.out.print("_");
				}
				for (int j = 0; j < i * 2 - 5; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("10번");

		for (int i = 0; i < n; i++) {
			if (i / 4 == 0) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				for (int j = n; j > i * 2 + 1; j--) {
					System.out.print("_");
				}
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = n; j > i; j--) {
					System.out.print("*");
				}
				for (int j = 0; j < i * 2 - 6; j++) {
					System.out.print("_");
				}
				for (int j = n; j > i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("11번");

		for (int i = 0; i < n; i++) {
			if (i / 4 == 0) {
				for (int j = n - 3; j > i + 1; j--) {
					System.out.print("_");
				}
				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0 + 3; j < i; j++) {
					System.out.print("_");
				}
				for (int j = n * 2; j > i * 2 + 1; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("12번");

		for (int i = 0; i < n; i++) {
			if (i / 4 == 0) {
				for (int j = n - 2; j > i + 1; j--) {
					System.out.print("*");
				}
				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print("_");
				}
				for (int j = n - 2; j > i + 1; j--) {
					System.out.print("*");
				}
			} else {
				for (int j = 0 + 2; j < i; j++) {
					System.out.print("*");
				}
				for (int j = n * 2; j > i * 2 + 1; j--) {
					System.out.print("_");
				}
				for (int j = 0 + 2; j < i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("\nThe end");
	}

}
