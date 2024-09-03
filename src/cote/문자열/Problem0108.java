package src.cote.문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem0108 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		char[] chars = s.toCharArray();

		ArrayList list = new ArrayList();
		for (char c : chars) {
			if (Character.isLetter(c)) {
				list.add(Character.toLowerCase(c));
			}
		}

		int lt = 0;
		int rt = list.size() - 1;
		String result = "NO";

		while (lt < rt) {
			if (list.get(lt) == list.get(rt)) {
				result = "YES";
				lt++;
				rt--;
			} else {
				result = "NO";
				break;
			}
		}

		System.out.println(result);
	}
}
