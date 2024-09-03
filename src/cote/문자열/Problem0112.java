package src.cote.문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem0112 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < n * 7; i += 7) {
			list.add(str.substring(i, i + 7));
		}

		char[] result = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			string = string.replace('#', '1');
			string = string.replace('*', '0');
			int number = Integer.parseInt(string, 2);
			result[i] = (char)number;
		}
		System.out.println(String.valueOf(result));
	}


	//substring chain replace
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		String answer = "";
		for (int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*','0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			s = s.substring(7); //다음것을 뽑아내게 하기 위해 이렇게 수정
		}
		System.out.println(answer);
	}
}
