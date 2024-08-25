package src.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Study06 {
    /**
     * [문제] 주몽의 명령
     * 갑옷을 만드는 각각 고유한 번호가 있고, 갑옷은 2개의 재료로 만드는 데 2가지 재료의 고유한 번호를 합쳐 M 이되면 갑옷이 만들어진다.
     * N개의 재료와 M이 주어졌을때 몇 개의 갑옷을 만들 수 있을까?
     * <p>
     * [입력]
     * 1번째 줄에 재료의 개수 N, 2번째 줄에 갑옷을 만는데 필요한 수 M 이 주어진다.
     * 3번째 줄에는 N개의 재료들의 고유 번호가 공백을 사이에 두고 주어진다.
     * <p>
     * [분석]
     * 나 : M - 재료 N[1] 을 구한뒤 리스트에서 있는지 검색한다.
     * <p>
     * 책 : 투포인터 이동원칙을 이용해 먼저 N[]을 오름차순 정렬한 후 가짓수를 찾는다.
     */

    public void algorithm() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 내가 생각한 것
//        long startTime = System.nanoTime();
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < N; i++) {
//            set.add(Integer.parseInt(st.nextToken()));
//        }
//        int count = 0;
//        for (int i : set) {
//            if (set.contains(M - i)) {
//                count++;
//            }
//        }
//        if (count != 1) count /= 2;
//        System.out.println("my algorithm : " + count); // 2+7, 7+2 와 같은 쌍이 있기 때문에 추가
//        long endTime = System.nanoTime();
//        long timeElapsed = endTime - startTime;
//        System.out.println("nano seconds :" + timeElapsed);
        // 걸린 시간 : 523500 , 557167, 1096292, 7602125

        // 투포인터 풀이

        // 1. 재료를 배열 A[N] 에 저장한 후 오름차순 정렬
        long startTime = System.nanoTime();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        // 2. 투포인터를 양끝에 배치 시킨후 포인터 이동원칙에 따라 탐색 수행
        int twoPointerCount = 0;
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (A[i] + A[j] == M) {
                twoPointerCount = twoPointerCount + 1;
                i = i + 1;
                j = j - 1;
            } else if (A[i] + A[j] < M) {
                i = i + 1;
            } else if (A[i] + A[j] > M) {
                j = j - 1;
            }
        }
        System.out.println("two point result : " + twoPointerCount);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("nano seconds :" + timeElapsed);

        // 걸린 시간 : 8808292, 8405083, 9258500

        /**
         * 내가 한게 더 빠른 말도 안되는 결과가 나와서 GPT 한테 물어봄
         * [내가 한거]
         * 고유 번호를 HashSet에 추가하는 데 걸리는 시간은 O(N)
         * 각 재료에 대해 set.contains(M - i)를 수행하는데, HashSet의 검색은 평균적으로 O(1)이므로 이 루프는 O(N)
         * 총 시간 복잡도는 O(N) + O(N) = O(2N)이며, 이는 O(N)으로 축약
         * 공간 복잡도는 HashSet을 사용하므로 O(N)의 추가 공간이 필요
         *
         * [투포인터]
         * 입력 배열을 정렬하는 데 걸리는 시간은 O(N log N), 이후 투포인터 알고리즘을 적용하여 배열을 순회하는 시간은 O(N)
         * 따라서 총 시간 복잡도는 O(N log N) + O(N) = O(N log N)
         * 공간복잡도는 추가적인 공간은 사용하지 않으므로 O(1)
         *
         * **입력 크기 (N)**가 작은 경우, O(N)과 O(N log N)의 시간 복잡도 차이가 그리 크지 않을 수 있습니다. 그러나 N이 매우 큰 경우, O(N log N)은 O(N)보다 확실히 느리게 작동할 것
         * 내장된 HashSet의 구현 최적화 덕분에, 작은 데이터셋에서는 HashSet을 사용한 방법이 비교적 더 빠르게 작동할 수 있습니다.
         * 캐싱 효과 등도 작은 데이터셋에서 HashSet이 더 빠르게 작동하는 이유 중 하나일 수 있습니다.
         * 투포인터 방식에서는 추가적인 배열 정렬 과정이 필요하기 때문에, 작은 N에서는 이 과정이 전체 수행 시간에 영향을 줄 수 있습니다.
         *
         * 결론
         * 작은 입력에서는 HashSet을 이용한 알고리즘이 더 빠를 수 있습니다. 하지만 N이 커질수록 투포인터 알고리즘이 더 효율적일 가능성이 큽니다.
         * HashSet 알고리즘의 시간 복잡도가 O(N)이고 투포인터 알고리즘의 시간 복잡도가 O(N log N)이므로, 큰 데이터셋에서는 후자가 더 효율적일 것입니다.
         */
    }
}
