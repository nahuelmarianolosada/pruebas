package front3;

/**
 * Created by nlosada on 12/09/18.
 *
 * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
 * the front is whatever is there. Return a new string which is 3 copies of the front.
 * front3("Java") → "JavJavJav"
 * front3("Chocolate") → "ChoChoCho"
 * front3("abc") → "abcabcabc"
 *
 * https://codingbat.com/prob/p136351
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
        System.out.println(front3("uy"));
    }

    protected static String front3(String str) {
        return str.length() < 3 ? str.substring(0,str.length()) + str.substring(0,str.length()) + str.substring(0,str.length()) :
                str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }
}
