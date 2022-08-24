package Arrays_KK;

import java.util.Arrays;

public class multidimentional_withoutcol {
    public static void main(String[] args) {
       // String[][] arr = new String[3][]
      int[][] arr = {
                {3,2,3,5},
                {3,5},
                {5,43,2,32,3}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
               // System.out.print(arr[row][col] + " ");

            }
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
