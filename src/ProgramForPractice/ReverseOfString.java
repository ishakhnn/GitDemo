package ProgramForPractice;

public class ReverseOfString {

	public static void main(String[] args)
	{
		String str= "Isha";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		
		}
		System.out.println(rev);
	}
}
