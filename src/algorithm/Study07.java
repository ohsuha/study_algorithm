package src.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Study07 {
	/**
	 * [문제] 좋은 수 구하기
	 * 주어진 N개의 수에서 다른 두 수의 합으로 표현되는 수가 있다면 그 수를 '좋은 수' 라고 한다. N 개의 수 중 좋은 수가 총 몇 개인지 출력하시오
	 * <p>
	 * [입력]
	 * 들어올 수 의 갯수 N, 다음줄에는 들어올 수들 공백으로 구분하여 N개 만큼들어오기
	 */

	public void algorithm() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		long[] A = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(A);

		for (int k = 0; k < N; k++) {
			long find = A[k];

			int i = 0;
			int j = N - 1;

			while (i < j) {
				if (A[i] + A[j] == find) {
					if (i != k && j != k) {
						result++;
						break;
					} else if (i == k) {
						i++;
					} else if (j == k) {
						j--;
					}
				} else if (A[i] + A[j] < find) {
					i++;
				} else if (A[i] + A[j] > find){
					j--;
				}
			}
		}

		System.out.println(result);
		br.close();
	}
}
