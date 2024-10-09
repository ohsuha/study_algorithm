package src.cote.정렬;

import java.util.Scanner;

public class Problem0602 {
	// 버블 정렬
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		//이웃한 두수를 비교해서 바꿔주는 정렬
		for (int i = 0; i < n - 1; i++) { // 각 턴별로 제일 큰 숫자가 뒤로 가기 때문에 N 만큼의 반복이 필요하다.
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
