package src.cote.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Problem0401 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String[] ch =  str.split("");

		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 0);
		map.put("B", 0);
		map.put("C", 0);
		map.put("D", 0);
		map.put("E", 0);

		String answer = "";
		int max = Integer.MIN_VALUE;
		for (String c : ch) {
			switch (c) {
				case "A":
					map.put("A", map.get("A") + 1);
					if (map.get("A") > max) {
						max = map.get("A");
						answer = "A";
					}
					break;
				case "B":
					map.put("B", map.get("B") + 1);
					if (map.get("B") > max) {
						max = map.get("B");
						answer = "B";
					}
					break;
				case "C":
					map.put("C", map.get("C") + 1);
					if (map.get("C") > max) {
						max = map.get("C");
						answer = "C";
					}
					break;
				case "D":
					map.put("D", map.get("D") + 1);
					if (map.get("D") > max) {
						max = map.get("D");
						answer = "D";
					}
					break;
				case "E":
					map.put("E", map.get("E") + 1);
					if (map.get("E") > max) {
						max = map.get("E");
						answer = "E";
					}
					break;
			}
		}
		System.out.println(answer);
	}
}
