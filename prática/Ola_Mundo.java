package prática;

import java.util.Locale;

public class Ola_Mundo {

	public static void main(String[] args) {
		
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n ou \n = quebra de linha
		
		
		//String nome = "Thiago";
		//int idade = 20;
		//double x = 2500.00;
		
		//System.out.println(x);
		//System.out.printf("%.2f\n", x);
		//Locale.setDefault(Locale.US);
		//System.out.printf("%.2f\n", x);
		//System.out.println("A VARIÁVEL X = " + x + ", É UM NÚMERO FLUTUANTE");
		//System.out.printf("A VARÁVEL X = %.2f", x);
		//System.out.printf("%s tem %d anos e recebe um salário de R$ %.0f", nome, idade, x);
		
		
		//EXERCÍCIO DA AULA
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ %.2f\n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f\n", product2, price2);	
		System.out.printf("\nRecord: %d years old, code %d and gender: %s\n", age, code, gender);
		System.out.printf("\nMeasue with eight decimal places: %.8f", measure);
		System.out.printf("\nRouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
