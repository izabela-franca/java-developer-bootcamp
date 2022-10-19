package logica.recursao;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		System.out.println("Qual fatorial você deseja calcular? ");
		int n = Console.readInt();
		
		System.out.println("O fatorial de " + n + " é " + fatorial(n));
		
	}

	static int fatorial(int n) {

		if (n == 0) {
			return 1;
		}

		return n * fatorial(n - 1);
	}

}
