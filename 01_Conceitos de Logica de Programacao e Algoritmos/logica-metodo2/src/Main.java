import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a temperatura: ");
		double temp = scan.nextDouble();

		System.out.println("Qual a conversão?");
		System.out.println("1 - F -> C");
		System.out.println("2 - C -> F");
		int opcao = scan.nextInt();

		double r;

		if (opcao == 1) {
			r = converterParaCelsius(temp);
		} else if (opcao == 2) {
			r = converterParaFahrenheit(temp);
		} else {
			System.out.println("Opção inválida");
			return;
		}

		System.out.println("A temperatura convertida é " + r);

	}

	static double converterParaCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) / 1.8;
		return celsius;
	}

	static double converterParaFahrenheit(double celsius) {
		return celsius * 1.8 + 32;
	}

}
