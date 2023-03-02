import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o número de elementos desejados: ");
		int tam = scan.nextInt();

		int[] numeros = new int[tam];

		for (int i = 0; i < tam; i++) {
			System.out.print("Insira o elemento " + (i + 1) + ":");
			numeros[i] = scan.nextInt();
		}

		// Ordenando Array

		for (int i = 0; i < tam - 1; i++) {
			for (int j = i + 1; j < tam; j++) {
				if (numeros[i] > numeros[j]) {
					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
	}

}
