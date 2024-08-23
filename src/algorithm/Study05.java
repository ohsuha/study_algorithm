package src.algorithm;

import java.util.Scanner;

public class Study05 {
	/**
	 * 연속된 자연수의 합 구하기
	 *
	 * 어떠한 자연수 N은 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 이 가짓수가 몇개가 되는지 구해보자
	 *
	 * 1. 입력받은 값은 N
	 * 2. count 는 1로 초기화 한다 N이 15일떄 숫자 15만 뽑는 경우의 수를 미리 넣기 때문이다.
	 * 3. 투 포인터 이동 원칙을 활용해 배열의 끝까지 탐색하면서 합이 N이 될 경우의 수를 구한다.
	 *    [투 포인터 이동 원칙]
	 *    sum > N : sum = sum - start_index; start_index++;
	 *    sum < N : end_index++; sum = sum + end_index;
	 *    sum == N : end_index++; sum = suma + end_index; count++;
	 * 4. 위의 단계를 end_index 가 N이 될 때까지 반복하되, 포인터가 이동할 때마다 현재의 총합과 N 을 비교해 값이 같으면 count 를 1씩 증가한다.
	 */
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 1;
		int startIndex = 1;
		int endIndex = 1;
		int sum = 1;

		while(endIndex != N) {
			if(sum == N) {
				count = count + 1;
				endIndex = endIndex + 1;
				sum = sum + endIndex;
			} else if (sum > N) {
				sum = sum - startIndex;
				startIndex = startIndex + 1;
			} else {
				endIndex = endIndex + 1;
				sum = sum + endIndex;
			}
		}
		System.out.println(count);

		/**
		 *startIndex = 1, endIndex = 1, sum = 1
		 * sum이 15보다 작으므로 endIndex를 2로 올리고 sum에 2를 더해줍니다. (sum = 3)
		 * 계속해서 sum이 15보다 작을 동안 endIndex를 올리고 sum을 늘려갑니다.
		 * sum = 15가 되면 count를 1 증가시킵니다.
		 * endIndex를 늘려가면서 다시 반복합니다.
		 * sum이 15보다 크면 startIndex를 올려가며 sum을 줄여줍니다.
		 * 이 과정을 반복하면, 최종적으로 count = 4가 됩니다.
		 *
		 * startIndex를 올리는 이유:
		 *
		 * 이 상태에서는 sum이 너무 크므로, 현재의 startIndex를 빼고 그 다음 수로 넘어가야 합니다.
		 * sum에서 startIndex(1)를 빼고 startIndex를 2로 증가시킵니다.
		 * 이제 sum = 21 - 1 = 20이 됩니다.
		 * 여전히 sum이 N보다 크므로, 다시 startIndex를 올려가며 sum을 조정합니다.
		 * sum에서 2를 빼고, startIndex를 3으로 증가시킵니다. 그러면 sum = 20 - 2 = 18이 됩니다.
		 * 계속해서 이 작업을 반복하다 보면, sum = 15가 되는 지점이 생깁니다. 예를 들어, startIndex = 4, endIndex = 6일 때, sum = 4 + 5 + 6 = 15가 됩니다.
		 */
	}
}
