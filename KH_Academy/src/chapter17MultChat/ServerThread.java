package chapter17MultChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {
	// ��� ����: Ŭ���̾�Ʈ �̸�, Ŭ���̾�Ʈ ����, �۽ű�, ���ű�

	private String claName;
	private DataInputStream dataInStr;
	private DataOutputStream dataOutStr;
	private Socket claSocket;

	public ServerThread(String claName, DataInputStream dataInStr, DataOutputStream dataOutStr, Socket claSocket) {
		super();
		this.claName = claName;
		this.dataInStr = dataInStr;
		this.dataOutStr = dataOutStr;
		this.claSocket = claSocket;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String mesg = dataInStr.readUTF();
				System.out.println(mesg);
				if (mesg.equalsIgnoreCase("logout")) {
					claSocket.close();
					for (ServerThread st : Server.set) {
						if (st.claName.equals(claName)) {
							Server.set.remove(st);
							break;
						}
					}
					break;
				}
				// ������ ���� �޼����� ��ο��� �ѷ���
				for (ServerThread st : Server.set) {
					st.dataOutStr.writeUTF(claName + " : " + mesg);
				}
			} catch (IOException e) {
				try {
					claSocket.close();
					for (ServerThread st : Server.set) {
						if (st.claName.equals(claName)) {
							Server.set.remove(st);
							break;
						}
					}
					break;
				} catch (IOException e1) {
					break;
				}
			}

		} // end of while()
		if (dataInStr != null) {
			try {
				dataInStr.close();
			} catch (IOException e) {
			}
		}
		if (dataOutStr != null) {
			try {
				dataOutStr.close();
			} catch (IOException e) {
			}
		}
		if (claSocket != null) {
			try {
				claSocket.close();
			} catch (IOException e) {
			}
		}
	}
}
