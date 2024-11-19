package chapter17Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class NISTSocketMain {

	public static void main(String[] args) {
		// new File("NIST.txt")
		Socket socket = null;
		BufferedReader bfReader = null;
		try {
			socket = new Socket("time-c.nist.gov", 13);
//			InputStream inStream = socket.getInputStream();
//			
//			InputStreamReader inStreamReader = new InputStreamReader(inStream);
			bfReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = null;
			while ((data = bfReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} finally {
			try {
				socket.close();
				bfReader.close();
			} catch (IOException e) {
			}
		}
		System.out.println("the end");
	}

}
