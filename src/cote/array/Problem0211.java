package src.cote.array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem0211 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int[][] result = new int[n][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < n; j++) {
				int compare = arr[j][i];
				int count = 0;
				for (int k = 0; k < 5; k++) {
					if (i != k && compare == arr[k][j]) {
						count++;
					}
				}
				result[i][j] = count;
				count = 0;
				compare = 0;
			}
		}
		System.out.println(Arrays.deepToString(result));
	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n + 1][6];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int answer = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= n; i++) { //학생
			int count = 0;
			for (int j = 1; j <= n; j++) { // 학생
				for (int k = 1; k <= 5; k++) { //학년
					if (arr[i][k] == arr[j][k]){
						count++;
						break;
					}
				}
			}
			// i 번 학생과 같은 반을 한 학생은 몇명이다!
			if (count > max) {
				max = count;
				answer = i;
			}
		}

		System.out.println(answer);
	}
}
