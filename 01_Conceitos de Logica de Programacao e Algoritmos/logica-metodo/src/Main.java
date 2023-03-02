
public class Main {

	public static void main(String[] args) {

		calcularFibonacci(10, "-");

		System.out.println();

		int[] valores = calcularFibonacci(10);

		for (int v : valores) {
			System.out.print(v + "-");
		}

	}

	// Criando um método sem retorno
	static void calcularFibonacci(int vezes, String separador) {
		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + separador);
			i = i + j;
			j = i - j;
		}
	}

	// Criando um método retornando Array
	static int[] calcularFibonacci(int vezes) {

		int[] resposta = new int[vezes];

		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			i = i + j;
			j = i - j;

			resposta[cont] = i;
		}
		return resposta;
	}

	
}
