package ProgramForPractice;

public class Palindrome {

	public static void main(String args[]) {
		String s1 = "hah";
		String s2 = "";
		for (int i = s1.length() - 1; i >=0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s2.equals(s1)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
