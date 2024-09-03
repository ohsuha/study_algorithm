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
			} else{
				result += str[i];
				count = 1;
			}
		}
		System.out.println(result);
	}
}
