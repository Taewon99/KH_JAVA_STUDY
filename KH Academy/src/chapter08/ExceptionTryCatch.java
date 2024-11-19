package chapter08;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionTryCatch {
	public static final int EOF = -1;

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("data.txt");
		while (true) {
			char read = (char) fr.read();

			if (read == EOF) {
				break;
			}
			System.out.print((char) read);
		}
		if (fr != null) {
			fr.close();
		}
		System.out.println("The end");
	}

}
