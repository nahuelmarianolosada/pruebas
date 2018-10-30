package modulo1;

/**
 * Created by nlosada on 05/10/18.
 */
public class Main {
    public static void main(String[] args) {
        /*System.out.println(Main.valueOfA());*/
        Main.outputStandar();
    }


    /***
     * Cual es el valor de la variable a?
     * @return 9
     */
    public static int valueOfA(){
        int a=0,b=0,i=10;
        for(;i>b;){
            a=b++;
        }
        return a;
    }


    /***
     * Cual es la salida de este codigo
     *
     * El número es 1 El número es 2 El número es 3
     * El número es 1 El número es 2 El número es 3 El número es 4
     * El número es 1 El número es 2
     * El número es 2 El número es 3
     *  * El número es 6
     *
     */
    public static void outputStandar(){
        int i=0;
        while(i++<10){
            if (++i%3!=0) continue;
            System.out.print (" El numero es "+i);
        }
    }
}
