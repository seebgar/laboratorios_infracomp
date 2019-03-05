package Semaforo_Working;

public class mutexThread extends Thread{

	private String namee;

	public mutexThread(String name){
		namee = name;
	}

	public void run() {
		Semaforo s= new Semaforo();
		if (namee.equals("A")) {
			s.P();
			mutex.a();
			s.V();
		}
		else if (namee.equals("B")) {
			s.P();
			mutex.b();
			s.V();
		}

	}


}
