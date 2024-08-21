package src.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간합 구하기 2
public class Study04 {
    /**
     [문제]
     N x N개의 수가 표에 채워져있다. 표 안의 수중 X1 Y1 에서 X2 Y2 까지의 합을 구하려고 한다.
     4X4 의 표에서 (2,2) ~ (3,4) 까지 구하고 싶을때는
     (2,2) + (2,3) + (2,4) + (3,2) + (3,3) + (3,4) 를 구하면 된다.

     [입력]
     1번째 줄에 표의 크기 N과 합을 구해야하는 횟수 M이 주어진다.
     2번째 입력 받는 줄부터는 표에 채워져있는 수가 된다.

     [분석]
     2차원 구간 합 배열은 다음과 같이 정의가 가능
     D[X][Y] = 원본 배열의 (0,0) 부터 (X,Y)까지의 사각형 안에 있는 수의 합

     1. 입력받은 숫자로 구간합을 만든 표를 새로 만든다.
     A[] = 입력받은 표  /  D[] = 만들어진 합배열
     1행 : D[1][j] = D[1][j-1] + A[1][j]
     1열 : D[i][1] = D[i-1][1] + A[i][1]
     D[2][2] = D[2][1] + D[1][2] -D[1][1] + A[2][2]

     2. 구간별 합을 구하는 공식
     (2,2) ~ (3,4) 까지의 구간 합
     D[3][4] - D[1][4] - D[3][1] + D[1][1]

     (X1,Y1) ~ (X2,Y2) 에 대한 답을 구간 합으로 구하는 방법
     D[X2][Y2] - D[X1-1][Y2] - D[X2][Y1-1] + D[X1-1][Y1-1]
     */

    public void algorithm() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        // N : N*N 표의 크기
        int N = Integer.parseInt(stringTokenizer.nextToken());
        // M : 질의 수
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int A[][] = new int[N+1][M+1];

        // 표안에 숫자 넣기 원본 배열 저장하기
        for (int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        // 합배열 저장하기
        int D[][] = new int[N+1][N+1];
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= M; j++) {
                // 구간 합을 구한 새로운 표 D[][] 만들기
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];

            }
        }

        for (int i = 1; i <= M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            //2,2
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());

            //3,4
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            // 3,4 - 1,4 - 2,1 + 1,1(겹친곳)
            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            // (3,4) 42 - (2-1, 4) 10 - (3, 1) 6 + (1,1) 1 = 27
            System.out.println(result);
        }
    }
}
