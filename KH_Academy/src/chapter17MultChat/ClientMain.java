package chapter17MultChat;

import java.io.IOException;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		// Ŭ���̾�Ʈ ������ �۵�
		// 1. ȭ�� ��ü ���� �� ȭ�鿡 ǥ��
		// 2. ���� ���� ���� �� ����, �����带 �ڵ� ��Ų �� ������ �����޼����� ȭ�鿡 ǥ��
		try {
			Messenger messenger = new Messenger("���¿�");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
