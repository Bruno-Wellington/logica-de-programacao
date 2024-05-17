package vetores;

import java.util.Scanner;

public class Exercicio_de_mesa03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 4;
		int[] v = new int[7];
		int[] w = new int[7];
		
		v[0] = 2;
		
		for(int d=1; d < contador; d++) {
			v[d] = v[d-1] * 2;

		}
		for(int d=0; d < contador; d++) {
			w[d] = v[d] * 10;

		}
		
		for(int d=0; d < contador; d++) {
			System.out.println("v["+ v[d] + "] - w[" + w[d] + "]");
		}
		
		
		
		sc.close();
	}

}
