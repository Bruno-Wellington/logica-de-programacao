package desafiosPortalUri;

import java.util.Scanner;

public class Desafio1035 {

	public static void main(String[] args) {
		/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior 
		 * do que C e se D for maior do que A, e a soma de C com D for 
		 * maior que a soma de A e B e se C e D, ambos, forem positivos
		 * e se a variável A for par escrever a mensagem "Valores aceitos", 
		 * senão escrever "Valores nao aceitos".
		 * 
		 * Entrada
		 * Quatro números inteiros A, B, C e D.
		 * 
		 * Saída
		 * Mostre a respectiva mensagem após a validação dos valores.*/
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int somaCD = c + d;
		int somaAB = a + b;
		
		if(c > 0 && d > 0 && a % 2 == 0 && b > c && d > a 
				&& somaCD > somaAB) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}	
		
		sc.close();
	}
	
}