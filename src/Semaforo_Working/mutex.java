package Semaforo_Working;
public class mutex {

	private static int contador;
	
	public mutex(){
		
	}
	
	public static void a(){
		contador+= 1000;		
		System.out.println("a : "+contador);

	}
	
	public static void b(){
		contador++;
		System.out.println("b : "+contador);
	}
	
	public static void main(String[] args) {
		mutexThread a = new mutexThread("A");
		mutexThread b = new mutexThread("B");

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
