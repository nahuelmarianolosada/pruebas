package or35;

/**
 * Created by nlosada on 13/09/18.
 *
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
 * or35(3) → true
 * or35(10) → true
 * or35(8) → false
 *
 * https://codingbat.com/prob/p112564
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println(Main.or35(3));
        System.out.println(Main.or35(10));
        System.out.println(Main.or35(8));
    }

    protected static boolean or35(int n) {
        return n > 0 && (n % 3 == 0 || n % 5 == 0) ? true : false;
    }
}
