// My solution to the HackerRank.com problem "Manasa and Stones."
// https://www.hackerrank.com/challenges/manasa-and-stones/problem

import java.util.ArrayList;
import java.util.Scanner;

public class ManasaAndStones {
	static int[] stones(int n, int a1, int b1) {

		ArrayList<Integer> tempArray = new ArrayList<>();

		int a = Math.min(a1, b1);
		int b = Math.max(a1, b1);

		if (a1 == b1) {
			int total = (n - 1) * a1;
			tempArray.add(total);
		} else {
			int m = n - 1;
			for (int i = 0; i < n; i++) {
				tempArray.add((m - i) * a + (i * b));
			}
		}

		int[] result = new int[tempArray.size()];
		for (int j = 0; j < tempArray.size(); j++) {
			result[j] = tempArray.get(j);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of test cases, T (integer 1-10): ");
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			System.out.print("Enter the number, n, of stones for test case #" + (a0 + 1) + ", (integer 1-1000): ");
			int n = in.nextInt();
			System.out.print("Enter the value for 'a' for test case #" + (a0 + 1) + ", (integer 1-n-100): ");
			int a = in.nextInt();
			System.out.print("Enter the value for 'b' for test case #" + (a0 + 1) + ", (integer 1-a,n-100): ");
			int b = in.nextInt();
			int[] result = stones(n, a, b);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
			}
			System.out.println("");

		}
		in.close();
	}
}
