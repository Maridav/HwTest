package myArrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestFizzArray {

    private FizzArray fizzArray = new FizzArray();


    @Test
    public void nullLength() {

        int[] expected = {};
        int[] actual = fizzArray.fizzArray(0);

        assertArrayEquals(expected, actual);

    }

    @Test
    public void usualCase() {

        int[] expected = {0, 1, 2, 3, 4};
        int[] actual = fizzArray.fizzArray(5);

        assertArrayEquals(expected, actual);

    }

}


