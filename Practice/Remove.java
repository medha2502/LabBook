import java.util.Scanner;
public class Remove {
	public static void main(String[] args) {


	

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter first input as a string: ");
	        String str1 = sc.nextLine();

	        System.out.println ("Enter first input as a string: ");
	        String str2 = sc.nextLine();

	        System.out.println(printStringOutput(str1,str2));
	    }

	    private static String printStringOutput(String str1, String str2){

	        String strTemp1 = str1;

	        int strLen1 = str1.length();
	        int strLen2 = str2.length();
	        for(int i=0; i<strLen1; i++){

	            for(int j=0; j<strLen2; j++){

	                if(str1.charAt(i) == (str2.charAt(j))){
	                    str1 = str1.replace(str1.charAt(i), ' ');
	                }
	            }
	        }
	        return "After removing characters from first string which is present in second string:" +str1;
	    }

}
