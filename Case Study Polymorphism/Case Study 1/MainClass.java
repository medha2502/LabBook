package polymorphism;
import java.util.Scanner;

public class MainClass {
	
		    public static void adminDetails() {
		        Scanner sc = new Scanner(System.in);
		        Admin a = new Admin();

		        System.out.print("Enter the Name: ");
		        String name = sc.nextLine();
		        System.out.print("Enter the Salary: ");
		        int sal = sc.nextInt();

		        a.adjustSalary(sal);
		        a.doAdminStuff();
		    }

		    public static void academicDetails() {
		        Scanner sc = new Scanner(System.in);
		        Academic ac = new Academic();

		        System.out.print("Enter the Name: ");
		        String name = sc.nextLine();
		        System.out.print("Enter the Salary: ");
		        int sal = sc.nextInt();

		        ac.adjustSalary(sal);
		        ac.giveLecture();
		    }
		    public static void main(String[] args) {	
				

				
				Scanner sc = new Scanner(System.in);

		        System.out.println(" Choose an option - 1. Admin	2. Academic");
		        int ch = sc.nextInt();
		        if (ch == 1)
		            adminDetails();
		        else if (ch == 2)
		            academicDetails();
		        else
		            System.out.println("Wrong Input!");

			}

		}

