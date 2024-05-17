package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1021 {

	public static void main(String[] args) {
		/* Leia um valor de ponto flutuante com duas casas decimais. Este valor 
		 * representa um valor monetário. A seguir, calcule o menor número de 
		 * notas e moedas possíveis no qual o valor pode ser decomposto. As notas 
		 * consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são 
		 * de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de 
		 * notas necessárias.
		 * 
		 * Entrada
		 * O arquivo de entrada contém um valor de ponto flutuante 
		 * N (0 ≤ N ≤ 1000000.00).
		 * 
		 * Saída
		 * Imprima a quantidade mínima de notas e moedas necessárias para trocar 
		 * o valor inicial, conforme exemplo fornecido.
		 * 
		 * Obs: Utilize ponto (.) para separar a parte decimal. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N;
		N = sc.nextDouble();
		double nota1 = 0;
		double nota2 = 0;
		double nota5 = 0;
		double nota10 = 0;
		double nota20 = 0;
		double nota50 = 0;
		double nota100 = 0;
		
		double centavos = N * 100;
		System.out.println(centavos + " centavos");
		double moeda50 = 0;
		double moeda25 = 0;
		double moeda10 = 0;
		double moeda05 = 0;
		double moeda01 = 0;
	
	
		
		System.out.println("NOTAS:");
		
		nota100 = N / 100.0;
		System.out.println((int)nota100 + " nota(s) de R$ 100.00");
		
		N = N % 100;
		nota50 = N / 50.0;
		System.out.println((int)nota50 + " nota(s) de R$ 50.00");
		
		N = N % 50;
		nota20 = N / 20.0;
		System.out.println((int)nota20 + " nota(s) de R$ 20.00");
		
		N = N % 20;
		nota10 = N / 10.0;
		System.out.println((int)nota10 + " nota(s) de R$ 10.00");

		N = N % 10;
		nota5 = N / 5.0;
		System.out.println((int)nota5 + " nota(s) de R$ 5.00");
		
		N = N % 5;
		nota2 = N / 2.0;
		System.out.println((int)nota2  + " nota(s) de R$ 2.00");
		
		/*------------------------------------------------*/
		
		System.out.println("MOEDAS:");
		
		N = N % 2;
		nota1 = N / 1.0;
		System.out.println((int)nota1  + " moeda(s) de R$ 1.00");
		
		N = N % 1;
		
		centavos = centavos % 100;
		System.out.println(centavos + " centavos");
		
		moeda50 = centavos / 50;
		System.out.println((int)moeda50  + " moeda(s) de R$ 0.50");

		System.out.println(centavos + " centavos");
		
		centavos = centavos % 50;
		moeda25 = centavos / 25;
		System.out.println((int)moeda25 + " moeda(s) de R$ 0.25");
		
		centavos = centavos % 25;
		moeda10 = centavos / 10;
		System.out.println((int)moeda10 + " moeda(s) de R$ 0.10");
		
		centavos = centavos % 10;
		moeda05 = centavos / 5;
		System.out.println((int)moeda05 + " moeda(s) de R$ 0.05");
		
		centavos = centavos % 5;
		moeda01 = centavos;
		System.out.println((int)moeda01 + " moeda(s) de R$ 0.01");
		
		sc.close();
	}
	
}
