package Day3EmployeeWageProgram;

import java.util.Scanner;

public class UC4Monthswage {
	public void monthlywage() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Total Number of workings days wage");
		double Workingdays=scanner.nextDouble();
		System.out.println("Enter salary per day");
		double Dailysalary=scanner.nextDouble(); 
		double Monthlywage=Workingdays*Dailysalary;
		 System.out.println("Monthly wage is="+Monthlywage);
	}
}
