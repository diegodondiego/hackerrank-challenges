/**
 * 
 */
package br.issgc.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets
 * 
 * @author dinhego
 *
 */
public class CompareTheTriplets {

	/**
	 * alice's and bob's rates
	 * 
	 * @param a0
	 * @param a1
	 * @param a2
	 * @param b0
	 * @param b1
	 * @param b2
	 * @return int[] with alice and bob rates
	 */
	public static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {

		// separating the rates
		int[] alicesRates = new int[] { a0, a1, a2 };
		int[] bobsRates = new int[] { b0, b1, b2 };

		int alicePoints = 0, bobPoints = 0;

		for (int index = 0; index < 3; index++) {

			int whoIsTheBest = Integer.compare(alicesRates[index], bobsRates[index]);

			if (whoIsTheBest > 0) {
				alicePoints++;
			} else if (whoIsTheBest < 0){
				bobPoints++;
			}

		}

		alicesRates = null;
		bobsRates = null;

		return new int[] { alicePoints, bobPoints };
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int[] result = solve(a0, a1, a2, b0, b1, b2);
		String separator = "", delimiter = " ";
		for (Integer value : result) {
			System.out.print(separator + value);
			separator = delimiter;
		}
		System.out.println("");
		in.close();

	}
}
