package exercícios;
import java.util.Scanner;
import java.util.Locale;
public class EX_FOR_Estrutura_Repetitiva {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//int x = sc.nextInt();
		//int d = 0, f = 0;
		//for (int i=1; i <= x; i++) {
			 //int n = sc.nextInt();
			 //if (n >= 10 && n <+ 20) {
				 //d += 1;
			 //}
			 //else {
				 //f += 1;
			 //}
		//}
		//System.out.printf("%d in\n%d out", d, f);
		
		//EXERCÍCIO 3
		
		//int n = sc.nextInt();
		//for (int i = 1 ; i <= n ; i++) {
			//double a, b, c;
			//a = sc.nextDouble();
			//b = sc.nextDouble();
			//c = sc.nextDouble();
			//double total = (a * 2 + b * 3 + c * 5) / 10;
			//System.out.printf("%.1f\n", total);
		//}
		
		//EXERCÍCIO 4
		
		//int n = sc.nextInt();
		//for (int i = 1 ; i <= n ; i++) {
			//double a = sc.nextDouble();
			//double b = sc.nextDouble();
			//if (b == 0) {
				//System.out.println("Divisão impossível");
			//}
			//else {
				//double d;
				//d = a / b;
				//System.out.println(d);
			//}
		//}
		
		//EXERCÍCIO 5
		
		//int n = sc.nextInt();
		//int soma = 1;
		//for (int i = 1 ; i <= n ; i++) {
			//soma = soma * i;
		//}
		//System.out.println(soma);
		
		//EXERCÍCIO 6
		
		//int x = sc.nextInt();
		//for (int i = 1 ; i <= x ; i++) {
			//if (x % i == 0) {
				//System.out.println(i);	
			//}
		//}
		
		//EXERCÍCIO 7
		
		int x = sc.nextInt();
		for (int i = 1 ; i <= x ; i++) {
			int q = i * i;
			int c = i * i * i;
			System.out.printf("%d %d %d\n", i, q, c);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();
	}

}
