package src.cote.DFS_BFS_basic;

import java.util.Scanner;

public class Problem0704 {
	int[] fibo;

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo = new int[n + 1];
		System.out.println(fibonacciDFS(n));
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}

		System.out.println();

		//for
		int[] forFibo = fibonacciFor(n);
		for (int i = 0; i < forFibo.length; i++) {
			System.out.print(forFibo[i] + " ");
		}
	}

	//일반적으로 재귀보다 for문이 더 낫다. 스택 프레임을 생성해야해서 메모리 낭비가 발생함
	public int fibonacciDFS(int n) {
		if (n == 1) {
			fibo[n] = 1;
			return 1;
		} else if (n == 2) {
			fibo[n] = 1;
			return 1;
		} else {
			return fibo[n] = fibonacciDFS(n - 1) + fibonacciDFS(n - 2);
		}
	}

	//for
	public int[] fibonacciFor(int n) {
		int[] result = new int[n];
		for (int i = 0; i <= n-1; i++) {
			if (i == 0) {
				result[i] = 1;
			} else if (i == 1) {
				result[i] = 1;
			} else {
				result[i] = result[i - 1] + result[i - 2];
			}
		}
		return result;
	}
}
