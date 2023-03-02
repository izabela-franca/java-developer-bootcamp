import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira a tabuada que deseja ver: ");
		int n = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}

}
