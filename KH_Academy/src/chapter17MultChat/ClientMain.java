package chapter17MultChat;

import java.io.IOException;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		// 클라이언트 소켓을 작동
		// 1. 화면 객체 생성 후 화면에 표시
		// 2. 서버 소켓 생성 및 세팅, 스레드를 자동 시킨 후 서버가 보낸메세지를 화면에 표시
		try {
			Messenger messenger = new Messenger("이태원");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
