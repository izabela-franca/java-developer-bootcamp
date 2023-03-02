import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira a sua idade: ");
		int idade = scan.nextInt();

		if (idade >= 0 && idade <= 12) {
			System.out.println("Você é uma criança.");
		} else if (idade > 12 && idade < 18) {
			System.out.println("Você é um adolescente.");
		} else if (idade >= 18 && idade < 60) {
			System.out.println("Você é um adulto.");
		} else if (idade >= 60){
			System.out.println("Você é um idoso.");
		} else {
			System.out.println("Idade inválida.");
		}

	}
	
}
