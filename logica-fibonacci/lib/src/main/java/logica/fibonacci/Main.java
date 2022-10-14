package logica.fibonacci;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		System.out.println("Insira o número de elementos da sequência que você deseja ver: ");
		int vezes = Console.readInt();

		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + " ");
			i = i + j;
			j = i - j;
		}
	}
}
