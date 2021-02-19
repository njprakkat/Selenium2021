package week1.day1;

public class Nmobile {
	
	String Brand = "Apple";
	String Model = "Iphone 12";
	short Memory = 64;
	boolean Is100Pixelcamera = true;
	float price = 20000.99f;
	char symbol = 'N';

	
	public int getPrice(int Mobiletype)
	{ 
		
	// CONDITIONAL CHECK & PRINTING WITHIN METHOD	
		if (Mobiletype==1)
			System.out.println("10000");
		else
			if(Mobiletype==2)
				System.out.println("20000");
			else
				if(Mobiletype==3)
					System.out.println("30000");
				else
					System.out.println("40000");
		
		return(Mobiletype);

	}
	
	public String getModel()
	{
	return("Iphone12");
	
	}

	@SuppressWarnings("unused")
	private void printPicture()
	{
		System.out.println(" Print picture now");
	}


	

	public static void main(String[] args) {
	
	Nmobile mob = new Nmobile();
	
   /* CALLING METHOD , CHECKING & PRINTING IN MAIN
	 int mobiletype = mob.getPrice(10);
	if (mobiletype==1)
		System.out.println("10000");
	else
		if(mobiletype==2)
			System.out.println("20000");
		else
			if(mobiletype==3)
				System.out.println("30000");
			else
				System.out.println("40000");

	*/
	
	mob.getPrice(10);
	
}


}

