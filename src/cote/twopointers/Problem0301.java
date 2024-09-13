package src.cote.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem0301 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array1 = new int[n];
		for (int i = 0; i < n; i++) {
			array1[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] array2 = new int[m];
		for (int i = 0; i < m; i++) {
			array2[i] = scanner.nextInt();
		}

		int[] answer = new int[n + m];

		for (int i = 0; i < n; i++) {
			answer[i] = array1[i];
		}
		for (int i = 0; i < m; i++) {
			answer[i + n] = array2[i];
		}

		Arrays.sort(answer);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}

	public void solution() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array1 = new int[n];
		for (int i = 0; i < n; i++) {
			array1[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] array2 = new int[m];
		for (int i = 0; i < m; i++) {
			array2[i] = scanner.nextInt();
		}

		// 1의 p1 과 2의 p2를 비교해서 answer 에 add 시킨다.

		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0;
		int p2 = 0;

		while (p1 < n && p2 < m) {
			if (array1[p1] < array2[p2]) {
				answer.add(array1[p1++]);
			} else if (array1[p1] > array2[p2]) {
				answer.add(array2[p2++]);
			} else {
				answer.add(array1[p1++]);
				answer.add(array2[p2++]);
			}
		}

		while (p1 < n) {
			answer.add(array1[p1++]);
		}
		while (p2 < m) {
			answer.add(array2[p2++]);
		}

		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
	}
}
