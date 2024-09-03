package src.cote;

import java.util.Scanner;

public class Problem0105 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		char[] word = scanner.nextLine().toCharArray();
		int lt = 0;
		int rt = word.length - 1;

		while (lt < rt) {
			if (Character.isAlphabetic(word[lt]) && Character.isAlphabetic(word[rt])) {
				char tmp = word[lt];
				word[lt] = word[rt];
				word[rt] = tmp;
				lt++;
				rt--;
			} else if (Character.isAlphabetic(word[lt]) && !Character.isAlphabetic(word[rt])) {
				rt--;
			} else if (!Character.isAlphabetic(word[lt]) && Character.isAlphabetic(word[rt])) {
				lt++;
			} else {
				lt++;
				rt--;
			}
		}

		System.out.println(String.valueOf(word));
		// time limit 에 걸림
	}

	public void solution() {
		Scanner scanner = new Scanner(System.in);
		char[] word = scanner.nextLine().toCharArray();
		int lt = 0;
		int rt = word.length - 1;

		while (lt < rt) {
			if (!Character.isAlphabetic(word[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(word[rt])) {
				rt--;
			} else {
				char tmp = word[lt];
				word[lt] = word[rt];
				word[rt] = tmp;
				lt++;
				rt--;
			}
		}

		System.out.println(String.valueOf(word));
	}
}
