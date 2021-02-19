package week1.day2;

import java.util.Scanner;

public class Countcharoccurance {

	public void countchar(String str)
	{
	
    int count=0;
    //char[] ch = str.toCharArray();
    int length = str.length();
    /*Scanner scan = new Scanner(System.in);
    System.out.println("Enter the character to count number of occurrences");
    e = scan.next().charAt(0);
	*/
    System.out.println(length);
    for(int i=0;i<str.length(); i++)
    {
    	if(str.charAt(i)=='e')
    	{
    		count++;
    	}
    		
    }
	
    System.out.println("Count of occurances of letter e is: " +count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Countcharoccurance obj = new Countcharoccurance();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");	
		//str = scan.next(); not counting characters after space .. 
		str=scan.nextLine();
		obj.countchar(str);
		
	}

}
