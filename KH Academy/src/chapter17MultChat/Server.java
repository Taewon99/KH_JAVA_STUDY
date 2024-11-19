package chapter17MultChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;

// 다자간 클라이언트간에 데이터를 주고 받는 것
public class Server {

	// 공동클라이언트 소켓 정보 컬렉션 프레임워크
	public static ArrayList<ServerThread> list = new ArrayList<ServerThread>();
	public static HashSet<ServerThread> set = new HashSet<ServerThread>();
	public static int clientCount = 0;

	public static void main(String[] args) throws IOException {
		// 서버소캣 생성
		ServerSocket ss = new ServerSocket(5000);
		while (true) {

			// 클라이언트가 접속하도록 기다리고, 접속하면 클라이언트 소켓 생성
			Socket clientSocket = ss.accept();
			clientCount++;

			// 클라이언트 송수신기 생성
			DataInputStream dataInStr = new DataInputStream(clientSocket.getInputStream());
			DataOutputStream dataOutStr = new DataOutputStream(clientSocket.getOutputStream());

			// 서버 스레드 생성
			ServerThread serverThread = new ServerThread("Client" + clientCount, dataInStr, dataOutStr, clientSocket);

			// 공동클라이언트 소켓 정보 컬렉션 프레임워크에 등록
			list.add(serverThread);

			serverThread.start();
		}
	}

}
