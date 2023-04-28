package ProgramForPractice;

public class Fibnoacii {

	public static void main(String args[])
	{
		int a=0;
		int b=1;
		int i=0;
		while(i<5) 
		{
			int fb=a+b; 
			a=b; 
			b=fb; 
			System.out.println(fb);  
			i++;
		}
	}
}
