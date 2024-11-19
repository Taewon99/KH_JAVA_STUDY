package chapter15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {

		int rValue = 0;
		char[] dataArray = new char[5];

		try (FileReader fr = new FileReader("data.txt")) {
			while ((rValue = fr.read(dataArray)) != -1) {
				System.out.print(String.valueOf(dataArray) + "");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
