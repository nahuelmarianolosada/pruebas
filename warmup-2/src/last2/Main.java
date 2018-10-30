package last2;

/**
 * Created by nlosada on 01/10/18.
 *
 * Given a string, return the count of the number of times that a substring length 2 appears in the string
 * and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
 * last2("hixxhi") → 1
 * last2("xaxxaxaxx") → 1
 * last2("axxxaaxx") → 2
 *
 * https://codingbat.com/prob/p178318
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.last2("hixxhi"));
        System.out.println(Main.last2("xaxxaxaxx"));
        System.out.println(Main.last2("axxxaaxx"));
        System.out.println(Main.last2("11212"));
    }

    public static int last2(String str) {
        int count = 0;
        String finalExpression;
        if(str.length() > 2) {
            finalExpression = str.substring(str.length() - 2);
        }else{
            return 0;
        }
        for (int i=0 ; i<str.length()-1 ; i++){
            String comparatorValue = str.substring(i,i+2);
            count+= i<str.length()-2 && finalExpression.equals(comparatorValue) ? 1 : 0;
        }
        return count;
    }
}
