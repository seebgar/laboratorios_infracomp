package Comunicacion;

import java.io.*;
import java.net.*;

public class Cliente {
	
	public final static int PUERTO = 3400;
	public final static String SERVIDOR = "localhost";
	
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		PrintWriter escritor = null;
		BufferedReader lector = null;
		
		System.out.println("Cliente ...");
		
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		
		while (true) {
			socket = new Socket(SERVIDOR, PUERTO);
			escritor = new PrintWriter(socket.getOutputStream(), true);
			lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.println("Escriba su mensaje: ");
			String fromUser = stdIn.readLine();
			
			if (fromUser.equalsIgnoreCase("stop")) {
				stdIn.close();
				escritor.close();
				lector.close();
				socket.close();
				System.exit(-1);
			}
				
			escritor.println(fromUser);
			
			String from_server = lector.readLine();
			System.out.println("Respuesta del servidor : " + (from_server != null ? from_server : "N/A"));
			
		}
		
	}
	
	

}
 