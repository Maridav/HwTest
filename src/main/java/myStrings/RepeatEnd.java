package myStrings;

public class RepeatEnd {

    /*
    Given a string and an int n, returns a string made of n repetitions of the last n characters of the string.
    n is between 0 and the length of the string, inclusive.
     */

    public String repeatEnd(String str, int n) {
        String result = "";
        String end = str.substring(str.length() - n, str.length());
        for (int i = 0; i < n; i++) {
            result += end;
        }
        return result;
    }

}
