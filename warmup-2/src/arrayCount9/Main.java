package arrayCount9;

/**
 * Created by nlosada on 30/10/18.
 * Given an array of ints, return the number of 9's in the array.
 *
 * arrayCount9([1, 2, 9]) → 1
 * arrayCount9([1, 9, 9]) → 2
 * arrayCount9([1, 9, 9, 3, 9]) → 3
 *
 * https://codingbat.com/prob/p184031
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 9};
        System.out.println(Main.arrayCount9(array));
    }

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i: nums) {
            if(i == 9){
                count++;
            }
        }
        return count;
    }
}
