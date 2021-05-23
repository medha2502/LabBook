import java.util.Scanner;
public class Reverse {
	
		public static void main(String[] args) {
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
				 
				  int i, k, t ;
			        for (i = 0; i < size / 2; i++) {
			            t = arr[i];
			            arr[i] = arr[size - i - 1];
			            arr[size - i - 1] = t;
			        }
			        System.out.println("Reversed array is: \n");
			        for (k = 0; k < size; k++) {
			            System.out.println(arr[k]);
			        }
			    }
	}

