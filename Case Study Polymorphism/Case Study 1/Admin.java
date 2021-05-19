package polymorphism;
import java.util.Scanner;

public class Admin extends Payroll
{
	private String name;
	private int salary;
	Admin()
	{
		
	}
	public Admin(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
		super.adjustSalary(salary);
	}
	public void doAdminStuff()
	{
		System.out.println("Admin Stuff Successful..");
	}
}