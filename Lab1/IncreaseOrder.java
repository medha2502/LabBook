package controlstatements;
import java.util.Scanner;

public class IncreaseOrder {

	       public static boolean checkNumber(int number) {
	       boolean flag = false;
	        
	    
	         int Digit = number % 10;
	       number = number/10;
	        
	      
	       while(number>0){
	         
	           if(Digit <= number % 10){
	               flag = true;
	               break;
	           }

	           Digit = number % 10;
	           number = number/10;
	       }
	       return flag;
	       }
	       public static void main(String[] args) {
	    	   
	       int num;
	    	   
	    	   Scanner scanner = new Scanner(System.in);
		        
	    		 System.out.println("Enter a number : ");
		          num = scanner.nextInt();
	        
	     
	       if(checkNumber(num)){
	           System.out.println("Not an increasing number.");
	       }else{
	           System.out.println("It is an increasing number.");
	       }
	    }
	}


