/**
 *
 */
package br.issgc.tests.pangram;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.issgc.hackerrank.PangramEvaluator;

/**
 * Tests donwloaded from hackerrank
 *
 * @author dinhego
 *
 */
public class HackerRankTestCase {

	/**
	 * buyed with hackos
	 */
	@Test
	public void firstTest() {

		assertTrue(
				"pangram".equals(new PangramEvaluator("qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun").getResult()));
	}

	// samples

	@Test
	public void firstSample() {

		assertTrue("pangram".equals(
				new PangramEvaluator("We promptly judged antique ivory buckles for the next prize").getResult()));
	}

	@Test
	public void secondSample() {

		assertTrue("not pangram"
				.equals(new PangramEvaluator("We promptly judged antique ivory buckles for the prize").getResult()));
	}
}
