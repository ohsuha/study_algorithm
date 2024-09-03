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
			if(chars[lt] == chars[rt]){
				result = "YES";
				lt++;
				rt--;
			} else {
				break;
			}
		}

		System.out.println(result);
	}
}
