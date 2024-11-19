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
	// ��� ����( ��Ʈ��ȣ, �����͸� �Է��� Input UI, ������ ��� ȭ�� Output UI, InputStream,
	// OutputStream)

	public static final int SERVER_PORT = 5000;

	private JTextField jTextField; // �Է� ��� GUI
	private JTextArea jTextArea; // ��� ��� GUI
	private DataInputStream dis; // �������� ���� ������ �Է±��
	private DataOutputStream dos; // ������ �����͸� ������
	private String name;

	public Messenger(String name) throws UnknownHostException, IOException {
		// ȭ�鰴ü�� ����()
		MyFrame mf = new MyFrame();

		// ���� ��Ĺ ����
		Socket ss = new Socket("192.168.20.27", SERVER_PORT);
		dis = new DataInputStream(ss.getInputStream());
		dos = new DataOutputStream(ss.getOutputStream());
		this.name = name;

		// ������ ����. 3�� ���
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						// ������ ���� �޼��� ��ٸ�
						String mesg = dis.readUTF();
						jTextArea.append("�������� �� �޼���" + mesg + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} // end of run
		});
	}

	// ���� Ŭ����(ȭ�� ����)
	class MyFrame extends JFrame implements ActionListener {
		// ������(ȭ��â�� ����)
		public MyFrame() {
			super("Messenger"); // ȭ��â�� ���� Messenger Ŭ����
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ȭ��â�� �ݱ� ��� Ȱ��ȭ

			// �Է�â ��� ����(��ġ, ��, ����, ����, ����, ȭ�鿡 ǥ���� ���, �̺�Ʈ ���)
			jTextField = new JTextField(30);
			jTextField.addActionListener(this); // ���⼭ �̺�Ʈ ��� ���� (ex. �������� ���͸� �Է��ϸ� �̺�Ʈ �۵�)

			// �۾�â ��� �ο�, ��������� x, ��ũ�� ����
			jTextArea = new JTextArea(10, 30);
			jTextArea.setEditable(false);
			JScrollPane jscrollpane = new JScrollPane(jTextArea);

			// ȭ�� ��ġ ��ġ
			add(jTextField, BorderLayout.PAGE_END); // JFrame ȭ�� �Ʒ� ��ġ
			add(jscrollpane, BorderLayout.CENTER);

			pack();
			setVisible(true);

		}

		// �̺�Ʈ �߻��ϸ� �Է����ϰ� ���͸� ġ�� ������ ���ִ� �Լ�
		@Override
		public void actionPerformed(ActionEvent e) {
			String data = jTextField.getText();

			// ������ ����
			try {
				dos.writeUTF("(" + name + "):" + data);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			jTextArea.append("SEND: " + data + "\n"); // ���� ������ ���������͸� �ؽ�Ʈ������ ���
			jTextField.selectAll(); // ������
			jTextArea.setCaretPosition(jTextArea.getDocument().getLength()); // �޼����� ����ؼ� ����� �� �ֵ��� ������ ��ġ ����
		}

	}

}
