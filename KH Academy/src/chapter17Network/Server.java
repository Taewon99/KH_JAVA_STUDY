package chapter17Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// ���� ���� ����
		ServerSocket ss = null;
		Socket clientSocket = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			ss = new ServerSocket(5001);
			// Ŭ���̾�Ʈ ������ ���(���� �� ������ ���Ѵ��)
			System.out.println("������ Ŭ���̾�Ʈ ���Ӵ��");
			clientSocket = ss.accept();
			// inputStream-> BufferedReader, outputStream->PrintWriter
			br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			pw = new PrintWriter(clientSocket.getOutputStream());
			System.out.println("Ŭ���̾�Ʈ�� ��ȭ�� �ۼ��ű� �ϼ�");
			// ��ȭ�� ���� (��������); ���� Ȱ�� ����: ����("quit"�� ���� ����), ȭ�鿡 ����, �Է�(Ŭ���̾�Ʈ ���� �޼���), �۽�
			while (true) {
				// ����("quit"�� ���� ����),
				String input = br.readLine();
				if (input.equalsIgnoreCase("quit")) {
					break;
				}
				// ȭ�鿡 ����
				System.out.println("client: " + input);
				// �Է�(Ŭ���̾�Ʈ ���� �޼���)
				System.out.print("Ŭ���̾�Ʈ ���� �޼���: ");
				String output = scan.nextLine();
				// �۽�
				pw.println(output);
				pw.flush();
			}
		} catch (IOException e) {
		} finally {
			try {
				clientSocket.close();
				ss.close();
				br.close();
				pw.close();
			} catch (IOException e) {
			}
		}
		System.out.println("�������� ����");
	}

}
