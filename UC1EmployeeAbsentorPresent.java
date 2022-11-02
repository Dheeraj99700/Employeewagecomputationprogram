package Day3EmployeeWageProgram;

import java.util.Random;

public class UC1EmployeeAbsentorPresent {
	public void absentorpresent() {
		
		 String[] at= { "Present", "Absent" };
	     Random rand = new Random();
		 int res = rand.nextInt(at.length);
		 System.out.println("The Employee is " + at[res]);
}
}
