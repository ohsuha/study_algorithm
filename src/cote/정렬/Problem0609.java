package src.cote.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Problem0609 {
	// 결정 알고리즘
	// lt, rt 사이에 정답이 있다고 확신이 들때 사용한다.

	//들어갈 노래중에 가장 큰값이 가장 최소값이 된다.
	//한장에 다 담으려면 받은 곡의 길이를 모두 합한 값
	public void solution() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		int answer = 0;
		while (lt < rt) {
			int mid = (lt + rt) / 2;

			if (count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}
		System.out.println(answer);
	}

	public int count(int[] arr, int capacity) {
		int cnt = 1;
		int sum = 0;
		for (int x : arr) {
			if (sum + x > capacity){
				cnt++;
				sum = x;
			} else {
				sum += x;
			}
		}
		return cnt;
	}
}
