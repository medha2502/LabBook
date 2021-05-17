import java.util.Arrays;
import java.util.Scanner;
public class Positive {

	
	    static boolean isPositiveString(String s)
	    {
	       
	        int n = s.length();
	       
	        
	        char c[] = new char [n];
	       
	       
	        for (int i = 0; i < n; i++) {
	            c[i] = s.charAt(i);
	        }
	       
	       
	        Arrays.sort(c);
	       
	       
	        for (int i = 0; i < n; i++)
	            if (c[i] != s.charAt(i)) 
	                return false;
	               
	        return true;    
	    }
	     
	    public static void main(String args[])
	    {   Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string");
	        
	        String s = sc.nextLine();
	         
	      
	        if (isPositiveString(s))
	           System.out.println("True");
	        else
	            System.out.println("False");
	           
   }
}
