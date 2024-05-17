package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.println("MENOR = " + a);
			
		}else if(b < c) {
			System.out.println("MENOR = " + b);
			
		}else {
			System.out.println("MENOR = " + c);
		}
				
		sc.close();			
	}

}
