package controlstatements;
import java.util.Scanner;

public class Divisible {
	public static int calculateSum(int n)
	{   int i=0;
		int sum=0;
		while(i<=n)
		{
			if(i%3==0 || i%5==0)
				sum=sum+i;
			i++;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want to calculate");
		int n=sc.nextInt();
		int s=calculateSum(n);
		System.out.println("the sum of first n natural numbers which are divisible by 3 or 5 is "+s);
		sc.close();
	}

}
		
		