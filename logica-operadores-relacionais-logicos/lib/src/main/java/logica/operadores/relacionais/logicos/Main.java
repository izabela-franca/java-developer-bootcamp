package logica.operadores.relacionais.logicos;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		// Operadores relacionais

		System.out.println("N�mero 1:");
		int n1 = Console.readInt();

		System.out.println("N�mero 2:");
		int n2 = Console.readInt();

		boolean igual = n1 == n2;
		System.out.println("Iguais? " + igual);

		boolean diferente = n1 != n2;
		System.out.println("Diferentes? " + diferente);

		boolean primeiroMaior = n1 > n2;
		System.out.println("Primeiro � maior? " + primeiroMaior);

		boolean primeiroMenor = n1 < n2;
		System.out.println("Primeiro � menor? " + primeiroMenor);

	}
}
