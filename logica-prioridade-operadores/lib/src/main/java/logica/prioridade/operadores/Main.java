package logica.prioridade.operadores;

public class Main {

	public static void main(String[] args) {

		// Prioridades em operadores: aritm�tico > relacional > l�gicos (n�o > e > ou)

		boolean v = true;

		boolean x = 5 * 3 + Math.sqrt(7 * 7) <= 100 || !v && v;
		System.out.println(x);
	}

}