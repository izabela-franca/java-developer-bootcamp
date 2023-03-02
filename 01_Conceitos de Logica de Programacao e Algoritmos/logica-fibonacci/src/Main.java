import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o número de elementos da sequência que você deseja ver: ");
		int vezes = scan.nextInt();

		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + " ");
			i = i + j;
			j = i - j;
		}
	}
	
}
