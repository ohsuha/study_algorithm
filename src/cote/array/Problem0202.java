package src.cote.array;

import java.util.Scanner;

public class Problem0202 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n + 1];
		array[0] = 0;

		for (int i = 1; i < n + 1; i++) {
			array[i] = scanner.nextInt();
		}

		int tall = 0;
		int count = 0;
		for (int i = 1; i < n + 1; i++) {
			if (array[i] > array[i - 1] && array[i] > tall) {
				tall = array[i];
				count++;
			}
		}

		System.out.println(count);
	}

	public void solution() {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		int answer = 1;
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
	}
}
