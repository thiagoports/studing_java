package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class student {

	public static void main(String[] args) {
		Student student = new Student();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student.name = sc.next();
		student.value1 = sc.nextDouble();
		student.value2 = sc.nextDouble();
		student.value3 = sc.nextDouble();
		
		System.out.printf("FINAL PASS = %.2f\n", student.finalGrade());
		if (student.finalGrade() > 60.0) {
			System.out.print("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}
		
		sc.close();
	}
}
