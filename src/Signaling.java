
public class Signaling {
	
	private static int shared;

	public static void a() {
		shared += 1;
	}

	public static void b() {
		shared += 1000;
	}
	
	public static int get_shared() {
		return shared;
	}
	
	/**
	 * 
	 */
	
	public static void main(String[] args) {
		SignalingThread a = new SignalingThread("A" );
		SignalingThread b = new SignalingThread("B");
		
		int orden = (int) (Math.random() * 100) % 2;
		if (orden == 0) {
			System.out.println("Inicia a");
			a.start();
			b.start();
		} else {
			System.out.println("Inicia b");
			b.start();
			a.start();
		}
		
	}
	
	

}
