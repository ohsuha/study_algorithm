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
		 *
		 *
		 *
		 *
		 이 알고리즘이 반복문으로 모든 경우를 체크하는 것보다 빠른 이유는 효율적인 탐색 방법을 사용하기 때문입니다.
		 구체적으로는, 두 개의 포인터 (startIndex와 endIndex)를 이용하여 불필요한 계산을 줄이면서 가능한 경우를 찾아가는 방식이기 때문입니다.

		 반복문으로 모든 경우를 체크하는 방법
		 먼저, 가장 단순한 방법으로 모든 경우를 다 체크하는 방식이 무엇인지 설명해볼게요.

		 모든 조합을 체크:

		 1부터 N까지 모든 숫자를 시작점으로 삼아, 그 이후의 모든 숫자들과 더해 나갑니다.
		 예를 들어, N = 15라면:
		 1 + 2 + 3 + 4 + ...을 계산
		 2 + 3 + 4 + ...을 계산
		 3 + 4 + ...을 계산
		 이런 식으로 N까지 계속합니다.
		 각 경우를 하나씩 계산하여 sum이 N과 같을 때만 카운트를 증가시킵니다.
		 비효율성:

		 이 방법은 매우 비효율적입니다. 이유는 startIndex와 endIndex가 각각 1에서 N까지 순차적으로 모든 조합을 탐색하므로, 중복된 계산이 매우 많습니다.
		 예를 들어, 1 + 2 + 3을 계산했다면, 다음으로 2 + 3을 계산할 때도 2와 3이 겹칩니다. 하지만 이걸 매번 처음부터 계산합니다.
		 시간 복잡도 측면에서 보면, 이 방법은 O(N^2)에 가까운 복잡도를 가집니다.
		 두 포인터(슬라이딩 윈도우) 기법
		 이제 현재 코드의 두 포인터 방법이 왜 더 빠른지 설명하겠습니다.

		 두 포인터로 계산을 줄임:

		 startIndex와 endIndex라는 두 포인터를 사용하여, sum이 너무 크면 startIndex를 증가시키고, sum이 너무 작으면 endIndex를 증가시킵니다.
		 한 번의 계산에서 이미 sum에 포함된 값들을 재사용할 수 있습니다.
		 예를 들어, 1 + 2 + 3 + 4 + 5 = 15를 계산한 뒤에, startIndex를 2로 이동하면 2 + 3 + 4 + 5 + 6과 같은 새로운 조합을 바로 얻을 수 있습니다. 이 과정에서 이미 계산된 부분을 제외하고 새로운 숫자만 더하거나 빼기 때문에 계산을 줄일 수 있습니다.
		 효율성:

		 이렇게 하면 중복된 계산을 피할 수 있으며, 불필요한 조합을 건너뛸 수 있습니다.
		 예를 들어, sum이 N보다 커지면 바로 startIndex를 증가시켜서 sum을 줄이는 식으로 빠르게 탐색 범위를 조정할 수 있습니다.
		 시간 복잡도는 O(N)입니다. startIndex와 endIndex가 각각 N번 이내에서만 이동하며 전체 탐색을 수행하기 때문입니다.
		 결론
		 브루트포스 방식은 모든 경우를 다 일일이 체크하므로, 불필요한 계산이 많고, 시간 복잡도가 높아집니다.
		 반면, 두 포인터 방식은 이미 계산된 결과를 재활용하고, 불필요한 부분은 빠르게 제외하면서 sum을 조정해 나가기 때문에 훨씬 효율적입니다.
		 이로 인해, 두 포인터 방식을 사용하면 전체 탐색을 더 빠르게 수행할 수 있습니다.
		 */
	}
}
