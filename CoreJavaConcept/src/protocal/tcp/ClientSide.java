package protocal.tcp;

import java.io.*;
import java.net.*;

public class ClientSide {
	
	public static void main(String[] args) throws Exception {

		String ip = "localhost";

		int port = 7271;

		Socket socket = new Socket(ip, port);

		String officeName = "boodskap";

		PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
		
		out.println(officeName);
		//out.write(officeName);

	}

}
