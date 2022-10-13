package logica.repeticaofor;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Insira a tabuada que deseja ver: ");
		int n = Console.readInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}
}
