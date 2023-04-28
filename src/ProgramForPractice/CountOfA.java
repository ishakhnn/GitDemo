package ProgramForPractice;

import java.util.HashMap;

public class CountOfA {

	public static void main(String args[])
	{
	String str= "This is a a a good program";
	str=str.toLowerCase();
	String[] newStr = str.split(" ");
	HashMap<String, Integer> countOfKey= new HashMap<>();
	
	for(int i=0;i<newStr.length; i++)
	{
		Integer value=countOfKey.get(newStr[i]);
		if(value==null)
		{
			countOfKey.put(newStr[i],1);
		}
		else
		{
			countOfKey.put(newStr[i], value+1);
		}
	}
	
	System.out.println("value of a " + countOfKey.get("a"));
	}
}
