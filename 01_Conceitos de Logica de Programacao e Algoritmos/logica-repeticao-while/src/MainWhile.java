import java.util.Scanner;

public class MainWhile {
	
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota = 0;
		int cont = 1;
		double soma = 0;
		
		while (nota != -1) {
			System.out.println("Digite a nota " + cont + ":");
			nota = scan.nextDouble();
			
			if (nota == -1) {
				break;
			}
			
			cont++;
			soma += nota;
		}
		System.out.println("Média = " + soma/(cont - 1));
	}

}
