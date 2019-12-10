package myArrays;

public class FizzArray {

    /*
    Given a number n, creates and returns a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    The given n may be 0, in which case just returns a length 0 array.
     */

    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

}
