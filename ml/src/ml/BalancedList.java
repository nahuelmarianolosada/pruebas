package ml;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nlosada on 15/09/18.
 */
public class BalancedList {

    public static void main(String[] args) throws IOException {
            /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("/home/nlosada/prueba.txt")));

            int salesCount = Integer.parseInt(bufferedReader.readLine().trim());*/

           /* List<Integer> sales = new ArrayList<>(Arrays.asList(1,2,3,4,6));*/
            List<Integer> sales = new ArrayList<>(Arrays.asList(4,2,3,4,13));

            /*for (int i = 0; i < 6; i++) {
                int salesItem = Integer.parseInt(bufferedReader.readLine().trim());
                sales.add(salesItem);
            }*/
           /* sales.add(4);
            sales.add(1);
            sales.add(2);
            sales.add(3);
            sales.add(3);*/

            int result = BalancedList.balancedSum(sales);
            System.out.println(result);
            /*bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();*/
    }


    public static int balancedSum(List<Integer> sales){
        int sumatoriaD = 0;
        int sumatoriaI = 0;
        for (int i = 0 ; i <= sales.size() - 1 ; i ++){
            for (int j = 0 ; j <= sales.size() - 1; j++){
                if(i > j) {
                    sumatoriaI += sales.get(j);
                } else if(i!=j){
                    sumatoriaD += sales.get(j);
                }
            }
            if(sumatoriaD == sumatoriaI){
                return i;
            }else{
                sumatoriaD = 0;
                sumatoriaI = 0;
            }
        }
        return 0;
    }
}
