package week1.day2;

import java.util.Scanner;

public class Fibonocciseries {

	public void printFibonocci(int n)
	
	{
		int firstnum = 0, secondnum = 1, sum=0;
		
		System.out.println("Fibonocci series upto  is: " + n + "\n" + firstnum);
		System.out.println(secondnum);
				
		for(int i=0;i<=n;i++)
		{
			
			sum=firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
			System.out.println(sum);						
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonocciseries obj = new Fibonocciseries();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit for printing Fibonocci series");
		int n = scan.nextInt();
		
		obj.printFibonocci(n);
		
		
		
		
	}

}
