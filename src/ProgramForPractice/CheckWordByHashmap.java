package ProgramForPractice;

import java.util.HashMap;

public class CheckWordByHashmap {
	
	public static void main(String args[])
	{

	String str="Hello! Good good morning";
	str= str.toLowerCase();

	String[] words= str.split(" ");
	HashMap<String,Integer> map= new HashMap<>();
	
	for(int i=0;i<words.length;i++)
	{
		Integer value = map.get(words[i]);
		if(value==null)
		{
			map.put(words[i], 1);
		}
		else
		{
			map.put(words[i], value+1);
		}
	}
	
	System.out.println("No of 'Good'" + map.get("good"));
}
}