package Arrays_KK;

import java.util.Arrays;
import java.util.Scanner;


public class multidimentional_arrays {
    public static void main(String[] args) {

    /*
      If we want to make the following array:-
      1 2 3
      4 5 6
      7 8 9
     */

     /*   int[][] arr2D = new int[3][]; // we dont need to specify the number of columns coz of obvious reasons
        // is wale me we will take input from user

        int[][] arr2 = {
                {1, 2, 3}, // element in 0th index
                {4, 5, 6}, // elelment in 1st index
                {6, 7, 8}  // element in 2nd index
        }; // here we have defuned and decalred the arary

        int[][] arr3 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
                //aise bhi ho skta hai
                // we can have n number of columns in a single row and this is the reaspj why mentioning number os columns
                // is not necessary
        };

      */

//INPUT
        Scanner in = new Scanner(System.in);
        //To print the length of a given array
//        int[][] inputarr = new int[3][3];
//        int len = inputarr.length;
//        System.out.println(len + " ");//returns only row and not columns

        //2D array ke liye for se aaise input lenge
        //the first for interates over every row and the second iterates over every column
//        int[][] array = new int[3][4];
//        for (int row = 0; row < array.length; row++) {  //ye less than array.length
//            for (int col = 0; col < array[row].length; col++) {  //ye array ke row ke length se chota hona chahiye
//                array[row][col] = in.nextInt();
//                System.out.print(array[row][col] + " ");
//
//            }
//            System.out.println();
//        }
//        for (int row = 0; row < array.length; row++) {
//            System.out.println(Arrays.toString(array[row]));}

            //METHOD 2 - involving the use of arrays class
//all this is only possible if and only if the length of both row and column in given
            int[][] array = new int[3][4];
            for (int row = 0; row < array.length; row++) {  //ye less than array.length
                for (int col = 0; col < array[row].length; col++) {  //ye array ke row ke length se chota hona chahiye
                    array[row][col] = in.nextInt();
                   // System.out.print(array[row][col] + " ");
    //agr yha prr apn sout arrays wala function likhte hai then its going to print it as many timies as the loop runs
                }
                System.out.println();
        //we have added a new line here coz after printing every single row we are iterating the whole thimg and so we need
                // to see it in a new line. Tbhi toh vo matrix form me aayrga
            }

//            for (int row = 0; row < array.length; row++) {
//                System.out.println(Arrays.toString(array[row]));
//                //array[row] is in itself a array.
//                //its like array[3] mtlb ki iss 2D array ke third row me jo aray hai vo
//            }


 //ENHANCED FOR LOOP
        //SYNTAX: for ( datatype variable_name : array_name){  }
        //here datatype is itself array so we ahve written int[] prr agr string vagera haithen we will write that with []
         for (int[] a : array){
             System.out.println(Arrays.toString(a));
             //the variable a represents each row(which contains an array in itself) and prints the elements inside it
         }
        }
    }

    // ***IMPORTANT DISTINCTIONS***
// yha pr normal for loop me apn array[row] likh rhe ahi and enhanced for me (a) likh rhe hai kyunki enhanved me apn
// pehle ses bta dete hai ki array hai upr decalre krte time so we sont have to do it again
//But normal me apn pehle se ngi batate hai toh apn ko specify krna pdta hai


//ENHANCED FOR LOOP FOR STRINGS
// String[] arr = new String[4][2];
// then input lenge
// for output we do:-
   // for (String element : arr ){
//       System.out.println(element);

//so this prints the element of the array arr of type String



