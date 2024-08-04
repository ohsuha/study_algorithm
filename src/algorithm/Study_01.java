package src.algorithm;

import java.util.Scanner;

public class Study_01 {
    /*
    문제 : N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오
    입력 : 1번째 줄에 숫자의 갯수 N(1<=N<=100) , 2번째 줄에 숫자 N개가 공백 없이 주어진다.
    출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
    */
    public void algorithm() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String n2 = sc.next();
        char[] n3 = n2.toCharArray();

        int result = 0;
        for (int i = 0; i < n3.length; i++) {
            // [내 생각]
            // 1.
            // result += n3[i];
            // 이렇게 하면 각 문자가 ASCII 값으로 변환되어 더해지는 것이지, 숫자 123이 더해지는 것이 아니였다.
            // 2.
            // result += Integer.parseInt(String.valueOf(n3[i]));

            // [GPT]
            // 더 나은 방법 중 하나는 문자를 정수로 변환하는 것입니다. Java에서는 문자를 정수로 변환하는 데에는 Character.getNumericValue() 메서드를 사용할 수 있습니다.
            // 이 메서드를 사용하면 문자를 해당하는 숫자 값으로 바로 변환할 수 있습니다.
            // result += Character.getNumericValue(n2.charAt(i));

            // [책]
            result += n3[i] - '0';
            // result += n3[i] - '0'; 이렇게 하는 이유는 문자 '0'의 ASCII 값이 정수 0의 ASCII 값과 같기 때문입니다.
            // ASCII에서 숫자 '0'은 48에 해당하고, 숫자들은 연속적으로 0부터 9까지 48부터 57까지의 ASCII 값을 갖습니다. 그래서 '0'을 빼주면 해당 문자가 나타내는 숫자 값이 얻어지게 됩니다.
            // 예를 들어, '1'의 ASCII 값은 49이고, '0'의 ASCII 값은 48입니다. 따라서 '1' - '0'은 49 - 48이 되어 1이 됩니다. 같은 방식으로 '2' - '0'은 50 - 48이 되어 2가 됩니다.
            // * 따라서 result += n3[i] - '0';은 각 문자를 해당하는 숫자로 변환하여 더하는 것을 의미합니다.

            System.out.print(i + " : " + n3[i] + "\n" + "[중간]result : " + result + "\n");
        }

        System.out.print("\n result : " + result);
    }
}
