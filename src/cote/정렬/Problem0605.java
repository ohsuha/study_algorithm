package src.cote.정렬;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Problem0605 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
		}

		if (set.size() == n) {
			System.out.println("U");
		} else {
			System.out.println("D");
		}
	}

	//정렬로 풀어 보기 NLogN
	public void solution() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);
		String answer = "U";
		for (int i = 0; i < n-1; i++) {
			if (arr[i] == arr[i+1]) {
				answer = "D";
				break;
			}
		}
		System.out.println(answer);
	}
}
