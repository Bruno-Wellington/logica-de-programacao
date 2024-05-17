package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1013 {

	public static void main(String[] args) {
		/* Faça um programa que leia três valores e apresente o maior dos três valores
		lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

		MaiorAB = (a+b+abs(a-b))/2

		Entrada
		O arquivo de entrada contém três valores inteiros.

		Saída
		Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int maiorAB = ((A+B) + Math.abs(A-B))/2;
		int MAIOR = ((maiorAB+C) + Math.abs(maiorAB-C))/2;
		
		System.out.printf(MAIOR + " eh o maior");
		
		sc.close();
	}
	
}
