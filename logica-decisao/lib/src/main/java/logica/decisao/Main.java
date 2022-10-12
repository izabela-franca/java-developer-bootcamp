package logica.decisao;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		System.out.println("Insira a sua idade: ");
		int idade = Console.readInt();

		if (idade >= 0 && idade <= 12) {
			System.out.println("Voc� � uma crian�a.");
		} else if (idade > 12 && idade < 18) {
			System.out.println("Voc� � um adolescente.");
		} else if (idade >= 18 && idade < 60) {
			System.out.println("Voc� � um adulto.");
		} else if (idade >= 60){
			System.out.println("Voc� � um idoso.");
		} else {
			System.out.println("Idade inv�lida.");
		}

	}

}
