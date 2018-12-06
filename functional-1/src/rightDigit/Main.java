package rightDigit;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nlosada on 06/12/18.
 *
 * Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
 *
 * rightDigit([1, 22, 93]) → [1, 2, 3]
 * rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
 * rightDigit([10, 0]) → [0, 0]
 *
 * https://codingbat.com/prob/p152194
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(rightDigit(Arrays.asList(new Integer[]{1, 22, 93})));
        System.out.println(rightDigit(Arrays.asList(new Integer[]{16, 8, 886, 8, 1})));
        System.out.println(rightDigit(Arrays.asList(new Integer[]{10, 0})));
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(i->Math.abs(i)%10);
        return nums;
    }
}
