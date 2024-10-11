package src.cote.정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem0606 {
	public void algorithm () {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int[] sort = arr.clone();
		Arrays.sort(sort);

		int C = 0;
		int J = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != sort[i]) {
				C = i + 1;
				arr[i] = sort[i];
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] != sort[i]) {
				J = i + 1;
				break;
			}
		}

		System.out.print(C + " " + J);
	}

	public void solution() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int[] tmp = arr.clone();
		Arrays.sort(tmp);

		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] != tmp[i]) {
				answer.add(arr[i]);
			}
		}
		
		for (int i : answer) {
			System.out.print(i + " ");
		}
	}
}
