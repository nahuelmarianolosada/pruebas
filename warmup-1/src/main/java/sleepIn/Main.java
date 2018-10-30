package sleepIn;

/**
 * Created by nlosada on 10/09/18.
 *
 *
 * The parameter weekday is true if it is a weekday,
 * and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 * sleepIn(false, false) → true
 * sleepIn(true, false) → false
 * sleepIn(false, true) → true
 *
 * https://codingbat.com/prob/p187868
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }

    protected static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }


}
