package logica.repeticaowhile;

import br.com.softblue.commons.io.Console;

public class MainDoWhile {

	public static void main (String[] args) {
		
		double nota;
		int cont = 1;
		double soma = 0;
		
		do {
			System.out.println("Digite a nota " + cont + ":");
			nota = Console.readDouble();
			
			if (nota != -1) {
				soma += nota;
				cont++;
			}
			
		} while (nota != -1);
		System.out.println("M?dia = " + soma/(cont - 1));
		
	}
}
