package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nomes = new String[n];
		
		for(int i =0; i < n; i++) {
			nomes[i] = sc.next();	
		}
		
		System.out.println("Nomes lidos:");
		for(String s : nomes) {
			System.out.println(s);
		}
		
		sc.close();
	}

}
