/**
 *
 */
package br.issgc.tests.pangram;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.issgc.hackerrank.PangramEvaluator;

/**
 * Tests for {@link PangramEvaluator}
 *
 * @author dinhego
 *
 */
public class EvaluateParameter {

	/**
	 * test with a empty pangram
	 */
	@Test(expected = IllegalArgumentException.class)
	public void emptyPangram() {

		new PangramEvaluator("");

	}

	/**
	 * test with a null pangram
	 */
	@Test(expected = IllegalArgumentException.class)
	public void nullPangram() {

		new PangramEvaluator(null);

	}

	/**
	 * test with a pangram with only a empty space
	 */
	@Test(expected = IllegalArgumentException.class)
	public void emptySpacePangram() {

		new PangramEvaluator(" ");

	}

	/**
	 * check if there isn't empty spaces at the pangram before the evaluation
	 */
	@Test
	public void noEmptySpacesAtPangramToBeEvaluated() {

		final String pangramWithALotOfSpaces = "We promptly judged antique ivory buckles for the next prize";

		final String cleansedPossiblePangram = new PangramEvaluator(pangramWithALotOfSpaces).getPossiblePangram();
		assertTrue(pangramWithALotOfSpaces.replaceAll("\\s+", "").toLowerCase().equals(cleansedPossiblePangram));
		assertTrue("wepromptlyjudgedantiqueivorybucklesforthenextprize".equals(cleansedPossiblePangram));
	}
}
