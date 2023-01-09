package protocal.tcp;

import java.io.*;
import java.net.*;

public class ServerSide {
	
	public static void main(String[] args) throws Exception {

		System.out.println("Server started....");
		ServerSocket ss = new ServerSocket(7271);

		System.out.println("Wait for Client Response...");
		Socket s = ss.accept();

		System.out.println("Connected....");

		InputStream is = new DataInputStream(s.getInputStream());

		int data;
		while ((data = is.read()) != -1) {
			System.out.print("Input "+ data + " \t " +(char) data);
		}

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(s.getInputStream()));
		//
		// String name = br.readLine();
		//
		// System.out.println("Your Office :) " + name);

	}

}
