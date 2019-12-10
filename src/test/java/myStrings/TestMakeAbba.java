package myStrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMakeAbba {

    MakeAbba makeAbba = new MakeAbba();

    @Test
    public void onNull() {

        String expectedResult = "nullnullnullnull";
        String result = makeAbba.makeAbba(null, null);

        assertEquals(expectedResult, result);
    }


    @Test
    public void returnsEmptyStringIfStringsEmpty() {

        String expectedResult = "";
        String result = makeAbba.makeAbba("", "");

        assertEquals(expectedResult, result);

    }

    @Test
    public void returnsFirstStringIfSecondEmpty() {

        String first = "first";
        String second = "";

        String expectedResult = "firstfirst";
        String result = makeAbba.makeAbba(first, second);

        assertEquals(expectedResult, result);
    }

    @Test
    public void returnsRightThing() {

        String first = "first";
        String second = "second";

        String expectedResult = "firstsecondsecondfirst";
        String result = makeAbba.makeAbba(first, second);

        assertEquals(expectedResult, result);

    }
}
