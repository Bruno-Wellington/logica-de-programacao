package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Imprimir apenas os numeros negativos informados*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vet = new double[n];
		double soma = 0;
		double media = 0;
		
		for(int i =0; i < n; i++) {
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
			
		}
		
		for(int i =0; i < n; i++) {
			System.out.print(vet[i] + " ");
		}
		
		media = soma / n;
		System.out.printf("%n%.2f%n", soma);
		System.out.printf("%.2f%n", media);

		sc.close();
	}

}
