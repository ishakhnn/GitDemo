package ProgramForPractice;

import java.util.HashMap;
import java.util.Set;

public class UniqueNumber {

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 5, 3, 2, 5 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			Integer value = map.get(arr[i]);
			if (value == null) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], value + 1);
			}
		}
		for (Integer key : map.keySet()) {
			int val = map.get(key);
//			if (val > 1) {
//				map.remove(key);
//			}
		}

		for (Integer key : map.keySet()) {
			System.out.println("Key: " + key + " val: " + map.get(key));
		}
	}
}
