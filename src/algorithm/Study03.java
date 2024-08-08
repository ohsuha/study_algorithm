package src.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study03 {
    /** 구간 합 : 구간합은 합 배열을 이용하여 시간 복잡도를 줄이기 위해 사용하는 특수한 알고리즘이다.
     * S[i] = A[0] + A[1] +... A[i-1] + A[i]
     * 합 배열을 미리 구해 놓으면 시간 복잡도가 O(N) -> O(1) 이 된다.
     * 합 배열 S를 만드는 공식 : S[i] = S[i-1] + A[i]
     * 구간 합을 구하는 공식 : S[j] - S[i-1] : i ~ j 까지의 구간 합
     **/

    /**
     * 문제 : 수 N 개가 주어졌을 때 i 번째 수에서 j번째 수까지의 합을 구하는 프로그램을 작성하시오.
     */

    public void day3() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader는 문자 입력 스트림에 대한 버퍼링된 입력 스트림을 제공합니다. 이것을 사용하여 키보드로부터의 입력을 받아들입니다.
        //InputStreamReader(System.in)은 표준 입력 스트림(System.in)을 InputStreamReader로 감싸는데, 이것은 바이트 스트림을 문자 스트림으로 변환하는 역할을 합니다.

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //BufferedReader.readLine()은 입력 스트림으로부터 한 줄을 읽어 들입니다. 읽어들인 내용은 문자열로 반환됩니다.
        //StringTokenizer는 문자열을 지정된 구분자(delimiter)를 기준으로 토큰으로 분리하는 데 사용됩니다. 여기서는 공백을 기준으로 분리합니다.
        //만약 . 으로 구분하고 싶다면?
        //StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), ".");

        int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 전체 데이터의 개수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 합을 구해야하는 횟수
        long[] S = new long[suNo + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //라인은 다음 입력 줄을 읽어 들여서 그 줄을 토큰으로 분리할 준비를 하는 부분입니다
        //사용자로부터 한 줄을 입력받고, 그 입력된 문자열은 StringTokenizer의 생성자로 전달됩니다.
        // 이렇게 하면 새로운 입력 줄이 읽히고 이를 기반으로 새로운 토큰화 작업이 준비됩니다.
        // 이렇게 함으로써 반복적으로 사용자 입력을 받고 처리할 수 있습니다.

        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken()); // 합 배열 만들기 S[i] = S[i-1] + A[i]
        }

        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]); // 구간합 S[j] - S[i-1]
        }
    }
}
