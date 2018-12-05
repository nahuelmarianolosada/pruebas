package copies3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nlosada on 05/12/18.
 *
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
 *
 * copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
 * copies3(["24", "a", ""]) → ["242424", "aaa", ""]
 * copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 *
 * https://codingbat.com/prob/p181634
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(copies3(Arrays.asList(new String[]{"a","bb","ccc"})));
        System.out.println(copies3(Arrays.asList(new String[]{"24","a",""})));
        System.out.println(copies3(Arrays.asList(new String[]{"hello","there"})));
    }

    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(s->s.concat(s).concat(s));
        return strings;
    }
}
