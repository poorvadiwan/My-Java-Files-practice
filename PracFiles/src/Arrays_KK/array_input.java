package Arrays_KK;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5]; // decalration of array
//        nums[0] = 34;         // this is initialization
//        nums[1] = 4;          //apn input stream dalne ki jgh aaise bhi krr skte hai, aise me user nhi de r pehle se
//        nums[2] = 44;         //program krr de re apn pehle se
//        nums[3] = 45;
//        nums[4] = 354;
//        // internally its stored as [34,4,44,45,354]
//        System.out.println(nums[4]);   // prints the element on forth index

        //but this thing in here is very repetitive and what if we intend to make a very long array?
        //solution: using for loop




        //METHOD 1
        //nums.length is a function that gives us the length of the array
//        for (int i = 0;  i < nums.length; i++){
//            nums[i] = in.nextInt();
//            System.out.print(nums[i]+" ");
//        }


        //METHOD 2
      //  This is called for each
        //for each me background me vhi chl r hota hai jo apn normally likhte hai vo loop me +1 HOTE REHTA HAI
//        for (int num : nums){
//
//         System.out.print(num +" ");
// here num represents the element of the array; kind of like a counter variable
//  mtlb ki agr num = 1 hai yani ki array nums ka first element and so on and so forth
//        }

        //METHOD 3
       // System.out.println(Arrays.toString(nums));
        // this is a standard array function from class array
        // this gives output in this format {4,33,2,3,4,34}



//ARRAYS OF OBJECTS( reference datatypes)
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));
//
//        // if we want to modify beech me then we can do this
//        str[2] = "Poorva";
//        System.out.println(Arrays.toString(str));
//        //so basically aasia krne se apn bta de re hai ki we need to change it forever
//

// ARRAYS FOR CHAR
       char[] ch = new char[4];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = in.next().charAt(2);
            //charAt(2) returns the digit at the second index
            // we cant take full char value aisa krna is not possible
            System.out.println(ch[i] + " ");
        }
    }
}
