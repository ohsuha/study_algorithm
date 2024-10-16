package src.cote.DFS_BFS_basic;

import java.util.Scanner;

public class Problem0702 {
	//재귀를 이용해 이진수를 출력하자
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DFS(n);
	}

	public void DFS(int n) {
		if (n == 0) {
			return;
		} else {
			DFS(n / 2);
			System.out.print(n % 2 + " ");
		}
	}
}
