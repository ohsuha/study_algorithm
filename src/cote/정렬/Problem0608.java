package src.cote.정렬;

import java.util.Arrays;
import java.util.Scanner;

//이분 검색을 위한 기술 배우기
public class Problem0608 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		//이분 검색은 무조건 정렬이 되어있어야한다.
		Arrays.sort(arr);

		int answer = 0;
		int lt = 0;
		int rt = n - 1;

		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (arr[mid] == m) {
				answer = mid + 1;
				break;
			}

			if (arr[mid] > m) {
				rt = mid - 1;
			} else if (arr[mid] < m) {
				lt = mid + 1;
			}
		}

		System.out.println(answer);
	}
}
