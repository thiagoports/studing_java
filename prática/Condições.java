package prática;

import java.util.Scanner;

public class Condições {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	//int x;
	//System.out.println("Digite um número (entre 1 e 3): ");
	//x = sc.nextInt();
	//if (x == 1) {
		//System.out.println("Bom dia!");	
	//}
	//if (x == 2) {
		//System.out.println("Boa tarde!");
	//}
	//if (x == 3) {
		//System.out.println("Boa noite!");
	//}
	
	
	int x;
	System.out.println("Digite um número [1/7]: ");
	x = sc.nextInt();
	String dia;
	switch (x) {
	case 1:
		dia = "Domingo";
		break;
	case 2:
		dia = "Segunda";
		break;
	case 3:
		dia = "Terça";
		break;
	case 4:
		dia = "Quarta";
		break;
	case 5:
		dia = "Quinta";
		break;
	case 6:
		dia = "Sexta";
		break;
	case 7:
		dia = "Sábado";
		break;
	default:
		dia = "Valor inválido";
		break;
	}
	System.out.printf("Dia da semana: %s", dia);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	
	}

}
