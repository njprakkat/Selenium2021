package week1.day2;

public class SumdigitsfromString {

	public void findsum(String str)
	{
		int sum=0, num = 0;
		char ch[] = str.toCharArray();
		System.out.println("String split to characters are:");
		for(int i=0; i<ch.length;i++)
		{
			System.out.println(ch[i]);
			if(Character.isDigit(ch[i]))
			{
			num = Character.getNumericValue(ch[i]);
			sum=sum + num;
			
			}
			
		}
		
		System.out.println(" Sum of digits in given string is: " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumdigitsfromString obj = new SumdigitsfromString();
		String str = "Tes12Le79af65";
		obj.findsum(str);
		
	}

}
