package src.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 슬라이딩 윈도우 알고리즘은 2개의 포인터로 범위를 지정한 다음 범위를 유지한채로 이동하며 문제를 해결한다.
 * 투포인터 알고리즘과 비슷하다.
 * <p>
 * [문제]
 * DNA 문자열 : 모든 문자열에 등장하는 문자가 A, C, G, T 인 문자열 : AAAA, ACAA, TCGA
 * 임의의 문자열 AAACCTGCCAA 에서 길이 4의 문자를 추출 할때 A,C,G,T 가 각각 몇번 이상 등장해야 비밀번호로 사용할 수 있는지,
 * 조건을 입력하고 조건에 맞춰서 만들 수 있는 비밀번호의 종류의 수를 구하는 프로그램을 작성하자.
 * 문자열의 위치가 달라도 다른 문자열로 취급한다.
 */
public class Study08 {
	static int[] checkArr;
	static int[] myArr;
	static int checkSecret;

	public void algorithm() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int S = Integer.parseInt(st.nextToken()); // 전체 DNA 문자열의 길이
		int P = Integer.parseInt(st.nextToken()); // 검사할 부분 문자열의 길이
		int Result = 0;
		char[] A = new char[S]; // DNA 문자열
		checkArr = new int[4]; // 각 문자 (A, C, G, T)가 부분 문자열에 최소 몇 번 등장해야 하는지를 저장하는 배열
		myArr = new int[4]; // 현재 슬라이딩 윈도우 내에서 각 문자(A, C, G, T)가 몇 번 등장했는지 저장하는 배열
		checkSecret = 0; // 조건을 만족한 문자 개수를 세는 변수. 4가 되면 모든 조건이 만족되었다는 뜻

		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) {
				checkSecret++;
			}
		}

		// 초기 슬라이딩 윈도우 설정
		for (int i = 0; i < P; i++) {
			Add(A[i]);
		}

		// 처음 슬라이딩 윈도우가 조건을 만족하는지 확인
		if (checkSecret == 4) {
			Result++;
		}

		// 슬라이딩 윈도우 처리 부분
		for (int i = P; i < S; i++) {
			int j = i - P;
			Add(A[i]);    // 새로운 문자를 추가
			Remove(A[j]); // 이전 문자를 제거
			if (checkSecret == 4) {
				Result++;
			}
		}

		System.out.println(Result);
		bf.close();
	}

	// 새로 들어오는 문자를 처리하는 함수
	private static void Add(char c) {
		switch (c) {
			case 'A':
				myArr[0]++;
				if (myArr[0] == checkArr[0]) checkSecret++;
				break;
			case 'C':
				myArr[1]++;
				if (myArr[1] == checkArr[1]) checkSecret++;
				break;
			case 'G':
				myArr[2]++;
				if (myArr[2] == checkArr[2]) checkSecret++;
				break;
			case 'T':
				myArr[3]++;
				if (myArr[3] == checkArr[3]) checkSecret++;
				break;
		}
	}

	// 제거되는 문자를 처리하는 함수
	private static void Remove(char c) {
		switch (c) {
			case 'A':
				if (myArr[0] == checkArr[0]) checkSecret--;
				myArr[0]--;
				break;
			case 'C':
				if (myArr[1] == checkArr[1]) checkSecret--;
				myArr[1]--;
				break;
			case 'G':
				if (myArr[2] == checkArr[2]) checkSecret--;
				myArr[2]--;
				break;
			case 'T':
				if (myArr[3] == checkArr[3]) checkSecret--;
				myArr[3]--;
				break;
		}
	}
}
