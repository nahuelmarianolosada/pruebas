package noTeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nlosada on 06/12/18.
 * <p>
 * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
 * <p>
 * noTeen([12, 13, 19, 20]) → [12, 20]
 * noTeen([1, 14, 1]) → [1, 1]
 * noTeen([15]) → []
 * <p>
 * https://codingbat.com/prob/p137274
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(noTeen(Arrays.asList(new Integer[]{12, 13, 19, 20})));
        System.out.println(noTeen(Arrays.asList(new Integer[]{1, 14, 1})));
        System.out.println(noTeen(Arrays.asList(new Integer[]{15})));
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(i -> i < 13 || i > 19).collect(Collectors.toList());
    }
}
