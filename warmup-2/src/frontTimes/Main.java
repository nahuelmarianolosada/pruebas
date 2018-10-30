package frontTimes;

/**
 * Created by nlosada on 13/09/18.
 *
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
 * or whatever is there if the string is less than length 3. Return n copies of the front;
 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 *
 * https://codingbat.com/prob/p101475
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println(frontTimes("Chocolate",2));
        System.out.println(frontTimes("Chocolate",3));
        System.out.println(frontTimes("Abc",3));
    }

    protected static String frontTimes(String str, int n) {
        String acumulatedStr = "";
        for (int i = 0; i<n; i++) acumulatedStr += String.format("%.3s",str);
        return acumulatedStr;
    }

}
