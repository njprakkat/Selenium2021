package week1.day1;

public class CheckDivisibility {

	public void checkDivisible()
	{
		for(int i=1; i<=25;i++)
		{
			
			if(i%3==0 && i%7==0)
			{
				System.out.println(i+ ":BizFiz");
				
			}
			
			else
				
			if(i%3==0)
			{
				System.out.println(i + ":Biz");
			
			}
			else
				
				if(i%7==0)
				{	
					System.out.println(i + ":Fiz ");
					
				}
			
			else
					{
						System.out.println(i + ":Is not divisible by 3 or 7");
						
					}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckDivisibility obj = new CheckDivisibility();
		obj.checkDivisible();
		
		
	}

}
