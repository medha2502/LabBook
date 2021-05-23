package com.capgemini.exceptionhandling;
import java.util.Scanner;
public class ValidateName {
	
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name  --->");
		String first = sc.nextLine();
		System.out.println("Enter the Last name  --->");
		String last = sc.nextLine();
		
		try {
			if(first.isEmpty() || last.isEmpty())
			{
				throw new NameException("Exception");
			}
			System.out.println("Fullname is= "+first+" "+last);
		}
		catch(NameException e)
		{
			System.out.println("Plz enter the name correctly");
		}
	}

	}


