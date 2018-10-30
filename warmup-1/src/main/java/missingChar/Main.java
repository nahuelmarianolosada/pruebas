package missingChar;

/**
 * Created by nlosada on 12/09/18.
 *
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 * The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 *
 * missingChar("kitten", 1) → "ktten"
 * missingChar("kitten", 0) → "itten"
 * missingChar("kitten", 4) → "kittn"
 *
 * https://codingbat.com/prob/p190570
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }

    protected static String missingChar(String str, int n) {
        return (str != null && str.length() - 1 < n) || n >= 0 ? str.replaceFirst(str.substring(n, n + 1), "") : "Invalid Arguments";
    }
}
