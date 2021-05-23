package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class SortString {

	public static void main(String[] args) {
			int n, i;
			SortString two = new SortString();
			
			System.out.println("How many elements in the array?");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			System.out.println("Enter the elements (String):");
			String[] arr = new String[n];
			for(i = 0; i < n; i++) {
				arr[i] = sc.next();
			}
			String[] sort = sortStrings(arr);
			System.out.println("Output:");
			for(String alpha : sort) {
				System.out.print(alpha);
			}
		}
		
	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		int len = arr.length, i;
		String newArr[] = new String[len];
		for(i = 0; i<(int)Math.ceil(len/2)+1; i++)
			newArr[i] = arr[i].toUpperCase();
		for(i = (int)Math.ceil(len/2)+1; i<len; i++)
			newArr[i] = arr[i].toLowerCase();
		return newArr;
		
	}
		}
	