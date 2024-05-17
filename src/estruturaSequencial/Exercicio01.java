package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Faça um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
		 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
		 * terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
		 * conforme exemplo.
		 * Largura = 10.0
		 * Comprimento = 30.0
		 * valor metro quadrado = 200.00 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a largura:");
		double largura = sc.nextDouble();
		
		System.out.println("Informe o compimento:");
		double compimento = sc.nextDouble();
		
		System.out.println("Informe o valor do metro quadrado:");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * compimento;
		double preco = area * metroQuadrado;
		
		System.out.println();
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f", preco);
		
		sc.close();
	}

}
