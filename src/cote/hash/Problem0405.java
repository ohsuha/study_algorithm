package src.cote.hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem0405 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder()); // 내림차순으로 자동 정렬

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					treeSet.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		int answer = -1;
		int cnt = 0;
		for (int x : treeSet) {
			cnt++;
			if (cnt == m) {
				answer = x;
				break;
			}
		}
		System.out.println(answer);
	}
}
