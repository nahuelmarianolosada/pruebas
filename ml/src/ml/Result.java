package ml;

/**
 * Created by nlosada on 16/09/18.
 */
public class Result {
    public static void main(String[] args){
        System.out.println(Result.isPowerOfTwo(1) ? "es potencia" : "no es potencia");
    }

    public static boolean isPowerOf2(int n){
        try{
            if(n % 2 == 0 && n != 0) {
                return true;
            } else if(n<1){
                return false;
            } else {
                isPowerOf2(n % 2);
            }
            return false;
        }catch (StackOverflowError ex){
            return false;
        }
    }

    public static boolean isPowerOfTwo(int n){
        if(n != 0){
            for(int i = 0; i <= n; i++){
                if(Math.pow(2, i) == n){
                    return true;
                } else if(Math.pow(2, i)>n) {
                    return false;
                }
            }
        }
        return false;
    }
}
