package controlstatements;
import java.util.Scanner;
public class DiffSquare {
	static int calculateDifference(int n){

		int s1, s2, diff;

			s1 = (n * (n + 1) * (2 * n + 1)) / 6;
			

			s2 = (n * (n + 1)) / 2;
			
			s2 = s2 * s2;
			
			diff = Math.abs(s1 - s2);
			
			return diff;

		}


		public static void main(String s[])
		{   int num;
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			num=sc.nextInt();
			System.out.println(calculateDifference(num));	
			
		}
		}


