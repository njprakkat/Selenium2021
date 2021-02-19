package week1.day2;

import java.util.Scanner;

public class findDatatype
{

	public void countdataType(String str)
	{
	int lettercnt =0, digitcount = 0 , splcharcount = 0;
	char[] ch =	str.toCharArray();
	System.out.println("String changed to Character Array is: ");
	
	for(int i =0;i < ch.length; i++)
	{
	System.out.println(ch[i]);
	if(Character.isLetter(ch[i]))
	{
		lettercnt++;
	}
	else
	if(Character.isDigit(ch[i]))
	{
		digitcount++;
	}
	
	else
		splcharcount++;
	}
		
	System.out.println("In the given string there are: " + lettercnt + " letters " + digitcount + " digits & " + splcharcount + " special characters ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDatatype obj = new findDatatype();
		
		String str = "$$ Welcome to 2nd Class of Automation $$";
		
		obj.countdataType(str);
		
	}

}
