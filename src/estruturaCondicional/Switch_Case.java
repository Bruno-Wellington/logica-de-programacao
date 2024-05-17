package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		int x = sc.nextInt();
		String dia;
		
		if(x == 1) {
			dia = "Domingo";
		} else if( x == 2) {
			dia = "Segunda-Feira";
		} else if( x == 3) {
			dia = "Terça-Feira";
		} else if( x == 4) {
			dia = "Quarta-Feira";
		} else if( x == 5) {
			dia = "Quinta-Feira";
		} else if( x == 6) {
			dia = "Sexta-Feira";
		} else if( x == 7) {
			dia = "Sabado";
		}else {
			dia = "Valor invalido";
		}
		
		System.out.println("Dia da semana: " + dia);
		*/
		
		//Usando Switch_Case
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {//switch(Expressao), case valor:, comandos e break(Parar)
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sabado";
			break;
			
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
