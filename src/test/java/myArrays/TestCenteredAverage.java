package myArrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCenteredAverage {

    CenteredAverage centeredAverage = new CenteredAverage();

    @Test(expected = NullPointerException.class)
    public void onNull() {

        int[] example = null;

        int expected = 0;
        int actual = centeredAverage.centeredAverage(example);

    }

    @Test
    public void returnsZeroOnEmptyArray() {

        int[] example = {};

        int expected = 0;
        int actual = centeredAverage.centeredAverage(example);

        assertEquals(expected, actual);

    }


    @Test
    public void allElementsEqual() {

        int[] example = {239, 239, 239, 239, 239};

        int expected = 239;
        int actual = centeredAverage.centeredAverage(example);

        assertEquals(expected, actual);

    }

    @Test
    public void twoInstancesOfMin() {

        int[] example = {0, 0, 2, 5, 4};

        int expected = 2;
        int actual = centeredAverage.centeredAverage(example);

        assertEquals(expected, actual);

    }

    @Test
    public void usualCase() {

        int[] example = {0, 1, 2, 4, 5};

        int expected = 2;
        int actual = centeredAverage.centeredAverage(example);

        assertEquals(expected, actual);

    }

}
