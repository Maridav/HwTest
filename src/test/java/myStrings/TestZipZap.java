package myStrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestZipZap {

    private ZipZap zipZap = new ZipZap();

    @Test(expected = NullPointerException.class)
    public void onNull() {
        String example = null;

        String expected = "";
        String actual = zipZap.zipZap(example);

    }

    @Test
    public void onEmptyString() {
        String example = "";

        String expected = "";
        String actual = zipZap.zipZap(example);

        assertEquals(expected, actual);
    }


    @Test
    public void onLengthsLessThan3() {
        String example = "zp";

        String expected = "zp";
        String actual = zipZap.zipZap(example);

        assertEquals(expected, actual);
    }

    @Test
    public void onStringsWithoutZip() {

        String example = "zdfjbgpbvkrn";

        String expected = "zdfjbgpbvkrn";
        String actual = zipZap.zipZap(example);

        assertEquals(expected, actual);

    }

    @Test
    public void onStringsWithTwoCharBetweenZP() {

        String example = "zoopark";

        String expected = "zoopark";
        String actual = zipZap.zipZap(example);

        assertEquals(expected, actual);
    }

    @Test
    public void onStringWithZip() {

        String example = "zoozipark";

        String expected = "zoozpark";
        String actual = zipZap.zipZap(example);

        assertEquals(expected, actual);
    }

    @Test
    public void zipInBeginAndEnd() {
        String example = "ziplaplapzip";

        String expected = "zplaplapzp";
        String actual = zipZap.zipZap(example);

        assertEquals(expected, actual);
    }

}
