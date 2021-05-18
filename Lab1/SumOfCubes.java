package controlstatements;
import java.util.Scanner;

public class SumOfCubes {
	
	public static void main(String[] args) {
		int no;
		System.out.println("Enter the Digit:");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		int sum = 0, rem;
		while(no > 0) {
			rem = no % 10;
			sum = sum + (rem*rem*rem);
			no = no / 10;
		}
		System.out.println("Sum of the cubes of the digit is: " + sum);
		sc.close();
	}

}


