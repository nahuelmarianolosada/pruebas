package frontBack;

/**
 * Created by nlosada on 12/09/18.
 *
 * Given a string, return a new string where the first and last chars have been exchanged.
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 *
 * https://codingbat.com/prob/p123384
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    protected static String frontBack(String str) {
        if(str.isEmpty()){
            return "";
        }else {
            char[] charArray = str.toCharArray();
            char aux = charArray[0];
            charArray[0] = charArray[str.length() - 1];
            charArray[str.length() - 1] = aux;
            return String.valueOf(charArray);
        }
    }
}
