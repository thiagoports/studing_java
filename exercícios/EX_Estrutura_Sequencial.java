package exercícios;

import java.util.Scanner;
import java.util.Locale;

public class EX_Estrutura_Sequencial {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		//EXERCÍCIO 1
		
		//int  a, b;
		//int soma;
		//a = sc.nextInt();
		//b = sc.nextInt();
		//soma = a + b;
		//System.out.println("SOMA = " + soma);
		
		
		//EXERCÍCIO 2
		
		//double x, pi, raio;
		//pi = 3.14159;
		//x = sc.nextDouble();
		//raio = pi * (x * x);
		//System.out.printf("Raio = %.4f", raio);
		
		//EXERCÍCIO 3
		
		//int A, B, C, D, DIFERENCA;
		//A = sc.nextInt();
		//B = sc.nextInt();
		//C = sc.nextInt();
		//D = sc.nextInt();
		//DIFERENCA = (A * B - C * D);
		//System.out.println("A diferença dos valores lido é: " + DIFERENCA);
		
		//EXERCÍCIO 4
		
		//int n, h;
		//double sal, r;
		//n = sc.nextInt();
		//h = sc.nextInt();
		//sal = sc.nextDouble();
		//r =  h * sal;
		//System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", n, r);
		
		//EXERCÍCIO 5
		
		//int p1, n1, p2, n2;
		//double v1, v2, total;
		//p1 = sc.nextInt();
		//n1 = sc.nextInt();
		//v1 = sc.nextDouble();
		//p2 = sc.nextInt();
		//n2 = sc.nextInt();
		//v2 = sc.nextDouble();
		//total = (n1 * v1) + (n2 * v2);
		//System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		//EXERCÍCIO 6
		
		double a, b, c, areat, areac, areatra, areaq, arear;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		areat = (a * c) / 2;
		areac = (c * c) * 3.14159;
		areatra = ((a + b) * c) / 2;
		areaq = Math.sqrt(b);
		arear = a * b;
		System.out.printf("TRIANGULO = %.3f\nCIRCULO = %.3f\nTRAPEZIO = %.3f\nQUADRADO = %.3f\nRETANGULO = %.3f", areat, areac, areatra, areaq, arear);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		

	}

}
