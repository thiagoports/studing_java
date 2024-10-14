package prática;

import java.util.Scanner;

public class Estrutura_Sequencial_2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int x;
		String a, b, c;
		
		x = sc.nextInt();
		sc.nextLine(); //Para consumir a quebra de linha
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();
		
		System.out.printf("Os nomes digitados foram:\n%s\n%s\n%s\n", a, b, c);
		System.out.println("O valor digitado foi: " + x);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
