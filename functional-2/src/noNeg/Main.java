package noNeg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nlosada on 06/12/18.
 * <p>
 * Given a list of integers, return a list of the integers, omitting any that are less than 0.
 * <p>
 * noNeg([1, -2]) → [1]
 * noNeg([-3, -3, 3, 3]) → [3, 3]
 * noNeg([-1, -1, -1]) → []
 * <p>
 * https://codingbat.com/prob/p103456
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(noNeg(Arrays.asList(new Integer[]{1, -2})));
        System.out.println(noNeg(Arrays.asList(new Integer[]{-3, -3, 3, 3})));
        System.out.println(noNeg(Arrays.asList(new Integer[]{-1, -1, -1})));
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(i->i>=0).collect(Collectors.toList());
    }
}
