package ProgramForPractice;

public class PrintUpperCaseLetter {

	public static void main(String[] args) {
		String name = "SachIn";
		for (int i = 0; i < name.length(); i++) {
			char strCharacter = name.charAt(i);
			if (Character.isUpperCase(strCharacter)) {
				System.out.println(strCharacter);
			}
		}
	}
}
