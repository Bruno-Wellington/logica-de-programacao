package vetores;

import java.util.Scanner;

public class Exercicio_de_mesa01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 3;
		int[] v = new int[7];
		int[] w = new int[7];
		
		for(int a=0; a < contador; a++) {
			v[a] = 5;
			w[a] = a;

		}
		
		for(int a=0; a < contador; a++) {
			System.out.println("v["+ v[a] + "] - w[" + w[a] + "]");
		}
		
		
		
		sc.close();
	}

}
