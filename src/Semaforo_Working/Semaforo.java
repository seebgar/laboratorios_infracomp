package Semaforo_Working;


public class Semaforo{
	
	private int contador;


	public Semaforo() {
		contador = 1;
	}
	
	
	public synchronized void P() {
		contador--;
		System.out.println("contador : " +contador);
		if (contador<0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void V(){
		contador++;
		System.out.println("contador : " +contador);

		if (contador <= 0) {
			notifyAll();
		}
	}






}
