package br.issgc.tests.rankofaword;

import br.issgc.hackerrank.RankOfAWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * in this tests we are going to test this below:
 *
 * <ul>
 * <li>word: 'vamsi' - answer: 100
 * <li>word: 'sam' - answer: 5
 * <li>word: 'bright' - answer: 85
 * <li>word: 'computer' - answer: 1607
 * <li>word: 'dcba' - answer: 24
 * <li>word: 'happy' - answer: 13
 * <li>word: 'aaam' - answer: 1
 * <li>word: 'aadhaar' - answer: 31
 * <li>word: 'abcdabcd' - answer: 187
 *
 * </ul>
 *
 * @author dinhego
 *
 */
public class TestCasesFromHackerRank {

	/**
	 * testing 'vamsi' from hackerhank ranked as 100.
	 */
	@Test
	public void vamsi() {
		assertEquals(Long.valueOf(100), new RankOfAWord("vamsi").getRankInPermutations());
	}

	/**
	 * testing 'sam' from hackerhank ranked as 5.
	 */
	@Test
	public void sam() {
		assertEquals(Long.valueOf(5), new RankOfAWord("sam").getRankInPermutations());
	}

	/**
	 * testing the 'bright' from hackerhank ranked as 85.
	 */
	@Test
	public void bright() {
		assertEquals(Long.valueOf(85), new RankOfAWord("bright").getRankInPermutations());
	}

	/**
	 * testing the 'computer' from hackerhank ranked as 1607.
	 */
	@Test
	public void computer() {
		assertEquals(Long.valueOf(1607), new RankOfAWord("computer").getRankInPermutations());
	}

	/**
	 * testing the 'dbca' from hackerhank ranked as 24.
	 */
	@Test
	public void dcba() {
		assertEquals(Long.valueOf(24), new RankOfAWord("dcba").getRankInPermutations());
	}

	/**
	 * testing the 'happy' from hackerhank ranked as 13.
	 */
	@Test
	public void happy() {
		assertEquals(Long.valueOf(13), new RankOfAWord("happy").getRankInPermutations());
	}

	/**
	 * testing the 'aaam' from hackerhank ranked as 1.
	 */
	@Test
	public void aaam() {
		assertEquals(Long.valueOf(1), new RankOfAWord("aaam").getRankInPermutations());
	}

	/**
	 * testing the 'happy' from hackerhank ranked as 31.
	 */
	@Test
	public void aadhaar() {
		assertEquals(Long.valueOf(31), new RankOfAWord("aadhaar").getRankInPermutations());
	}

	/**
	 * testing the 'happy' from hackerhank ranked as 187.
	 */
	@Test
	public void abcdabcd() {
		assertEquals(Long.valueOf(187), new RankOfAWord("abcdabcd").getRankInPermutations());
	}

}
