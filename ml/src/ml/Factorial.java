package ml;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by nlosada on 16/09/18.
 *
 * n! = 1 x 2 x 3 x 4 x 5 x ... x (n-1) x n
 */
public class Factorial {
    public static void main(String[] args){
        for (int i = 0; i <= 100 ; i++)
        System.out.println(i + "! = " + formatNumber(calcularFactorial(BigInteger.valueOf(i))));
    }

    private static BigInteger calcularFactorial(BigInteger n){
        return n.equals(BigInteger.ZERO) ? BigInteger.ONE : n.multiply(calcularFactorial(n.subtract(BigInteger.ONE)));
    }


    private static String formatNumber(BigInteger n){
        return String.format("%,d", n);
    }
}
