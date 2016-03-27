package br.issgc.tests.rankofaword;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.issgc.hackerrank.RankOfAWord;

/**
 * testing words without duplications
 *
 * @author dinhego
 *
 */
public class WithoutDuplications {

	/**
	 * testing the 'bacd' from hackerhank ranked as 7.
	 */
	@Test
	public void bacd() {
		assertEquals(new Long(7), new RankOfAWord("bacd").getRankInPermutations());
	}

	/**
	 * testing 'abdfce' from hackerrank too... this work is ranked as 11.
	 */
	@Test
	public void abdfce() {
		assertEquals(new Long(11), new RankOfAWord("abdfce").getRankInPermutations());
	}

	/**
	 * testing 'abfcde' from hackerrank again! this work is ranked as 19.
	 */
	@Test
	public void abfcde() {
		assertEquals(new Long(19), new RankOfAWord("abfcde").getRankInPermutations());
	}

	/**
	 * testing 'master'. this work is ranked as 257.
	 */
	@Test
	public void master() {
		assertEquals(new Long(257), new RankOfAWord("master").getRankInPermutations());
	}

	/**
	 * testing the 'bright' from hackerhank ranked as 85.
	 */
	@Test
	public void mother() {
		assertEquals(new Long(309), new RankOfAWord("mother").getRankInPermutations());
	}

}
