package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int contador = 0;
		double media = 0;
		
		while(idade >= 0) {
			soma = soma + idade;
			contador = contador + 1; 
			
			idade = sc.nextInt();
		}
		
		if(contador > 0) {
			media = (double) soma / contador;
			System.out.printf("%.2f%n", media);
			
		}else {
			System.out.println("Impossivel calcular");
		}
		
		sc.close();
	}

}
