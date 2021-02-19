package week1.day2;

import java.util.Arrays;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arrayb = {14,12,13,11,15,14,18,16,17,19,18,17,20,14};
		
		
		Arrays.sort(arrayb);
			
		for(int i=0; i< arrayb.length; i++)
		{
			if(i !=arrayb.length-1)
			if (arrayb[i] == arrayb[i+1])
			System.out.println("Match " + arrayb[i]);
		}
		
	}
}


/* ANOTHER METHOD

for (int i=0;i <= arr.length-1; i++)
{ int count = 1;

for (int j=1+1; j<arr.length; j++)
{
if(arrayb[i]==arrayb[j]
count++;
arr[j]=0;
}
}

 if (count >1 && arr[i] !=0)
	System.out.println(arrayb[i]);



*/
