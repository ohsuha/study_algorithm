package src.cote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem0104 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			String word = scanner.next();
			char[] result = new char[word.length()];
			int index = word.length() - 1;
			for (int j = 0; j < word.length(); j++) {
				result[j] = word.charAt(index);
				index--;
			}
			System.out.println(String.valueOf(result));
		}
	}

	//reverse, StringBuilder
	public void solution1(){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = scanner.next();
		}

		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			System.out.println(tmp);
		}
	}

	//left, right
	public void solution2(){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = scanner.next();
		}

		for (String x : str) {
			char[] s = x.toCharArray();
			//study : lt = s / rt = y => lt와 rt 를 바꿔나가기
			int lt = 0, rt = x.length() - 1;

			while (lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;

				lt++;
				rt--;
			}

			System.out.println(String.valueOf(s));
		}

	}
}
