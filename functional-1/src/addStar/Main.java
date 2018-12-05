package addStar;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nlosada on 05/12/18.
 *
 * Given a list of strings, return a list where each string has "*" added at its end.
 *
 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
 * addStar(["hello", "there"]) → ["hello*", "there*"]
 * addStar(["*"]) → ["**"]
 *
 * https://codingbat.com/prob/p170181
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(addStar(Arrays.asList(new String[]{"a","bb","ccc"})));
        System.out.println(addStar(Arrays.asList(new String[]{"hello","there"})));
        System.out.println(addStar(Arrays.asList(new String[]{"*"})));
    }

    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(s->s+="*");
        return strings;
    }
}
