package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int produto = i * n;
			System.out.println(i + " x " + n + " = " + produto);
		}
		
		sc.close();
	}

}
