package src.cote.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem0201 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] ints = new int[n + 1];

		ints[0] = Integer.MIN_VALUE;

		for (int i = 1; i <= n; i++) {
			ints[i] = scanner.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			if (ints[i] > ints[i - 1]) {
				System.out.print(ints[i] + " ");
			}
		}
	}

	public void solution() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 1; i <= n; i++) {
			arr[i] = scanner.nextInt();
		}

		ArrayList answer = new ArrayList();
		answer.add(arr[0]);

		for (int i = 1; i < n; i++) {
			if(arr[i] > arr[i - 1]) {
				answer.add(arr[i]);
			}
		}

		System.out.println(answer);
	}

}
