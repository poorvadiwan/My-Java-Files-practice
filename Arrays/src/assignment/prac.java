package assignment;
import java.util.Scanner;
import java.util.Arrays;

public class prac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] mat = new int[3][3];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        int[][] rot = new int[3][3];
       for( int i = 0; i<mat.length; i++){
            for( int j = 0; j<mat.length; j++){
                rot[i][j] = mat[mat.length-1-j][i];
            }
        }
        System.out.println(Arrays.toString(mat));
    }

    }

