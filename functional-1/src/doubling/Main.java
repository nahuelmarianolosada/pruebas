package doubling;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nlosada on 04/12/18.
 *
 * Given a list of integers, return a list where each integer is multiplied by 2.
 * doubling([1, 2, 3]) → [2, 4, 6]
 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
 * doubling([]) → []
 *
 * https://codingbat.com/prob/p117665
 *
 * list.replaceAll(lambda) -- calls the lambda once for each item in the list, storing the result back into the list
 * (or other type of collection).
 * e.g. nums.replaceAll(n -> n * 2);
 *
 * list.removeIf(lambda) -- calls the lambda once for each item in the collection, removing each item where the lambda returns true.
 * e.g. nums.removeIf(n -> n < 0);
 *
 * Simple Lambda Examples -- the data types are inferred from the context and from the type of the expression following the "->":
 * n -> n * 2 -- takes Integer, returns Integer
 * n -> n < 0 && n >= -10 -- takes Integer, returns boolean
 * s -> s.length()  -- takes String, returns Integer
 * s -> s.startsWith("hi") -- takes String, returns boolean
 *
 * The Java stream system provides more complicated lambda features. The stream calls do not modify the original list,
 * returning a new data structure of the results. Note that the boolean logic of filter() is the opposite of removeIf().
 * List<Integer> nums = -something-;
 * nums = nums.stream().map(n -> n * 2).filter(n -> n >= 0).collect(Collectors.toList());
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(doubling(Arrays.asList(new Integer[]{1,2,3})));
        System.out.println(doubling(Arrays.asList(new Integer[]{6, 8, 6, 8, -1})));
        System.out.println(doubling(Arrays.asList(new Integer[]{})));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n->n*2);
        return nums;
    }

}
