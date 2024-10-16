package src.cote.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Problem0610 {
	public void solution() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n - 1];
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (count(arr, mid) >= c) {
				answer = mid;
				lt = mid + 1;
			} else
				rt = mid - 1;
		}
		System.out.println(answer);
	}

	public int count(int[] arr, int dist) {
		int cnt=1;
		int ep=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]-ep>=dist){
				cnt++;
				ep=arr[i];
			}
		}
		return cnt;
	}
}
