package entities;

public class Student {
	
	public String name;
	public double value1;
	public double value2;
	public double value3;
	
	public double finalGrade() {
		return value1 + value2 + value3;
	}
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
				return 0.0;
		}
		
	}

}

