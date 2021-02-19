package week1.day2;

public class Sumofdigits
{
	
public void findSum()
{
	int i= 299, quotient;
	int sum=0;
	

	while(i>0)
	{
		sum=sum + i%10;
		quotient=i/10;	
		i=quotient;
		
	}
	
	System.out.println(" Sum of 3 digits is: " +sum);
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sumofdigits obj = new Sumofdigits();
		obj.findSum();
	}

}
