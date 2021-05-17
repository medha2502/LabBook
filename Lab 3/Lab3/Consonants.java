import java.util.Scanner;
public class Consonants {

	
	
		    static boolean isVowel(char ch)
		    {
		        if (ch != 'a' && ch !='A' && ch != 'e' && ch != 'E' && ch != 'i' &&
		        		ch != 'I'
		                && ch != 'o' && ch != 'O' && ch != 'u' && ch != 'U')
		        {
		            return false;
		        }
		        return true;
		    }
		 
		    
		    static String replaceConsonants(char[] s)
		    {
		        
		        for (int i = 0; i < s.length; i++)
		        {
		            if (!isVowel(s[i]))
		            {
		 
		                  
		                    s[i] = (char) (s[i] + 1);
		            }
		                    else {
		                  
		                    
		                    
		                        s[i] = (char) s[i];
		                    
		                }
		            }
		        
		        return String.valueOf(s);
		    }
		 
		    
		    public static void main(String[] args)
		    {   Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the string");
		        String s = sc.nextLine();
		        System.out.println(replaceConsonants(s.toCharArray()));
		    }
		}
	
