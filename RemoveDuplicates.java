package week1.day2;

//import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args)

{	
	String Str1="", Str2="";
	int count = 1;
	String str = "We learn java basics as part of java sessions in week 1 java";
	String[] words = str.split(" ");
	

	
    for(int i=0; i<words.length; i++)
	
	{
		
		for(int j=i+1; j<words.length; j++)
		{
 
			if(words[i].equals(words[j]))
	
			{
			words[j] = " ";
			}
					
		}
		
	if (words[i] != " ")

	
	System.out.println(words[i]);
	
}

}

}

/*
REMOVES ALL WORDS IF THERE IS A DUPLICATE
 
{
	// TODO Auto-generated method stub

	String str2 ="";
	String str = "We learn java basics as part of java sessions in java week 1";
	String[] words = str.split(" ");
	Scanner scan = new Scanner(System.in);
	System.out.println(" Enter the dupe word that needs to be removed");
	String str1 = scan.next();
	for(int i=0; i<words.length; i++)
	{
	if(words[i].contains(str1))	
	str2= str.replace(str1, " ");
	}
	System.out.println("Original string: " + str);
	System.out.println("output is: " + str2);
}
}


USING ARRAY LIST TO REMOVE DUPLICATE WORDS - KEEPING FIRST DUPLICATE AS IS
 
public static void main(String[] args)

{	
	String Str1="";
	String str = "We learn java basics as part of java sessions in java week 1";
	String[] words = str.split(" ");
	ArrayList<String> list = new ArrayList<String>();
	
	//Scanner scan = new Scanner(System.in);
	//System.out.println(" Enter the dupe word that needs to be removed");
	//String str1 = scan.next();
	
	for(int i=0; i<words.length; i++)
	System.out.println (words[i]);
	
	for(int i=0; i<words.length; i++)
	{
			if(!list.contains(words[i])) {
				list.add(words[i]);
			    Str1 = Str1 + " " + words[i];
			}
	}
	

	System.out.println("Original string: " + str);
	
	System.out.println("output is: " + Str1);
	
}

} 

*/
