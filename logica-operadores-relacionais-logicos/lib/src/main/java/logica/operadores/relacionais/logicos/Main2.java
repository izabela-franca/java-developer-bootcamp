package logica.operadores.relacionais.logicos;

public class Main2 {

	public static void main(String[] args) {

		// Operadores L�gicos

		boolean a = true;
		boolean b = !a; // nega��o

		System.out.println("b = " + b);

		boolean c = true;
		boolean d = false;
		boolean e = c && d; // conjun��o (E)
		boolean f = c || d; // disjun��o (OU)

		System.out.println("e = " + e);
		System.out.println("f = " + f);
	}

}
