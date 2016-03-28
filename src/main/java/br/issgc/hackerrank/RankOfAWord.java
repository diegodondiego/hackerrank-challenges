/**
 *
 */
package br.issgc.hackerrank;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author dinhego
 *
 */
public class RankOfAWord {

	private final String word;

	private Long rankInPermutations;

	/**
	 *
	 * @param word
	 */
	public RankOfAWord(String word) {
		super();
		this.word = word;
		this.rankInPermutations = 0L;
		this.evalRank();
	}

	/**
	 * evaluates the rank and put in the {@link RankOfAWord#rankInPermutations}
	 * attribute
	 */
	private void evalRank() {

		if (this.word == null || this.word.trim().length() == 0) {
			throw new RuntimeException("Invalid word to eval: " + this.word);
		}

		// sort the characters for eval the permutations
		final List<Character> sortedChars = this.word.chars()
				.mapToObj(c -> (char) c)
				.sorted()
				.collect(Collectors.toList());
		final Map<Character, Long> occurenciesByChar = this.word.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		int tempRank = this.word.length() - 1;
		// the last char is always one.
		for (int charAt = 0; charAt < this.word.length() - 1; charAt++) {

			int sortedCharCount = 0;
			for (final Character sortedChar : sortedChars) {

				if (this.word.charAt(charAt) == sortedChar) {
					break;
				}
				sortedCharCount++;
				this.rankInPermutations += this.factorial(tempRank) / occurenciesByChar.get(sortedChar);
			}

			sortedChars.remove(sortedCharCount);
			tempRank--;
		}

		this.rankInPermutations++;

	}

	/**
	 *
	 * @param number
	 *            a positive number
	 * @return its factorial (math: number!)
	 */
	private long factorial(long number) {
		if (number < 0) {
			throw new RuntimeException("no way a factorial of a negative number!");
		}

		if (number <= 1) {
			return 1;
		}

		return number * (this.factorial(number - 1));

	}

	public String getWord() {
		return this.word;
	}

	public Long getRankInPermutations() {
		return this.rankInPermutations;
	}

}
