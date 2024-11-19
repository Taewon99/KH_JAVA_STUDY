package chapter17Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NaverMain {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com:443");

		URLConnection urlConn = url.openConnection();
//
//		InputStream is = urlConn.getInputStream();
//
//		InputStreamReader isr = new InputStreamReader(is);

		BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
		
		String data = null;
		while((data = br.readLine()) != null) {
			System.out.println(data);
		}

	}

}
