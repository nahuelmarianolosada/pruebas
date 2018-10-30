package countXX;

/**
 * Created by nlosada on 18/09/18.
 *
 *
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 *
 * https://codingbat.com/prob/p194667
 *
 */
public class Main {
    public static void main(String[] args){
        System.out.println(Main.countXX("abcxx"));
        System.out.println(Main.countXX("xxx"));
        System.out.println(Main.countXX("xxxx"));
    }

    protected static int countXX(String str) {
        int count = 0;
        for (int i = 0; i<str.length()-1;i++) {
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x') count++;
        }
        return count;
    }

}
