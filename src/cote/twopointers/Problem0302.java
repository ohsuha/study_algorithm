package src.cote.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem0302 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nArray = new int[n];
		for (int i = 0; i < n; i++) {
			nArray[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] mArray = new int[m];
		for (int i = 0; i < m; i++) {
			mArray[i] = scanner.nextInt();
		}

		Arrays.sort(nArray);
		Arrays.sort(mArray);

		int nPointer = 0;
		int mPointer = 0;
		ArrayList list = new ArrayList();
		while (nPointer < n && mPointer < m) {
			if (nArray[nPointer] < mArray[mPointer]) {
				nPointer++;
			} else if (nArray[nPointer] > mArray[mPointer]) {
				mPointer++;
			} else if (nArray[nPointer] == mArray[mPointer]) {
				list.add(mArray[mPointer]);
				mPointer++;
				nPointer++;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
