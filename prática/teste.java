package prática;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("Número positivo");
			if (x % 2 == 0) {
				System.out.println("Número par");
			}
			else {
				System.out.println("Número impar.");
			}
		}
		
	
		
		
		
		
	}
}
