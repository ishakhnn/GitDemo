package ProgramForPractice;

import java.util.ArrayList;

public class CountRepeatedDigit {

	public static void main (String args[])
	{
		String str="This is is a a good good sentence";
		String[] words= str.split(" ");
		String checkWord="good";
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equalsIgnoreCase(checkWord))
			{
				count++;
			}

		}
		System.out.println(checkWord + " repeating " + count + " times");
		
		
		
		
		
	}		
}
