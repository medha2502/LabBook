import java.util.Scanner;
public class Character {

	
		static void removeChar(String s, char c)
		{
		    int j, count = 0, n = s.length();
		    char []t = s.toCharArray();
		    for (int i = j = 0; i < n; i++)
		    {
		        if (t[i] != c)
		        t[j++] = t[i];
		        else
		            count++;
		    }
		     
		    while(count > 0)
		    {
		        t[j++] = '\0';
		        count--;
		    }
		     
		    System.out.println(t);
		}
		 
		// Driver Code
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the String");
			String str =  sc.nextLine();
			System.out.println("Enter the character to be removed from string");
			char ch = s.next().charAt(0);
			removeChar(str, ch );
		
		}
		
      
	}


