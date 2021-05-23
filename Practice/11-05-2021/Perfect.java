import java.util.Scanner;
	public class Perfect
	{
	    public static void main(String[] args) 
	    {
	        int num, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number:");
	        num = s.nextInt();
	        for(int i = 1; i < num; i++)
	        {
	            if(num % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == num)
	        {
	            System.out.println("number is Perfect");
	        }
	        else
	        {
	            System.out.println("number is not Perfect");
	        }    
	    }
	    int divisor(int x)
	    {
	       return x;
	    }
	}


