package week1.day2;

import java.util.Scanner;

public class CalculateArmstrong {

	public boolean findArmstrong(int number)
	{
		int num=0;
		int sum=0, j,rem=0;
		num=number;
		while(num>0)
		{
		rem = num%10;
		sum = sum + (rem*rem*rem);
		j=num/10;
		num=j;
		}
		
		System.out.println(sum);
		if (sum == number)
			return true;
		else 
			return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateArmstrong obj = new CalculateArmstrong();
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter number to check if its Armstrong");
		int number = scan.nextInt();
		boolean flag = obj.findArmstrong(number);
		
		if(flag == true)
			System.out.println(" Number is Armstrong");
		else
			System.out.println(" Number is not Armstrong");
	}

}
