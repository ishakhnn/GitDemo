package ProgramForPractice;

public class DivideStringByComa {

	public static void main(String[] args) {
		String name = "Isha";
		String comaString = "";
		int strlength = name.length();

		for (int i = 0; i < strlength; i++) {
			comaString += String.valueOf(name.charAt(i));
			if (i != strlength - 1) {
				comaString += ",";
			}
		}
		System.out.println(comaString);

	}
}
