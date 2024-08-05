package src.algorithm;

import java.util.Scanner;

public class Study02 {
    /**
     * 문제 : 세준이는 기말고사를 망쳤다 그래서 점수를 조작해 집에 가져가기로 결심했다.
     * 일단 세준이는 자기 점수중 최댓값을 골랐다. 그런 다음 최댓값을 M이라 할때 모든 점수를 점수/M*100 으로 고쳤다.
     * 예를 들어 세준이의 최고점이 70점, 수학점수가 50점이라면 수학 점수는 50/70*100 이므로 71.43점이다. 세준이의 성적을 이 방법으로 계산했을 때 새로운 평균을 구하는 프로그램을 작성하시오
     * 입력 : 1번째 줄에 시험을 본 과목의 개수 N이 주어진다. 해당값은 1000이하. 2번쨰 줄에 세준이의 현재 성적이 주어진다. 해당값은 100보다 작은 음이 아닌 정수이고, 적어도 1개의 값은 0보다 크다.
     */

    public void algorithm() {
        // 50, 80, 20 이 들어오면
        // 50/80*100 80/80*100 20/80*100 으로 바꾸는 것임
        // 입력 받은 숫자중 가장 큰 숫자 * 100 이 반복되는 부분임
        // (50/80*100 + 80/80*100 + 20/80*100) / 3 이 평균
        // (50+80+20)*100/80/3
        Scanner sc = new Scanner(System.in);
        //1. 과목 갯수 받기 N
        //2. 과목을 배열에 저장하기
        //3. 배열에서 최고 점수 얻기 = max
        //4. 전체 점수의 총합 얻기 = sum
        //5. sum*100/max/N
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        //첫번째 풀이
//        long startTime = System.nanoTime();
//
//        OptionalInt max = Arrays.stream(A).max();
//        int sum = Arrays.stream(A).sum();
//        System.out.println(sum*100.0/max.getAsInt()/N);
//
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        System.out.println("연산 시간 : " + duration);
        //연산 시간 : 4010875 , 2369042, 1264917, 2217875, 2287125

        //두번째 풀이
        long startTime = System.nanoTime();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (A[i] > max){
                max = A[i];
            }
        }

        System.out.println(sum*100/max/N);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("연산 시간 : " + duration);
        //연산시간 343125 460375 302541

        /**
         * 왜 아래꺼가 더 빠를까????
         * [GPT]
         * Stream API 사용 회피: 첫 번째 코드에서는 Arrays.stream(A)를 두 번 호출합니다.
         * 이는 배열 A를 스트림으로 변환하는 과정을 두 번 반복한다는 의미입니다. 스트림 생성은 객체를 생성하고 초기화하는 비용이 발생할 수 있습니다.
         *
         * min, max 요소 찾기 오버헤드 회피: 첫 번째 코드에서는 max() 메서드를 호출하여 최댓값을 찾습니다.
         * 메서드 호출은 추가적인 프로세서 명령을 실행하고, 메서드 호출 스택을 관리하는데 필요한 오버헤드가 있을 수 있습니다.
         *
         * 불필요한 객체 생성 회피: 첫 번째 코드에서는 OptionalInt 객체를 생성하고, getAsInt()를 호출하여 int로 언박싱합니다.
         * 첫 번째 코드에서는 OptionalInt 객체를 생성하고, getAsInt()를 호출하여 int로 언박싱합니다.
         * 이 과정에서 불필요한 객체 생성 및 메모리 할당이 발생하고, 언박싱 과정에서 추가적인 오버헤드가 발생할 수 있습니다.
         *
         * 스트림 파이프라인 오버헤드 회피: 첫 번째 코드에서는 Stream API를 사용하여 파이프라인을 구성하고, 이에 따른 내부적인 최적화 과정이 필요합니다.
         * 반면에 두 번째 코드는 간단한 반복문으로 이루어져 있어 이러한 오버헤드가 없습니다.
         * => 배열을 반복문으로 처리할 수 있다면 stream 보다 단순한 for each 반복문을 사용하자!
         */
    }
}
