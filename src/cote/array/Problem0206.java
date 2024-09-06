package src.cote.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem0206 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		ArrayList<Boolean> decimalNumbers = new ArrayList<>();

		decimalNumbers.add(0, false);
		decimalNumbers.add(1, false);

		for (int i = 2; i <= 100000; i++) {
			decimalNumbers.add(true);
		}

		for (int i = 2; (i * i) <= 100000; i++) {
			if (decimalNumbers.get(i)) {
				for (int j = i * i; j <= 100000; j += i) {
					decimalNumbers.set(j, false);
				}
			}
		}

		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}

		for (int i = 0; i < N; i++) {
			StringBuilder str = new StringBuilder(arr[i]).reverse();
			int num = Integer.parseInt(str.toString());

			if (isDecimal(decimalNumbers, num)) {
				System.out.print(num + " ");
			}
		}
	}

	public static boolean isDecimal(List<Boolean> decimalNumbers, int num) {
		boolean flag = false;
		for (int i = 0; i < decimalNumbers.size(); i++) {
			if (decimalNumbers.get(num)) {
				flag = true;
			}
		}
		return flag;
	}
}
