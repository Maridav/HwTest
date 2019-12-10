package myStrings;


public class ZipZap {

    /*
    Looks for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
    Returns a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     */

    public String zipZap(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'z' && (i < str.length() - 2 && str.charAt(i + 2) == 'p')) {
                result += "zp";
                i += 3;
            }
            else {
                result += str.charAt(i);
                i++;
            }
        }
        return result;
    }


}
