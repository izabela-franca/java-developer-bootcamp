package logica.repeticaowhile;

import br.com.softblue.commons.io.Console;

public class MainWhile {

	public static void main (String args[]) {
	
		double nota = 0;
		int cont = 1;
		double soma = 0;
		
		while (nota != -1) {
			System.out.println("Digite a nota " + cont + ":");
			nota = Console.readDouble();
			
			if (nota == -1) {
				break;
			}
			
			cont++;
			soma += nota;
		}
		System.out.println("M�dia = " + soma/(cont - 1));
	}
}
