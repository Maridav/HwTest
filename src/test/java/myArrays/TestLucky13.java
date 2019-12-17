package myArrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestLucky13 {

    private Lucky13 lucky13 = new Lucky13();

    @Test(expected = NullPointerException.class)
    public void onNull() {

        int[] example = null;
        boolean result = lucky13.lucky13(example);

    }

    @Test
    public void returnsTrueOnEmpty() {

        int[] example = {};
        boolean result = lucky13.lucky13(example);

        assertTrue(result);

    }



    @Test
    public void noOnesThrees() {

    int[] example = {2, 4, 5, 6, 7, 8};
    boolean result = lucky13.lucky13(example);

    assertTrue(result);

    }

    @Test
    public void onlyOnes() {

        int[] example = {1, 1, 1, 2, 4};
        boolean result = lucky13.lucky13(example);

        assertFalse(result);
    }

    @Test
    public void onlyThrees() {

        int[] example = {3, 2, 4, 3};
        boolean result = lucky13.lucky13(example);

        assertFalse(result);

    }

    @Test
    public void onesAndThrees() {

        int[] example = {1, 3, 1, 3, 4};
        boolean result = lucky13.lucky13(example);

        assertFalse(result);
    }

}
