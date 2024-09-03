package src.cote.문자열;

import java.util.Scanner;

public class Problem0110 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strings = str.split(" ");
		char c = strings[1].charAt(0);
		String string = strings[0];

		int p = 1000;

		int[] answer = new int[string.length()];

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				p = 0;
			}
			answer[i] = p;
			p++;
		}

		p = 1000;

		for (int i = string.length() - 1; i >= 0; i--) {
			if (string.charAt(i) == c) {
				p = 0;
			}

			if (p < answer[i]) {
				answer[i] = p;
			}
			p++;
		}

		for (int i : answer) {
			System.out.print(i + " ");
		}
	}

	//Math 를 통해서 크기 비교
	public void solution() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strings = str.split(" ");
		char c = strings[1].charAt(0);
		String string = strings[0];

		int p = 1000;

		int[] answer = new int[string.length()];

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				p=0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}

		p = 1000;

		for (int i = string.length() - 1; i >= 0; i--) {
			if (string.charAt(i) == c) {p=0;}
			else {
				p++;
				answer[i] = Math.min(p, answer[i]);
			}
		}

		for (int i : answer) {
			System.out.print(i + " ");
		}
	}
}
