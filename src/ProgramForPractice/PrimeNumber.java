package ProgramForPractice;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int num=9;
		boolean isPrime=true;
		for(int i=2; i<num;i++)
		{
			if(num%2==0)
			{
				System.out.println("Number is not prime");
				isPrime=false;
				break;
			}
		}
		if(isPrime==true)
		{
			System.out.println("Number is prime");
		}
	}
}




