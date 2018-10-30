package doublexX;

/**
 * Created by nlosada on 18/09/18.
 *
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 *
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 *
 * https://codingbat.com/prob/p186759
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.doubleX("axxbb"));
        System.out.println(Main.doubleX("axaxax"));
        System.out.println(Main.doubleX("xxxxx"));
    }

    protected static boolean doubleX(String str) {
        return str.indexOf('x') != str.length() - 1 ? str.charAt(str.indexOf('x') + 1) == 'x': false;
    }

}
