package chapter17Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Socket ss = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			
			ss = new Socket("192.168.20.106", 2500);
			
			pw = new PrintWriter(ss.getOutputStream());
			br = new BufferedReader(new InputStreamReader(ss.getInputStream()));

			while (true) {
				
				System.out.print("������ ���� �޼���: ");
				String output = scan.nextLine();
				
				pw.println(output);
				pw.flush();
				if (output.equalsIgnoreCase("quit")) {
					System.out.println("Ŭ���̾�Ʈ�� ���Ḧ ��û�Ͽ����ϴ�.");
					break;
				}
				
				String input = br.readLine();

				System.out.println("�������� ���� �޼���: " + input);
			}

		} catch (UnknownHostException e) {
		} catch (IOException e) {
			System.out.println("������ �������ϴ�.");
		} finally {
			try {
				ss.close();
				pw.close();
				br.close();
			} catch (IOException e) {
			}
		}
		System.out.println("Ŭ���̾�Ʈ ����");
	}

}
