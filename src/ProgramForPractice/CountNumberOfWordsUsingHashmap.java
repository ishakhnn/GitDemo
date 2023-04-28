package ProgramForPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountNumberOfWordsUsingHashmap {

	public static void main(String args[]) {
		String str = "This this is is done by Isha Isha Khanna".toLowerCase();
		String[] words = str.split(" ");
		HashMap<String, Integer> uniqueWordsMap = new HashMap<>();

		for (int i = 0; i < words.length; i++) {
			String key = words[i];
			Integer value = uniqueWordsMap.get(key);
			if (value == null) {
				uniqueWordsMap.put(key, 1);
			} else {
				uniqueWordsMap.put(key, value + 1);
			}
		}

		uniqueWordsMap.forEach((k, v)-> System.out.println("Key:" + k + " Value:" + v));
	}

}
