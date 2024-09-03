package src.cote.문자열;

import java.util.Scanner;

public class Problem0107 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine().toLowerCase();

		char[] chars = s.toCharArray();
		int lt = 0;
		int rt = chars.length - 1;
		String result = "NO";

		while (lt < rt) {
			if (chars[lt] == chars[rt]) {
				result = "YES";
				lt++;
				rt--;
			} else {
				break;
			}
		}

		System.out.println(result);
	}

	public void solution1() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine().toLowerCase();

		int len = s.length();
		String answer = "YES";
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				answer = "NO";
				break;
			}
		}
		System.out.println(answer);
	}

	// stringBuilder reverse
	public void solution2() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		String answer = "NO";
		String tmp = new StringBuilder(s).reverse().toString();

		if (tmp.equalsIgnoreCase(answer)) {
			answer = "YES";
		}

		System.out.println(answer);
	}
}
