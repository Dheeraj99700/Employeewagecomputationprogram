package Day3EmployeeWageProgram;

import java.util.Scanner;

public class UC2Employeedailywage {
	public void dailywage() {
		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter Per hour wage");
		double Perhour=scanner.nextDouble();
		System.out.println("Enter Total hours of working in a Day");
		double workinghour=scanner.nextDouble(); 
		
		double dailywage=Perhour*workinghour;
		 System.out.println("Daily wage is="+dailywage);
}
}
