package src.cote.twopointers;

import java.util.Scanner;

public class Problem0303 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int startPoint = 0;
		int endPoint = startPoint + (m - 1);
		int answer = Integer.MIN_VALUE;
		while (endPoint < n) {
			int price = 0;
			for (int i = startPoint; i <= endPoint; i++) {
				price += a[i];
			}
			if (answer < price) {
				answer = price;
			}
			price = 0;
		}
		System.out.println(answer);

		//time limit 에 걸리고 만다..
	}

	public void solution() {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		int answer, sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
			//제일 첫 윈도우의 합
		}

		answer = sum;

		for (int i = k; i < n; i++) {
			sum += (arr[i] - arr[i - k]);
			answer = Math.max(answer, sum);
		}

		System.out.println(answer);
	}
}
