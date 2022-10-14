package logica.array;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		// Declarando Array
		double[] notas = new double[4];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Insira a nota " + (i + 1) + ":");
			notas[i] = Console.readDouble();
		}

		// Usando Enhanced For / For Each
		for (double nota : notas) {
			System.out.println(nota);
		}

		// Criando array diretamente
		double[] notas2 = { 8.5, 9, 9.4 };

	}
}
