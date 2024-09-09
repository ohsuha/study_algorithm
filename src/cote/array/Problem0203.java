package src.cote.array;

import java.util.Scanner;

public class Problem0203 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}

		//1 가위 2 바위 3 보
		for (int i = 0; i < n; i++) {
			if (A[i] == B[i]) {
				System.out.println("D");
			}
			if (B[i] - A[i] == 1 || B[i] - A[i] == -2) {
				System.out.println("B");
			} else if (B[i] - A[i] == 2 || B[i] - A[i] == -1) {
				System.out.println("A");
			}
		}
	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}

		String answer = "";
		for (int i = 0; i < n; i++) {
			if (A[i] == B[i]) {
				answer += "D";
			} else if (A[i]==1 && B[i]==3) {
				answer += "A";
			} else if (A[i]==2 && B[i]==1) {
				answer += "A";
			} else if (A[i]==3 && B[i]==2) {
				answer += "A";
			} else {
				answer += "B";
			}
		}

		System.out.println(answer);
	}
}
