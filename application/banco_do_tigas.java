package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class banco_do_tigas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char r = sc.next().charAt(0);
		
		if (r == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposite = sc.nextDouble();
			account = new Account(number, holder, initialDeposite);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositeValue = sc.nextDouble();
		account.deposite(depositeValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
