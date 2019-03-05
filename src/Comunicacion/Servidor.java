package Comunicacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Servidor {
	
	public final static int PUERTO = 3400;
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss = null;
		boolean continuar = true;
		
		System.out.println("Server ...");
		
		try {
			ss = new ServerSocket(PUERTO);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		while (continuar) {
			Socket socket = ss.accept();
			
			PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String entrada = lector.readLine();
			System.out.println("Precesando :: " + entrada);
			
			escritor.println(entrada);
			
			System.out.println("Responde :: " + entrada);
			
			escritor.close();
			lector.close();
		}
		
		
		
	}

}
