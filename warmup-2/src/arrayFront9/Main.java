package arrayFront9;

/**
 * Created by nlosada on 30/10/18.
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
 *
 * arrayFront9([1, 2, 9, 3, 4]) → true
 * arrayFront9([1, 2, 3, 4, 9]) → false
 * arrayFront9([1, 2, 3, 4, 5]) → false
 *
 * https://codingbat.com/prob/p186031
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Main.arrayFront9(new int[]{ 1, 2, 9, 3, 4 }));
        System.out.println(Main.arrayFront9(new int[]{ 1, 2, 3, 4, 9 }));
        System.out.println(Main.arrayFront9(new int[]{ 1, 2, 3, 4, 5 }));
    }

    public static boolean arrayFront9(int[] nums) {
        int i = 0;
        while (i<nums.length) {
            if (nums[i] == 9 && i < 4 ) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }
}
