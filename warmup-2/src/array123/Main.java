package array123;

import java.util.Arrays;

/**
 * Created by nlosada on 27/11/18.
 *
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 * array123([1, 1, 2, 3, 1]) → true
 * array123([1, 1, 2, 4, 1]) → false
 * array123([1, 1, 2, 1, 2, 3]) → true
 *
 * https://codingbat.com/prob/p136041
 *
 * Solution:
 * public boolean array123(int[] nums) {
 * // Note: iterate < length-2, so can use i+1 and i+2 in the loop
 * for (int i=0; i < (nums.length-2); i++) {
 * if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
 * }
 * return false;
 * }
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(Main.array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(Main.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    public static boolean array123(int[] nums) {
        return Arrays.toString(nums).replaceAll("\\, ", "").indexOf("123") == -1 ? false : true;
    }

}
