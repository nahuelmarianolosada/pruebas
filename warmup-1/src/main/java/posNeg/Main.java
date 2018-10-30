package posNeg;

/**
 * Created by nlosada on 11/09/18.
 *
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.
 *
 * posNeg(1, -1, false) → true
 * posNeg(-1, 1, false) → true
 * posNeg(-4, -5, true) → true
 *
 * https://codingbat.com/prob/p159227
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
    }

    protected static boolean posNeg(int a, int b, boolean negative) {
        return negative ? (a < 0) && (b < 0) : (a < 0 && b > 0) || (a > 0 && b < 0);
    }

}
