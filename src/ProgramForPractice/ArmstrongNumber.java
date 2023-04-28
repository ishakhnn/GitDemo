package ProgramForPractice;

public class ArmstrongNumber {
	
	public static void main(String args[])
	{
		int number= 153;
		int sum=0, temp;
		
		while(number>0)
		{
			temp= number%10; // 3,5,1 
			sum=(int) (sum+Math.pow(temp, 3)); // 3,8,9
			number=number/10; // 15, 1,0
		}
		
		System.out.println(sum);
	}

}
