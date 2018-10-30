package stringSplosion;

/**
 * Created by nlosada on 24/09/18.
 *
 *  Given a non-empty string like "Code" return a string like "CCoCodCode".
 *  stringSplosion("Code") → "CCoCodCode"
 *  stringSplosion("abc") → "aababc"
 *  stringSplosion("ab") → "aab"
 *
 * https://codingbat.com/prob/p117334
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Main.stringSplosion("Code"));
        System.out.println(Main.stringSplosion("abc"));
        System.out.println(Main.stringSplosion("ab"));
    }


    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i <= str.length(); i++){
            result += str.substring(0,i);
        }
        return result;
    }
}
