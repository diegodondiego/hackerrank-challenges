/**
 *
 */
package br.issgc.hackerrank;

import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.trim;

import java.util.stream.Collectors;

/**
 * Evaluates if a string is a pangram (Pangrams are sentences constructed by
 * using every letter of the alphabet at least once.) <br>
 * Challenge @ hackerrank:
 * <a href="https://www.hackerrank.com/challenges/pangrams">link</a>
 *
 *
 * @author dinhego
 *
 */
public class PangramEvaluator {

	private final int englishCharactersAlphabetSize;

	private final String possiblePangram;

	private String result;

	/**
	 *
	 * @param possiblePangram
	 *            the possible pangram to be evaluated
	 */
	public PangramEvaluator(String possiblePangram) {

		// simple validation
		if (!isEmpty(trim(possiblePangram))) {
			this.possiblePangram = possiblePangram.trim().replaceAll("\\s+", "").toLowerCase();
		} else {
			throw new IllegalArgumentException("null or empty possible pangram to evaluate");
		}

		// create a list of characters
		this.englishCharactersAlphabetSize = "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(c -> (char) c)
				.collect(Collectors.toList()).size();

		this.evaluatePangram();
	}

	/**
	 * checks if this is a pangram
	 */
	private void evaluatePangram() {

		if (this.possiblePangram.length() < this.englishCharactersAlphabetSize) {
			this.result = "not pangram";
			return;
		}

		// i just thought that could be helpful to order, remove duplicates and
		// compare to the English alphabet variable.
		final int pangramDistinctCharsSize = this.possiblePangram.chars().mapToObj(c -> (char) c).distinct().sorted()
				.collect(Collectors.toList()).size();

		if (this.englishCharactersAlphabetSize != pangramDistinctCharsSize) {
			this.result = "not pangram";
		} else {
			this.result = "pangram";
		}

	}

	public String getPossiblePangram() {
		return this.possiblePangram;
	}

	public String getResult() {
		return this.result;
	}
}
