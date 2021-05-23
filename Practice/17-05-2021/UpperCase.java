import java.util.Scanner;
public class UpperCase {
	
		 
	    static public String move(String str)
	    {
	        
	        int len = str.length();
	 
	       
	        String low = "";
	 
	        
	        String upr = "";
	 
	       
	        char ch;
	        for (int i = 0; i < len; i++) {
	            ch = str.charAt(i);
	 
	           
	            if (ch >= 'A' && ch <= 'Z') {
	                upr += ch;
	            }
	            else {
	                low += ch;
	            }
	        }
	        return upr + low ;
	    }
	 
	    public static void main(String args[])
	    {   Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string");
	        String str = sc.nextLine();
	        System.out.println("Before Operation:   " + str);
	        System.out.println("After Operation:    " + move(str));
	    }
	}

