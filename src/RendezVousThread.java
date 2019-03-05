import Semaforo_Working.Semaforo;

public class RendezVousThread extends Thread {

	private String tipo;
	
	public RendezVousThread( String T) {
		tipo = T;
	}
	
	@Override
	public void run() {
		Semaforo sem = new Semaforo();
		sem.P();
		if ( tipo.equals("A") ) {
			RendezVous.a1();
			sem.V();
		} else {
			RendezVous.b1();
			sem.V();
		}
		System.out.println(RendezVous.get_shared() + " " + tipo);
		
	}
	
}
