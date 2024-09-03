package src.cote.문자열;

import java.util.Scanner;

public class Problem0111 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		char[] str = scanner.nextLine().toCharArray();
		String result = "";
		int count = 1;

		for (int i = 0; i < str.length; i++) {
			if (i != 0 && str[i] == str[i - 1]) {
				count++;
				if (i == str.length - 1) {
					result += count;
				}
				continue;
			}
			if (count != 1) {
				result += count + "" + str[i];
				count = 1;
			} else {
				result += str[i];
				count = 1;
			}
		}
		System.out.println(result);
	}

	public void solution() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String answer = "";
		str = str + " "; //마지막 문자, 공백과 비교하기 위해
		int cnt = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				answer += str.charAt(i);
				if (cnt > 1) {
					answer += String.valueOf(cnt);
				}
				cnt = 1;
			}
		}
		System.out.println(answer);
	}
}
