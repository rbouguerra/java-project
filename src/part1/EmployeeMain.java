package part1;

public class EmployeeMain { // same package

	public static void main(String[] args) {
		
		Employee emp1=new Employee(); //creating object 1
		emp1.eid=101;
		emp1.ename="Jhon";
		emp1.sal=80.00;
		emp1.job="Test Automation";
		emp1.display();
		
		Employee emp2=new Employee(); //creating object 2
		emp2.eid=102;
		emp2.ename="Julien";
		emp2.sal=75.00;
		emp2.job="Test Manual";
		emp2.display();

	}

}
