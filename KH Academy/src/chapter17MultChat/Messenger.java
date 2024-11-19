package chapter17MultChat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Messenger {
	// 멤버 변수( 포트번호, 데이터를 입력할 Input UI, 데이터 출력 화면 Output UI, InputStream,
	// OutputStream)

	public static final int SERVER_PORT = 5000;

	private JTextField jTextField; // 입력 기능 GUI
	private JTextArea jTextArea; // 출력 기능 GUI
	private DataInputStream dis; // 서버에서 오는 데이터 입력기능
	private DataOutputStream dos; // 서버로 데이터를 출려기능
	private String name;

	public Messenger(String name) throws UnknownHostException, IOException {
		// 화면객체를 생성()
		MyFrame mf = new MyFrame();

		// 서버 소캣 생성
		Socket ss = new Socket("192.168.20.27", SERVER_PORT);
		dis = new DataInputStream(ss.getInputStream());
		dos = new DataOutputStream(ss.getOutputStream());
		this.name = name;

		// 스레드 생성. 3번 방식
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						// 서버가 보낸 메세지 기다림
						String mesg = dis.readUTF();
						jTextArea.append("서버에서 온 메세지" + mesg + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} // end of run
		});
	}

	// 내부 클래스(화면 설계)
	class MyFrame extends JFrame implements ActionListener {
		// 생성자(화면창을 설계)
		public MyFrame() {
			super("Messenger"); // 화면창의 메인 Messenger 클래스
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 화면창의 닫기 기능 활성화

			// 입력창 기능 새팅(위치, 폭, 높이, 여백, 색상, 화면에 표현할 기능, 이벤트 기능)
			jTextField = new JTextField(30);
			jTextField.addActionListener(this); // 여기서 이벤트 기능 구현 (ex. 글을쓰고 엔터를 입력하면 이벤트 작동)

			// 작업창 기능 부여, 편집기능은 x, 스크롤 가능
			jTextArea = new JTextArea(10, 30);
			jTextArea.setEditable(false);
			JScrollPane jscrollpane = new JScrollPane(jTextArea);

			// 화면 위치 배치
			add(jTextField, BorderLayout.PAGE_END); // JFrame 화면 아래 배치
			add(jscrollpane, BorderLayout.CENTER);

			pack();
			setVisible(true);

		}

		// 이벤트 발생하면 입력을하고 엔터만 치면 실행을 해주는 함수
		@Override
		public void actionPerformed(ActionEvent e) {
			String data = jTextField.getText();

			// 서버에 전송
			try {
				dos.writeUTF("(" + name + "):" + data);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			jTextArea.append("SEND: " + data + "\n"); // 내가 서버에 보낸데이터를 텍스트영역에 출력
			jTextField.selectAll(); // 블럭지정
			jTextArea.setCaretPosition(jTextArea.getDocument().getLength()); // 메세지를 계속해서 출력할 수 있도록 마지막 위치 설정
		}

	}

}
