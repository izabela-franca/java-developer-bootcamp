import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual fatorial você deseja calcular? ");
		int n = scan.nextInt();
		
		System.out.println("O fatorial de " + n + " é " + fatorial(n));
		
	}

	static int fatorial(int n) {

		if (n == 0) {
			return 1;
		}

		return n * fatorial(n - 1);
	}
	
}
