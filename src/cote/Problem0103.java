package src.cote;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem0103 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
		String tmp = "";

		while (stringTokenizer.hasMoreTokens()) {
			String tmpStr = stringTokenizer.nextToken();
			if (tmpStr.length() > tmp.length()) {
				tmp = tmpStr;
			}
		}

		System.out.println(tmp);
	}

	//split()
	public void solution1() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		String result = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");

		for (String x : s) {
			int len = x.length();
			if (len > m) {
				m = len;
				result = x;
			}
		}
		System.out.println(result);
	}

	// indexOf, substring
	public void solution2() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		String result = "";
		int m = Integer.MIN_VALUE;
		int pos;

		while ((pos = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos);

			int len = tmp.length();
			if (len > m) { // 단어의 크기가 같을 경우 가장 앞에 있는 것을 하므로 >= 하면 안됨
				m = len;
				result = tmp;
			}
			str = str.substring(pos + 1); //앞에 뜯어낸거 지우기
		}

		//마지막 단어는 공백이 없으므로 이렇게 체크해줘야함
		if (str.length() > m) {
			result = str;
		}

		System.out.println(result);
	}
}
