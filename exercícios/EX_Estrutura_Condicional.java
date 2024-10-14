package exercícios;
import java.util.Scanner;
import java.util.Locale;
public class EX_Estrutura_Condicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//EXERCÍCIO 1
		//int x;
		//System.out.println("Digite um número: ");
		//x = sc.nextInt();
		//if (x < 0){
			//System.out.println("NEGATIVO");
	//}
		//else {
			//System.out.println("NÃO NEGATIVO");
		//}
			
		//EXERCÍCIO 2
	
		//int x;
		//System.out.println("Digite um número: ");
		//x = sc.nextInt();
		//if (x % 2 == 0) {
			//System.out.println("NÚMERO PAR");
		//}
		//else {
			//System.out.println("NÚMERO IMPÁR");
		//}
		
		//EXERCÍCIO 3
		
		//int a, b;
		//System.out.println("Digite dois números: ");
		//a = sc.nextInt();
		//b = sc.nextInt();
		//if (a % b == 0) {
			//System.out.println("SÃO MULTIPLOS");
		//}
		//else if (b % a == 0) {
			//System.out.println("SÃO MULTIPLOS");
		//}
		//else {
			//System.out.println("NÃO MULTIPLOS");
		//}
		
		//EXERCÍCIO 4
		
		//int hi, hf, dura;
		//System.out.println("Digite a hora inicial e final: ");
		//hi = sc.nextInt();
		//hf = sc.nextInt();
		//if (hi < hf) {
			//dura = hf - hi;
			//System.out.printf("O JOGO DUROU = %d HORAS", dura);
		//}
		//else {
			//dura = 24 - hi + hf;
			//System.out.printf("O JOGO DUROU = %d HORAS", dura);
		//}
		
		//EXERCÍCIO 5
		
		//int x, p, cq, xs, xb, t, r;
		//double valor;
		//cq = 1;
		//xs = 2;
		//xb = 3;
		//t = 4;
		//r = 5;
		//System.out.println("Digite o código e a quantidade: ");
		//p = sc.nextInt();
		//x = sc.nextInt();
		//if (p == 1) {
			//valor = x * 4.00;
			//System.out.printf("TOTAL = R$ %.2f", valor);
		//}
		//if (p == 2) {
			//valor = x * 4.50;
			//System.out.printf("TOTAL = R$ %.2f", valor);
		//}
		//if (p == 3) {
			//valor = x * 5.00;
			//System.out.printf("TOTAL = R$ %.2f", valor);
		//}
		//if (p == 4) {
			//valor = x * 2.00;
			//System.out.printf("TOTAL = R$ %.2f", valor);
		//}
		//if (p == 5) {
			//valor = x * 1.50;
			//System.out.printf("TOTAL = R$ %.2f", valor);
		//}
		
		//EXERCÍCIO 6
		
		//double x;
		//System.out.println("Insira um valor qualquer: ");
		//x = sc.nextDouble();
		//if (x >= 0 && x <= 25) {
			//System.out.println("Intervalo [0,25]");
		//}
		//if (x > 25 && x <= 50) {
			//System.out.println("Intervalo (25,50]");
		//}
		//if (x > 50 && x <= 75) {
			//System.out.println("Intervalo (50, 75]");
		//}
		//if (x > 75 && x <= 100) {
			//System.out.println("Intervalo (75,100]");
		//}
		//if (x < 0 || x > 100) {
			//System.out.println("Fora de Intervalo");
		//}
		
		//EXERCÍCIO 7
		
		//double x, y;
		//System.out.println("Digite dois valores com uma casa decimal: ");
		//x = sc.nextDouble();
		//y = sc.nextDouble();
		//if (x == 0.0 && y == 0.0) {
			//System.out.println("Origem");
		//}
		//else if (x == 0.0) {
			//System.out.println("Eixo Y");
		//}
		//else if (y == 0.0) {
			//System.out.println("Eixo X");
		//}
		//else if (x > 0.0 && y > 0.0) {
			//System.out.println("Q1");
		//}
		//else if (x < 0.0 && y > 0.0) {
			//System.out.println("Q2");
		//}
		//else if (x < 0.0 && y < 0.0) {
			//System.out.println("Q3");
		//}
		//else {
			//System.out.println("Q4");
		//}
		
		//EXERCÍCIO 8
		
		System.out.println("=== BEM VINDO Á LISARB ===");
		double x, c8, c18, c28;
		System.out.println("Digite o salário: ");
		x = sc.nextDouble();
		
		if (x >= 0.00 && x <= 2000.00) {
			System.out.println("Insento");
		}
		if (x >= 2000.01 && x <= 3000.00) {
			c8 = (x - 2000) * 0.08;
			System.out.printf("R$%.2f", c8);
		}
		if (x >= 3000.01 && x <= 4500.00) {
			c18 = (x - 3000) * 0.18 + 1000 * 0.08;
			System.out.printf("R$%.2f", c18);
		}
		else {
			c28 = (x - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$%.2f", c28);
		}
		
		
		
		
		sc.close();
	//FIM DA LINHA
	}
}
