package myStrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRepeatEnd {

    private RepeatEnd repeatEnd = new RepeatEnd();

    @Test(expected = NullPointerException.class)
    public void onNull() {

        String expected = "";
        String actual = repeatEnd.repeatEnd(null, 0);


    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void nMoreThanLength() {

        String expected = "";
        String actual = repeatEnd.repeatEnd("abc", 239);

        assertEquals(expected, actual);

    }


    @Test
    public void noRepetitions() {

        String expected = "";
        String actual = repeatEnd.repeatEnd("Hello", 0);

        assertEquals(expected, actual);

    }

    @Test
    public void emptyString() {

        String expected = "";
        String actual = repeatEnd.repeatEnd("", 0);

        assertEquals(expected, actual);

    }

    @Test
    public void usualString() {

        String expected = "llollollo";
        String actual = repeatEnd.repeatEnd("Hello", 3);

        assertEquals(expected, actual);

    }



}
