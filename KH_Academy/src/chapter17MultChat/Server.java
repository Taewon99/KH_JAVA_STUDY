package chapter17MultChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;

// ���ڰ� Ŭ���̾�Ʈ���� �����͸� �ְ� �޴� ��
public class Server {

	// ����Ŭ���̾�Ʈ ���� ���� �÷��� �����ӿ�ũ
	public static ArrayList<ServerThread> list = new ArrayList<ServerThread>();
	public static HashSet<ServerThread> set = new HashSet<ServerThread>();
	public static int clientCount = 0;

	public static void main(String[] args) throws IOException {
		// ������Ĺ ����
		ServerSocket ss = new ServerSocket(5000);
		while (true) {

			// Ŭ���̾�Ʈ�� �����ϵ��� ��ٸ���, �����ϸ� Ŭ���̾�Ʈ ���� ����
			Socket clientSocket = ss.accept();
			clientCount++;

			// Ŭ���̾�Ʈ �ۼ��ű� ����
			DataInputStream dataInStr = new DataInputStream(clientSocket.getInputStream());
			DataOutputStream dataOutStr = new DataOutputStream(clientSocket.getOutputStream());

			// ���� ������ ����
			ServerThread serverThread = new ServerThread("Client" + clientCount, dataInStr, dataOutStr, clientSocket);

			// ����Ŭ���̾�Ʈ ���� ���� �÷��� �����ӿ�ũ�� ���
			list.add(serverThread);

			serverThread.start();
		}
	}

}
