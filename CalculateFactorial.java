package week1.day2;

import java.util.Scanner;

public class CalculateFactorial {

	public int findFactorial(int num)
	{
		int fact=1;
		
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		
		return(fact);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateFactorial obj = new CalculateFactorial();
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the number to calculate Factorial");
		int num = scan.nextInt();
		int factorial = obj.findFactorial(num);
		
		System.out.println(" Factorial of " + num + " is:" + factorial);
	}

}
