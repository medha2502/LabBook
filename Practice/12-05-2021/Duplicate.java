import java.util.Scanner;
public class Duplicate {

         public static void main(String[] args) {
			// TODO Auto-generated method stub      
			int size;
			System.out.println("Enter the size of array");
			Scanner sc = new Scanner(System.in);
			size = sc.nextInt();
			int[] arr = new int[size] ;
			System.out.println("Enter the elements of the array:");
			
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			} 
		       
		    System.out.println("Duplicate elements in given array: ");  
		        
		        for(int i = 0; i < arr.length; i++) {  
		            for(int j = i + 1; j < arr.length; j++) {  
		                if(arr[i] == arr[j])  
		                    System.out.println(arr[j]);  
		            }  
		        }  
		    }  
		}  

