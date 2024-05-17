package desafiosPortalUri;

import java.util.Scanner;

public class Desafio1019 {

	public static void main(String[] args) {
		/* Leia um valor inteiro, que é o tempo de duração em 
		 * segundos de um determinado evento em uma fábrica, e 
		 * informe-o expresso no formato horas:minutos:segundos.
		 * 
		 * Entrada
		 * O arquivo de entrada contém um valor inteiro N
		 * 
		 * Saída
		 * Imprima o tempo lido no arquivo de entrada (segundos), 
		 * convertido para horas:minutos:segundos, conforme 
		 * exemplo fornecido. */
		
		Scanner sc = new Scanner(System.in);
		
		int N, resto, horas, minutos, segundos;
		
		N = sc.nextInt();

		horas = N / 3600; //3600 segundos é equivalente a 1 hr.
		resto = N % 3600; //resto aqui deu 3353.
		
		minutos = resto / 60; //60 segundos é equivalente a 1 min.
		segundos = resto % 60;//resto aqui deu 53
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}
	
}
