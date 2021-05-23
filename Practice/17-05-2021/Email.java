import java.util.Scanner;
public class Email {
	
	

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the email id : ");
			String email=sc.next();
			if(email.contains("@") && email.contains("."))
				System.out.println("Email contains both ");
			else if(email.contains("@"))
				System.out.println("Email contains only '@' ");
			else if(email.contains("."))
				System.out.println("Email contains only '.' ");
			else
				System.out.println("Email does not contain both ");
			
			sc.close();
		}

	}
	