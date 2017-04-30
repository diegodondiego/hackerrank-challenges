/**
 * 
 */
package br.issgc.tests.comparetriplets;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import br.issgc.hackerrank.CompareTheTriplets;

/**
 * Testing for equals rates for bob and alice.
 * 
 * @author dinhego
 *
 */
public class WithEqualsChallengesRates {

	/**
	 * damn cheaters!
	 */
	@Test
	public void theyCheatedAndCopiedEachOthersWork() {

		int[] finalEvaluation = new int[] { 0, 0 };
		
		Assert.assertTrue(Arrays.equals(finalEvaluation, CompareTheTriplets.solve(10, 10, 10, 10, 10, 10)));
		
	}
}
