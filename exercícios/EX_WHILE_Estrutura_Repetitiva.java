package exercícios;
import java.util.Scanner;
import java.util.Locale;
public class EX_WHILE_Estrutura_Repetitiva {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//EXERCÍCIO 1
		//int x = 2002, y = 0;
		//System.out.println("Digite a senha: ");
		//while (y != x) {
			//y = sc.nextInt();
			//if (y != x) {
				//System.out.println("Senha incorreta.");
			//}
		//}
		//System.out.println("Senha correta!");
		
		//EXERCÍCIO 2
		
		//int x = 1, y = 1;
		//System.out.println("Digite as coordenadas: ");
		//while (x != 0 && y != 0) {
			//x = sc.nextInt();
			//y = sc.nextInt();
			//if (x > 0 && y > 0) {
				//System.out.println("Primeiro");
			//}
			//else if (x < 0 && y > 0) {
				//System.out.println("Segundo");
			//}
			//else if (x < 0 && y < 0) {
				//System.out.println("Terceiro");
			//}
			//else if (x > 0 && y < 0) {
				//System.out.println("Quarto");
			//}
				
				
		//EXERCÍCIO 3
		
		int a = 0, g = 0, d = 0, x = 0;
		System.out.println("Digite o código: ");
		while (x != 4) {
			x = sc.nextInt();
			if (x == 1) {
				a += 1;
			}
			else if (x == 2) {
				g += 1;
			}
			else if (x == 3) {
				d += 1;
			}
			else if (x > 4) {
				x = sc.nextInt();
			}
			else {
				System.out.printf("MUITO OBRIGADO\nÁlcool: %d\nGasolina: %d\nDiesel: %d", a, g, d);
				break;
			}
		
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();	
	}

}
