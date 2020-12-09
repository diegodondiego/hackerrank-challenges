package br.issgc.tests.rankofaword;

import br.issgc.hackerrank.RankOfAWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * testing words without duplications
 *
 * @author dinhego
 */
class WithoutDuplications {

    /**
     * testing the 'bacd' from hackerhank ranked as 7.
     */
    @Test
    void bacd() {
        assertEquals(Long.valueOf(7), new RankOfAWord("bacd").getRankInPermutations());
    }

    /**
     * testing 'abdfce' from hackerrank too... this work is ranked as 11.
     */
    @Test
    public void abdfce() {
        assertEquals(Long.valueOf(11), new RankOfAWord("abdfce").getRankInPermutations());
    }

    /**
     * testing 'abfcde' from hackerrank again! this work is ranked as 19.
     */
    @Test
    public void abfcde() {
        assertEquals(Long.valueOf(19), new RankOfAWord("abfcde").getRankInPermutations());
    }

    /**
     * testing 'master'. this work is ranked as 257.
     */
    @Test
    public void master() {
        assertEquals(Long.valueOf(257), new RankOfAWord("master").getRankInPermutations());
    }

    /**
     * testing the 'bright' from hackerhank ranked as 85.
     */
    @Test
    public void mother() {
        assertEquals(Long.valueOf(309), new RankOfAWord("mother").getRankInPermutations());
    }

}
