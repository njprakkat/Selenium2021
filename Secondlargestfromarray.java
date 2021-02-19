package week1.day2;

import java.util.Arrays;

public class Secondlargestfromarray {

	public void findsecondLargest()
	{
		int [] num = { 3,2,11,4,6,7};
		Arrays.sort(num);
		
					System.out.println (num[num.length-2] + " Second largest array");
	

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Secondlargestfromarray obj = new Secondlargestfromarray();
		obj.findsecondLargest();
		
	}

}
