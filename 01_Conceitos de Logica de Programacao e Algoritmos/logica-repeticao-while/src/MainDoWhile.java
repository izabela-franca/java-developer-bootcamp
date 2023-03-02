import java.util.Scanner;

public class MainDoWhile {

public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		double nota;
		int cont = 1;
		double soma = 0;
		
		do {
			System.out.println("Digite a nota " + cont + ":");
			nota = scan.nextDouble();
			
			if (nota != -1) {
				soma += nota;
				cont++;
			}
			
		} while (nota != -1);
		System.out.println("Média = " + soma/(cont - 1));
		
	}
	
}
