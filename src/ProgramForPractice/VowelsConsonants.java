package ProgramForPractice;

public class VowelsConsonants {
	
	public static void main (String args[])
	{
		
		String str= "Hello! Good Morning";
		int vowel=0 , consonant=0;
		
		str= str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowel++;
			}
			else if(ch>='a' && ch<= 'z')
			{
				consonant++;
			}
		}
		
		System.out.println("Vowels are " + vowel);
		System.out.println("Consonants are " + consonant);
	}
	
}
