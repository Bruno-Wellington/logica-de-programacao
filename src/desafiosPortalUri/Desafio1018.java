package desafiosPortalUri;

import java.util.Scanner;

public class Desafio1018 {

	public static void main(String[] args) {
		/* Leia um valor inteiro. A seguir, calcule o menor número de 
		 * notas possíveis (cédulas) no qual o valor pode ser decomposto. 
		 * As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir 
		 * mostre o valor lido e a relação de notas necessárias.
		 * 
		 * Entrada
		 * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
		 * 
		 * Saída
		 * Imprima o valor lido e, em seguida, a quantidade mínima de notas de 
		 * cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de 
		 * imprimir o fim de linha após cada linha, caso contrário seu programa 
		 * apresentará a mensagem: “Presentation Error”. */
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		int nota1 = 1;
		int nota2 = 2;
		int nota5 = 5;
		int nota10 = 10;
		int nota20 = 20;
		int nota50 = 50;
		int nota100 = 100;
		
		N = sc.nextInt();
		System.out.println(N);
		
		nota100 = N / nota100;
		System.out.println(nota100 + " notas(s) de R$ 100,00");
		
		N = N % 100;
		nota50 = N / nota50;
		System.out.println(nota50 + " notas(s) de R$ 50,00");
		
		N = N % 50;
		nota20 = N / nota20;
		System.out.println(nota20 + " notas(s) de R$ 20,00");
		
		N = N % 20;
		nota10 = N / nota10;
		System.out.println(nota10 + " notas(s) de R$ 10,00");

		N = N % 10;
		nota5 = N / 5;
		System.out.println(nota5 + " notas(s) de R$ 5,00");
		
		N = N % 5;
		nota2 = N / nota2;
		System.out.println(nota2  + " notas(s) de R$ 2,00");
		
		N = N % 2;
		nota1 = N / 1;
		System.out.println(nota1 + " notas(s) de R$ 1,00");
		
		sc.close();
	}
	
}