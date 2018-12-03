package stringMatch;

/**
 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
 * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
 * stringMatch("xxcaazz", "xxbaaz") → 3
 * stringMatch("abc", "abc") → 2
 * stringMatch("abc", "axc") → 0
 * <p>
 * https://codingbat.com/prob/p198640
 * <p>
 * Created by nlosada on 03/12/18.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Main.stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(Main.stringMatch("abc", "abc"));
        System.out.println(Main.stringMatch("abc", "axc"));
    }


    public static int stringMatch(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i <= len - 2; i++) {
            if (a.substring(i, i + 2 > a.length() ? a.length() - 1 : i + 2).equals(b.substring(i, i + 2 > b.length() ? b.length() - 1 : i + 2)))
                count++;
        }
        return count;
    }
}
