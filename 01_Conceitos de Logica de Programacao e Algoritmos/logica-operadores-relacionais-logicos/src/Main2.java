
public class Main2 {

	public static void main(String[] args) {

		// Operadores Lógicos

		boolean a = true;
		boolean b = !a; // negação

		System.out.println("b = " + b);

		boolean c = true;
		boolean d = false;
		boolean e = c && d; // conjunção (E)
		boolean f = c || d; // disjunção (OU)

		System.out.println("e = " + e);
		System.out.println("f = " + f);
	}
	
}
