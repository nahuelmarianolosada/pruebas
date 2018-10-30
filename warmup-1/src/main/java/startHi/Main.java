package startHi;

/**
 * Created by nlosada on 13/09/18.
 *
 * Given a string, return true if the string starts with "hi" and false otherwise.
 *
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false
 *
 * https://codingbat.com/prob/p191022
 *
 */
public class Main {

    public static void main(String[] args){
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }

    protected static boolean startHi(String str) {
        return str.length() >= 2 ? str.substring(0,2).equals("hi") : false;
    }
}
