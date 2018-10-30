package diff21;

/**
 * Created by nlosada on 11/09/18.
 *
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
 *
 * diff21(19) → 2
 * diff21(10) → 11
 * diff21(21) → 0
 *
 * https://codingbat.com/prob/p116624
 */
public class Main {
    public static void main(String[] args){
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
    }

    protected static int diff21(int n) {
        return n > 21 ? (n - 21)*2 : 21 - n;
    }
}
