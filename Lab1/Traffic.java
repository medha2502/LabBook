package controlstatements;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("R for Red");
		System.out.println("Y for Yellow");
		System.out.println("G for Green");
		char choice = in.next().charAt(0);
		switch(choice) {
		  case'R':
			  System.out.println("stop");
			  break;
			  
		  case'Y':
			  System.out.println("Ready");
			  break;
			  
		  case'G':
		      System.out.println("Go");
		      break;
		      
		  default:
			  System.out.println("wrong input!!Try Again");
		}
		
	
		
		

	}

}
