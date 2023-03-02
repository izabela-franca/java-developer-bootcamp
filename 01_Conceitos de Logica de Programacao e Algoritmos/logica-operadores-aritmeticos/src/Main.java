import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Concatenando variáveis

		String nome;
		String sobrenome;

		System.out.println("Digite o nome: ");
		nome = scan.next();

		System.out.println("Digite o sobrenome: ");
		sobrenome = scan.next();

		String nomeCompleto = nome + sobrenome;

		System.out.println("Nome completo: " + nomeCompleto);

		// Cálculo Baskara

		System.out.println("Insira o valor de a: ");
		double a = scan.nextDouble();

		System.out.println("Insira o valor de b: ");
		double b = scan.nextDouble();

		System.out.println("Insira o valor de c: ");
		double c = scan.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

		// Cálculo perímetro de uma hexágono

		System.out.println("Insira o valor do lado: ");
		int lado = scan.nextInt();
		int perimetro = lado * 6;
		double area = (3 * lado * Math.sqrt(3)) / 2;

		System.out.println("Perímetro = " + perimetro);
		System.out.println("Área = " + area);

	}

	
}
