/**
 *
 */
package br.issgc.tests.pangram;


import br.issgc.hackerrank.PangramEvaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    @Test
    public void emptyPangram() {

        assertThrows(IllegalArgumentException.class, () -> {
            new PangramEvaluator("");
        });

    }

    /**
     * test with a null pangram
     */
    @Test
    public void nullPangram() {

        assertThrows(IllegalArgumentException.class, () -> {
            new PangramEvaluator(null);
        });

    }

    /**
     * test with a pangram with only a empty space
     */
    @Test
    public void emptySpacePangram() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PangramEvaluator(" ");
        });
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
