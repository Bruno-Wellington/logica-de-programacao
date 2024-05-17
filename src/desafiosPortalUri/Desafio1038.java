package desafiosPortalUri;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1038 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um programa que leia o 
		 * código de um item e a quantidade deste item. A seguir, 
		 * calcule e mostre o valor da conta a pagar.
		 * 
		 * CODIGO  ESPECIFICAÇÃO      PREÇO
		 * 1       Cachorro quente    R$4.00
		 * 2       X-Salada           R$4.00
		 * 3       X-Bacon            R$5.00
		 * 4       Torrada simples    R$2.00
		 * 5       Refrigerante       R$1.50
		 * 
		 * Entrada
		 * O arquivo de entrada contém dois valores inteiros correspondentes 
		 * ao código e à quantidade de um item conforme tabela acima.
		 * 
		 * Saída
		 * O arquivo de saída deve conter a mensagem "Total: R$ " seguido 
		 * pelo valor a ser pago, com 2 casas após o ponto decimal.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		
		double cachorroQuente = 4.00;
		double xSalada  = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double Refrigerante = 1.50;
		double total = 0;
		
		switch(codigo) {
		case 1:
			total = qtd * cachorroQuente;
			break;
		case 2:
			total = qtd * xSalada;
			break;
		case 3:
			total = qtd * xBacon;
			break;
		case 4:
			total = qtd * torradaSimples;
			break;
		case 5:
			total = qtd * Refrigerante;
			break;	
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
	
}
