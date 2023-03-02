import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Operadores relacionais

		System.out.println("Número 1:");
		int n1 = scan.nextInt();

		System.out.println("Número 2:");
		int n2 = scan.nextInt();

		boolean igual = n1 == n2;
		System.out.println("Iguais? " + igual);

		boolean diferente = n1 != n2;
		System.out.println("Diferentes? " + diferente);

		boolean primeiroMaior = n1 > n2;
		System.out.println("Primeiro é maior? " + primeiroMaior);

		boolean primeiroMenor = n1 < n2;
		System.out.println("Primeiro é menor? " + primeiroMenor);

	}
	
}
