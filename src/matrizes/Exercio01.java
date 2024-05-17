package matrizes;

import java.util.Scanner;

public class Exercio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int contNegativos = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
				
				if(mat[i][j] < 0) {
					contNegativos = contNegativos + 1;
				}
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de numeros negativos: " + contNegativos);
		
		sc.close();
	}
}
