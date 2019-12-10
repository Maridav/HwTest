package myArrays;

public class Lucky13 {

    /*
    Given an array of ints, returns true if the array contains no 1's and no 3's.
     */

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

}
