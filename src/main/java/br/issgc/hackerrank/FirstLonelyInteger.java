/**
 * ISSGC ®2015
 */
package br.issgc.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author dinhego
 *
 */
public class FirstLonelyInteger {

	static int findFirstLonelyInteger(int[] array) {

		List<Integer> alreadyFound = new ArrayList<Integer>();

		for (int position = 0; position < array.length; position++) {
			int checkingThisInt = array[position];
			if (alreadyFound.contains(Integer.valueOf(checkingThisInt))) {
				// already evaluated
				continue;
			}
			boolean foundADuplicate = false;
			for (int check = 0; check < array.length; check++) {
				if (check == position) {
					// is the same position tested above
					continue;
				}
				if (checkingThisInt == array[check]) {
					foundADuplicate = true;
					alreadyFound.add(Integer.valueOf(checkingThisInt));
					break;
				}
			}
			if (!foundADuplicate) {
				return checkingThisInt;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int arraySize = Integer.parseInt(in.nextLine());

		if (arraySize % 2 != 1) {
			System.out.println("ERROR! Not even.");
			in.close();
			return;
		}

		int[] array = new int[arraySize];
		String next = in.nextLine();
		String[] splittedNumbers = next.split(" ");

		for (int index = 0; index < arraySize; index++) {
			array[index] = Integer.parseInt(splittedNumbers[index]);
		}

		in.close();

		System.out.println(findFirstLonelyInteger(array));

	}
}
