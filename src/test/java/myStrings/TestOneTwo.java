package myStrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOneTwo {

    private OneTwo oneTwo = new OneTwo();

    @Test(expected = NullPointerException.class)
    public void onNull() {

        String expected = "";
        String actual = oneTwo.oneTwo(null);

    }

    @Test
    public void emptyString() {

        String expected = "";
        String actual = oneTwo.oneTwo("");

        assertEquals(expected, actual);

    }

    @Test
    public void stringOfLengthLessThanThree() {

        String expected = "";
        String actual = oneTwo.oneTwo("ab");

        assertEquals(expected, actual);

    }

    @Test

    public void stringWithThreeChar() {

        String expected = "atc";
        String actual = oneTwo.oneTwo("cat");

        assertEquals(expected, actual);

    }

    @Test
    public void lengthDividedByThree() {

        String expected = "leAanxerd";
        String actual = oneTwo.oneTwo("Alexander");

        assertEquals(expected, actual);

    }

    @Test
    public void lengthNotDividedByThree() {

        String expected = "arM";
        String actual = oneTwo.oneTwo("Maria");

        assertEquals(expected, actual);

    }

}
