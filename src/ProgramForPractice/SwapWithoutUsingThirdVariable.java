package ProgramForPractice;

public class SwapWithoutUsingThirdVariable {
	
	public static void main (String args[])
	{
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of x " +x + " Value of y " +y);
}
}
