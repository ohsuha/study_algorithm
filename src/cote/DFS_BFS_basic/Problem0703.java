package src.cote.DFS_BFS_basic;

import java.util.Scanner;

public class Problem0703 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(factorial(n));
	}

	public int factorial(int n) {
		if (n==1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
