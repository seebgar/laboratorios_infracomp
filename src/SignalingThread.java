import Semaforo_Working.Semaforo;

public class SignalingThread extends Thread {

	private static Semaforo sem = new Semaforo();
	private static Semaforo sem2 = new Semaforo();

	private String tipo;

	public SignalingThread( String T ) {
		tipo = T;
	}

	@Override
	public void run() {

		
		if ( tipo.equals("A") ) {
		
			Signaling.a();
			sem.V();
		}
		else {
			sem.P();
			Signaling.b();
	
		}

		System.out.println(Signaling.get_shared() + " " + tipo);
	}

}
