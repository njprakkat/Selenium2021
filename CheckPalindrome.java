package week1.day2;

import java.util.Scanner;

public class CheckPalindrome {

	public boolean chekPalindrome(String str)
	{
	// METHOD 1:
     int i=0, j=str.length()-1; 
 
	  while (i<j)
	  {
		if (str.charAt(i)!=str.charAt(j))
		return false;
		i++;
		j--;
	  }
	return true;
	  }

 	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter String to check if Palindrome");
		String str = scan.next();
		
		CheckPalindrome obj = new CheckPalindrome();
		Boolean result= obj.chekPalindrome(str);
		
		
		if(!result)
		      System.out.println(" String entered is not a palindrome");
		      else
		      System.out.println(" String entered is a palindrome");
	}

}
	

/* METHOD 2	
String reverse ="";
for(int j =str.length()-1; j >= 0 ; j--)
{			
reverse = reverse +	str.charAt(j);
}
if(str.equalsIgnoreCase(reverse))
	{
		System.out.println(" This String is a Palindrome");
	}

else
	System.out.println(" This String is not " 	+ "a Palindrome");
}
*/

