package noX;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nlosada on 06/12/18.
 *
 * Given a list of strings, return a list where each string has all its "x" removed.
 *
 * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
 * noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
 * noX(["x"]) → [""]
 *
 * https://codingbat.com/prob/p105967
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(noX(Arrays.asList(new String[]{"ax", "bb", "cx"})));
        System.out.println(noX(Arrays.asList(new String[]{"xxax", "xbxbx", "xxcx"})));
        System.out.println(noX(Arrays.asList(new String[]{"x"})));
    }

    public static List<String> noX(List<String> strings) {
        strings.replaceAll(s->s.replace("x","").replace("X",""));
        return strings;
    }
}
