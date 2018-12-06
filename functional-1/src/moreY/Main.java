package moreY;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nlosada on 06/12/18.
 *
 *
 * Given a list of strings, return a list where each string has "y" added at its start and end.
 *
 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
 * moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
 * moreY(["yay"]) → ["yyayy"]
 *
 * https://codingbat.com/prob/p177528
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(moreY(Arrays.asList(new String[]{"a", "b", "c"})));
        System.out.println(moreY(Arrays.asList(new String[]{"hello", "there"})));
        System.out.println(moreY(Arrays.asList(new String[]{"yay"})));
    }

    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(s->s="y"+s+"y");
        return strings;
    }
}
