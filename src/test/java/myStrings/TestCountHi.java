package myStrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCountHi {

    private CountHi countHi = new CountHi();

    @Test(expected = NullPointerException.class)
    public void onNull() {
        String given = null;

        int expected = 0;
        int result = countHi.countHi(given);

    }

    @Test
    public void onEmptyString() {
        String given = "";

        int expected = 0;
        int result = countHi.countHi(given);

        assertEquals(expected, result);
    }

    @Test
    public void ifNoHi() {

        String given = "abcdfjhngkjnjrkth";

        int expected = 0;
        int result = countHi.countHi(given);

        assertEquals(expected, result);

    }

    @Test
    public void onHi() {

        String given = "hi";

        int expected = 1;
        int result = countHi.countHi(given);

        assertEquals(expected, result);

    }

    @Test
    public void ifHiInBeginning1() {

        String given = "hiabc";

        int expected = 1;
        int result = countHi.countHi(given);

        assertEquals(expected, result);

    }

    @Test
    public void ifHiInBeginning2() {
        String given = "hiabchiabc";

        int expected = 2;
        int result = countHi.countHi(given);

        assertEquals(expected, result);
    }

    @Test
    public void ifHiInEnd1() {

        String given = "abchi";

        int expected = 1;
        int result = countHi.countHi(given);

        assertEquals(expected, result);

    }

    @Test
    public void ifHiInEnd2() {
        String given = "abchiabchi";

        int expected = 2;
        int result = countHi.countHi(given);

        assertEquals(expected, result);
    }

    @Test
    public void ifHiGoesRightAfterHi() {
        String given = "abchihiabc";

        int expected = 2;
        int result = countHi.countHi(given);

        assertEquals(expected, result);
    }
}
