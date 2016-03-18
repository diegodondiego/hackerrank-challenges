/**
 *
 */
package br.issgc.hackerrank;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

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

	private final List<Character> englishCharactersAlphabet;

	private final String possiblePangram;

	public PangramEvaluator(String possiblePangram) {

		// simple validation
		if (!StringUtils.isEmpty(possiblePangram)) {

			this.possiblePangram = possiblePangram.trim().replaceAll("\\s+", "");
		} else {
			throw new IllegalArgumentException("null or empty possible pangram to evaluate");
		}

		// create a list of characters
		this.englishCharactersAlphabet = "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(c -> (char) c)
				.collect(Collectors.toList());
	}

}
