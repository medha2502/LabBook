import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String str1 = "Capgemini";
		  System.out.println("The given string is: " + str1);
		  System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
		 }
		 private static String removeDuplicateChars(String sourceStr) {
		  char[] arr1 = sourceStr.toCharArray();
		  String targetStr = "";
		  for (char value: arr1) {
		   if (targetStr.indexOf(value) == -1) {
		    targetStr += value;
		   }
		  }
		  return targetStr;
		 }
		}
	
