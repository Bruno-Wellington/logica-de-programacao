package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1010 {

	public static void main(String[] args) {
		/* Neste problema deve-se ler o código de uma peça 1, o número de peças 1, o
		valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2, o
		valor unitário de cada peça 2 e calcula e mostra o valor a ser pago.

		Entrada
		O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3
		valores, respectivamente dois inteiros e um valor com 2 casas decimais.

		Saída
		A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando
		de deixar um espaço após os dois pontos e um espaço após o $. O valor deverá
		ser apresentado com 2 casas após o ponto. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int nPeca1 = sc.nextInt();
		double vUniPeca1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int nPeca2 = sc.nextInt();
		double vUniPeca2 = sc.nextDouble();
		
		double VALOR = (nPeca1 * vUniPeca1) + (nPeca2 * vUniPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", VALOR);
	
		sc.close();
	}
	
}
