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
		// 서버 소켓 만듬
		ServerSocket ss = null;
		Socket clientSocket = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			ss = new ServerSocket(5001);
			// 클라이언트 접속을 기디림(접속 할 때까지 무한대기)
			System.out.println("서버가 클라이언트 접속대기");
			clientSocket = ss.accept();
			// inputStream-> BufferedReader, outputStream->PrintWriter
			br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			pw = new PrintWriter(clientSocket.getOutputStream());
			System.out.println("클라이언트와 대화할 송수신기 완성");
			// 대화를 나눔 (프로토콜); 서버 활동 순서: 수신("quit"일 때는 종료), 화면에 띄우기, 입력(클라이언트 보낼 메세지), 송신
			while (true) {
				// 수신("quit"일 때는 종료),
				String input = br.readLine();
				if (input.equalsIgnoreCase("quit")) {
					break;
				}
				// 화면에 띄우기
				System.out.println("client: " + input);
				// 입력(클라이언트 보낼 메세지)
				System.out.print("클라이언트 보낼 메세지: ");
				String output = scan.nextLine();
				// 송신
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
		System.out.println("서버소켓 종료");
	}

}
