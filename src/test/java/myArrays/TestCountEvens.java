package myArrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCountEvens {

    private CountEvens countEvens = new CountEvens();

    @Test(expected = NullPointerException.class)
    public void onNull() {

        int[] example = null;

        int expected = 0;
        int actual = countEvens.countEvens(example);


    }

    @Test
    public void emptyArray() {

        int[] example = new int[0];

        int expected = 0;
        int actual = countEvens.countEvens(example);

        assertEquals(expected, actual);

    }

    @Test
    public void noEvens() {

        int[] example = {1, 3, 5, 7, 9};

        int expected = 0;
        int actual = countEvens.countEvens(example);

        assertEquals(expected, actual);

    }

    @Test
    public void allEvens() {

        int[] example = {0, 2, 4, 6, 8};

        int expected = 5;
        int actual = countEvens.countEvens(example);

        assertEquals(expected, actual);

    }

    @Test
    public void usualCase() {

        int[] example = {1, 2, 3, 5, 8, 13};

        int expected = 2;
        int actual = countEvens.countEvens(example);

        assertEquals(expected, actual);

    }

}
