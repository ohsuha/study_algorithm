package src.cote.array;

import java.util.Scanner;

public class Problem0204 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] tmpArr = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			if (i == 0) {
				tmpArr[i] = 0;
			} else if (i == 1) {
				tmpArr[i] = 1;
				System.out.print(tmpArr[i] + " ");
			} else {
				tmpArr[i] = tmpArr[i - 2] + tmpArr[i - 1];
				System.out.print(tmpArr[i] + " ");
			}
		}
	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] result = new int[n];

		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;

		for (int i = 2; i < n; i++) {
			answer[i] = answer[i - 1] + answer[i - 2];
		}

		for (int x : result) {
			System.out.print(x + " ");
		}
	}

	//배열 쓰지 말라고 했을때
	public void solution2() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
