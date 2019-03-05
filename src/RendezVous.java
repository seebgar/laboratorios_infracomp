
public class RendezVous {
	
	private static int shared = 0;
	
	public static  void a1() {
		shared += 1;
	}
	
	public static synchronized void a2() {
		shared += 500;
	}
	
	public static  void b1() {
		shared += 1000;
	}
	
	public static synchronized void b2() {
		shared += 700;
	}
	
	public static int get_shared() {
		return shared;
	}
	
	public static void main(String[] args) {
		RendezVousThread a = new RendezVousThread("A");
		RendezVousThread b = new RendezVousThread("B");
		
		a.start();
		b.start();
	}
	

}
