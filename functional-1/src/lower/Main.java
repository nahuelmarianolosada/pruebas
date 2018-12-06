package lower;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nlosada on 06/12/18.
 *
 * Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
 *
 * lower(["Hello", "Hi"]) → ["hello", "hi"]
 * lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
 * lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 *
 * https://codingbat.com/prob/p186894
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(lower(Arrays.asList(new String[]{"Hello", "Hi"})));
        System.out.println(lower(Arrays.asList(new String[]{"AAA", "BBB", "ccc"})));
        System.out.println(lower(Arrays.asList(new String[]{"KitteN", "ChocolaTE"})));
    }

    public static List<String> lower(List<String> strings) {
        strings.replaceAll(s->s.toLowerCase());
        return strings;
    }
}
