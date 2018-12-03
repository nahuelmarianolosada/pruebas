package altPairs;

/**
 * Created by nlosada on 03/12/18.
 *
 *
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 *
 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 *
 * https://codingbat.com/prob/p121596
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str) {
        String strReturn = "";
        for (int i = 0; i<str.length(); i+=4) {
            strReturn += str.substring(i,i+2 > str.length() ? i+1:i+2);
        }
        return strReturn;
    }
}
