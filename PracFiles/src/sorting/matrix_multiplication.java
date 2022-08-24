package sorting;

import java.util.Arrays;

public class matrix_multiplication {
    public static void main(String args[]){
        int[][] mat1 = {{1,2,3},{4,5,6}};
        int[][] mat2 = {{1,2},{2,3},{3,4}};
        int[][] res = new int[2][2];

        //multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    res[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }

        //Printing
      /*  for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

       */
        //for printing 2D array in format
        System.out.println(Arrays.deepToString(res));
    }
}
