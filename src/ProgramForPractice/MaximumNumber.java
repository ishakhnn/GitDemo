package ProgramForPractice;

public class MaximumNumber 
{
	public static void main(String args[])
	{
		
	int arr[]= {1,2,4,5,8,9};
	int max= arr[0];
	int min= arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	System.out.println("Maximum number is:" + max);
	System.out.println("Minimum number is:" + min);
}
}
