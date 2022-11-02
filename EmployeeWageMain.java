package Day3EmployeeWageProgram;


import java.util.Scanner;




public class EmployeeWageMain {
public static void main(String[] args) {

		
	UC1EmployeeAbsentorPresent employeeattendence = new UC1EmployeeAbsentorPresent();
	UC2Employeedailywage Dailywage = new UC2Employeedailywage();
	UC3Parttimewages Overtimewage = new UC3Parttimewages();
	UC4Monthswage monthwage=new UC4Monthswage();
	UC5Conditionwage conditionwage=new UC5Conditionwage();
		try (Scanner sc = new Scanner(System.in)) {
			int variable;
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			System.out.println("Please enter the Number for following details\r\n" + "1.Employee Absent Or Present\r\n"
					+ "2.Employee Daily Wage\r\n" +  "3.Employee Overtime Wage\r\n" +"4.Employee wage for a month\r\n"
					+ "5.Employee wage for a month with hours and days\r\n");

			variable = sc.nextInt();
			switch (variable) {
			case 1:
				employeeattendence.absentorpresent();
				break;

			case 2:
				Dailywage.dailywage();
				break;
			case 3:
				Overtimewage.parrtime();

				break;
			case 4:
				monthwage.monthlywage();
				break;
			case 5:
				conditionwage.dayhour();

			default:
				System.out.println("The value of the variable is neither 1 nor 2 nor 3 nor 4");
			}
		}

	}
}
