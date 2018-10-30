package stringTimes;

/**
 * Created by nlosada on 13/09/18.
 *
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 *
 * https://codingbat.com/prob/p142270
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println(stringTimes("Hi",2));
        System.out.println(stringTimes("Hi",3));
        System.out.println(stringTimes("Hi",1));
    }

    protected static String stringTimes(String str, int n) {
        String acumulatedStr = "";
        for (int i = 0; i<n; i++) acumulatedStr += str;
        return acumulatedStr;
    }

}
