package driveCarTest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DriveTest {

	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Move> list = new ArrayList<Move>();
	public static final int CAR_DRIVE = 1, EV_CAR_DRIVE = 2, DONE = 3, TURN_ON = 1, SPEED_UP = 2, SPEED_DOWN = 3,
			TURN_OFF = 4;

	public static void main(String[] args) {
		list.add(new Car("MASERATI"));
		list.add(new EvCar("EV3"));

		boolean doneFlag = false;

		while (doneFlag == false) {
			int userInput = 0;

			System.out.print("운행하실 차를 선택 해주세요 1. 자동차 2. 전기차 3. 쉴래요: ");
			Pattern pattern = Pattern.compile("[1-3]");
			String data = scan.nextLine();
			Matcher match = pattern.matcher(data);
			boolean bool = match.matches();
			if (bool == false) {
				System.out.println("\n1,2,3 중에 골라주세요\n");
				continue;
			}
			userInput = Integer.parseInt(data);
//			try {
//				userInput = scan.nextInt();
//			} catch (InputMismatchException e) {
//			} catch (Exception e) {
//			}
			if (!(userInput == 1 || userInput == 2 || userInput == 3)) {
				System.out.println("\n1,2,3 중에 골라주세요");
			}
			System.out.println();

			switch (userInput) {
			case CAR_DRIVE:
				carDrive(userInput);
				break;
			case EV_CAR_DRIVE:
				evCarDrive(userInput);
				break;
			case DONE:
				doneFlag = true;
				System.out.println("종료 합니다.");
				break;
			}

		}
		System.out.println("The end");
	}

	public static void carDrive(int userInput) {
		Vehicle car = (Car) list.get(userInput - 1);
		do {
			drive(userInput - 1);
		} while (car.isOn() == true);
	}

	public static void evCarDrive(int userInput) {
		Vehicle evCar = (EvCar) list.get(userInput - 1);
		do {
			drive(userInput - 1);
		} while (evCar.isOn() == true);
	}

	public static void drive(int type) {
		int userInput = 0;

		System.out.print("운행 방식을 선택 해주세요 1.시동 2.가속 3.감속 4.시동끔: ");
		try {
			userInput = scan.nextInt();
		} catch (InputMismatchException e) {
		} catch (Exception e) {
		}
		if (!(userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4)) {
			System.out.println("\n1,2,3 중에 골라주세요\n");
		}

		System.out.println();
		scan.nextLine();

		switch (userInput) {
		case TURN_ON:
			list.get(type).start();
			break;
		case SPEED_UP:
			System.out.print("가속 할 속도를 입력해주세요: ");
			int speedUp = scan.nextInt();
			System.out.println();
			list.get(type).speedUp(speedUp);
			break;
		case SPEED_DOWN:
			System.out.print("감속 할 속도를 입력해주세요: ");
			int speedDown = scan.nextInt();
			System.out.println();
			list.get(type).speedDown(speedDown);
			break;
		case TURN_OFF:
			list.get(type).stop();
			break;
		}
	}
}