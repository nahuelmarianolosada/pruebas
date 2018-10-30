package backAround;

/**
 * Created by nlosada on 12/09/18.
 *
 * Given a string, take the last char and return a new string with the last char added at the front and back,
 * so "cat" yields "tcatt". The original string will be length 1 or more.
 * backAround("cat") → "tcatt"
 * backAround("Hello") → "oHelloo"
 * backAround("a") → "aaa"
 *
 * https://codingbat.com/prob/p161642
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println(Main.backAround("cat"));
        System.out.println(Main.backAround("Hello"));
        System.out.println(Main.backAround("a"));
    }

    protected static String backAround(String str) {
        return str.length() < 1 ? "" : str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
}
