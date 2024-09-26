package src.cote.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Problem0402 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		String[] strings1 = str1.split("");
		String[] strings2 = str2.split("");

		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();

		for (String s : strings1) {
			map1.put(s, map1.getOrDefault(s, 0) + 1);
		}
		for (String s : strings2) {
			map2.put(s, map2.getOrDefault(s, 0) + 1);
		}

		String answer = "YES";

		for (String s : map1.keySet()) {
			if (map1.get(s) != map2.get(s)) {
				answer = "NO";
			}
		}

		System.out.println(answer);
	}
}
