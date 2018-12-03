package stringX;

/**
 * Given a string, return a version where all the "x" have been removed.
 * Except an "x" at the very start or end should not be removed.
 * <p>
 * stringX("xxHxix") → "xHix"
 * stringX("abxxxcd") → "abcd"
 * stringX("xabxxxcdx") → "xabcdx"
 * <p>
 * Created by nlosada on 03/12/18.
 * <p>
 * https://codingbat.com/prob/p171260
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Main.stringX("xxHxix"));
        System.out.println(Main.stringX("abxxxcd"));
        System.out.println(Main.stringX("xabxxxcdx"));
    }

    public static String stringX(String str) {
        String strReturn = "";
        for (int i = 0; i <= str.length()-1; i++) {
           if(!str.substring(i, i+1).equalsIgnoreCase("x") || (i==0 || i==str.length()-1)){
               strReturn += str.substring(i, i+1);
           }
        }
        return strReturn;
    }

}
