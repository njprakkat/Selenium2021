package week1.day1;

public class CalculatePrime {

	public void getPrime(int number)
	{
		int j=0;
		for(int i=1; i<=number; i++)
		{
			if(number%i==0)
			{
			 j++;
			}
			
			}
		
		if(j==2)
		{
			System.out.println(" The number is prime");
		}
			else
			
			{
			System.out.println(" The number is composite");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatePrime obj = new CalculatePrime();
		obj.getPrime(55);
	}

}

