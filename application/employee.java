package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class employee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		
		employee.increasySalary(sc.nextDouble());
		
		System.out.println();
		System.out.print("Updated data: " + employee);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
