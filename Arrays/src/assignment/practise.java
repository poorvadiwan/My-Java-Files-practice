package assignment;
import java.awt.*;
import java.util.*;

public class practise {
    public static void main(String[] args) {
     //   Scanner in = new Scanner(System.in);
     int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] rot = new int[3][3];
      /*  for( int i = 0; i<mat.length; i++){
            for( int j = 0; j<mat.length; j++){
                rot[i][j] = mat[mat.length-1-j][i];
            }
        }

       */
        for ( int[] a : rot ){
            System.out.println(mat);
        }
    }
}
