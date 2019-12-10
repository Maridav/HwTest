package myArrays;

import main.myArrays.More14;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestMore14 {

    More14 more14 = new More14();

    @Test(expected = NullPointerException.class)
    public void onNull() {

        int[] example = null;
        boolean result = more14.more14(example);

    }

    @Test
    public void returnsFalseOnEmpty() {

        int[] example = {};
        boolean result = more14.more14(example);

        assertFalse(result);

    }

    @Test
    public void onesEqualFours() {

        int[] example = {1, 1, 4, 4, 5};
        boolean result = more14.more14(example);

        assertFalse(result);

    }

    @Test
    public void onesMoreThanFours() {

        int[] example = {1, 1, 1, 2, 4};
        boolean result = more14.more14(example);

        assertTrue(result);
    }

    @Test
    public void foursMoreThanOnes() {

        int[] example = {3, 2, 4, 3};
        boolean result = more14.more14(example);

        assertFalse(result);

    }

    @Test
    public void noOnesNoFours() {

        int[] example = {0, 3, 0, 5, 0, 7};
        boolean result = more14.more14(example);

        assertFalse(result);
    }

}
