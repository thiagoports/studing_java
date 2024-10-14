package prática;

import java.util.Scanner;
import java.util.Locale;

public class Estrutura_Sequencial {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US); //Comando para manter a pontuação
	Scanner sc = new Scanner(System.in);
		
		//Para strings
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
	
		//Para Inteiros
		int y;
		y = sc.nextInt();
		System.out.println("O valor digitado foi: " + y);
	
		//Para flutuante
		double z;
		z = sc.nextDouble();
		System.out.println("O valor flutuante foi: " + z);
		
		//Para char = caractere único
		char a;
		a = sc.next().charAt(0);
		System.out.println("A letra digitada foi: " + a);
		
		sc.close();
		
		
	}

}
