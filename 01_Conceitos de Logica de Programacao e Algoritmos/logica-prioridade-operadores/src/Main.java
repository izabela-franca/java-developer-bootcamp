
public class Main {

	public static void main(String[] args) {

		// Prioridades em operadores: aritmético > relacional > lógicos (não > e > ou)

		boolean v = true;

		boolean x = 5 * 3 + Math.sqrt(7 * 7) <= 100 || !v && v;
		System.out.println(x);
	}

	
}
