package week1.day2;

public class FindIntersectionofArray {

	public void findIntersection()
	{
		int [] a = {1,3,4,7,9};
		int [] b = {2,4,5,7,9};
		
		for (int i=0; i<a.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]== b[j])
					System.out.println( "Intersection Element of Arrays A&B are: " + a[i]);
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindIntersectionofArray obj = new FindIntersectionofArray();
		obj.findIntersection();
		  
	}

}
