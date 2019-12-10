package myArrays;

public class CenteredAverage {

    /*
    Returns the "centered" average of an array of ints, which is the mean average of the values, except ignoring
    the largest and smallest values in the array. If there are multiple copies of the smallest value, ignores
    just one copy, and likewise for the largest value.
    Assumes that the array is length 3 or more.
     */




    public int centeredAverage(int[] nums) {
        int sum = 0;
        int minEl = 0;
        int maxEl = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                minEl = nums[i];
                maxEl = nums[i];
            }
            sum += nums[i];
            if (nums[i] < minEl) {
                minEl = nums[i];
            }
            if (nums[i] > maxEl) {
                maxEl = nums[i];
            }
        }
        return (sum - minEl - maxEl) / (nums.length - 2);
    }

}
