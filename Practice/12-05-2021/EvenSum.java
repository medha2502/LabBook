

import java.util.Scanner;

	public class EvenSum {

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
			int sum = 0;
			for(int i = 0; i < arr.length; i += 2) {
			   sum += arr[i];
			}
			   System.out.println("The sum of the numbers in the even index :" +sum);
			}
		}

