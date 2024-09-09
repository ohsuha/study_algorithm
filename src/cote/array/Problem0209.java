package src.cote.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem0209 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		ArrayList<Integer> sumList = new ArrayList<>();

		// 가로합
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += arr[i][j]; // 01 02 03 04 05 11 12 13 14 15
			}
			sumList.add(sum);
			sum = 0;
		}

		// 세로합
		// 00 / 10 / 20 / 30
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += arr[j][i];
			}
			sumList.add(sum);
			sum = 0;
		}

		// 왼쪽 대각선 합
		int leftCrossSum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					leftCrossSum += arr[i][j];
				}
			}
		}
		sumList.add(leftCrossSum);

		// 0, N    1, N - 1,     2, N - 2     ,  31 40
		int rightCrossSum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (j == (n - 1 - i)) {
					rightCrossSum += arr[i][j];
				}
			}
		}
		sumList.add(rightCrossSum);

		int max = Integer.MIN_VALUE;
		for (int sum : sumList) {
			if (sum > max) {
				max = sum;
			}
		}

		System.out.println(max);
	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int answer = Integer.MAX_VALUE;

		int sum1;
		int sum2;

		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}

		sum1=sum2=0;
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2+=arr[i][n-i-1];
		}

	}

}
