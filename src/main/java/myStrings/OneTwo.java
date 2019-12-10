package myStrings;

public class OneTwo {

    /*
    Given a string, computes a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
    Repeats this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
    Ignores any group of fewer than 3 chars at the end.
     */

    public String oneTwo(String str) {
        String result = "";
        for (int k = 0; k < str.length() / 3 ; k ++) {
            result += str.substring(3* k + 1, 3 * k + 3);
            result += str.substring(3 * k, 3 * k + 1);
        }
        return result;
    }

}
