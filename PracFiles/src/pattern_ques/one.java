package pattern_ques;

public class one {
    public static void main(String[] args) {

        /* question
                   *
                  * *
                 * * *
                * * * *
               * * * * *
         */


        for (int r = 0; r < 5; r++)
        { //this is for the row
            for (int i = (5 - r); i > 1 ; i--) {  //initial value of i here is 5 and so loop 4 times chlega and
                System.out.print(" ");
            }
            for (int j = 0; j <= r ; j++) { // this is for symbols
                System.out.print("* ");
            }
            System.out.println();
        }


        // yha prr first we count ki spaces kitte lgennege and then apn uske hisab se aage for banataea hai
        // biggest misconception jo meko asie patterns dekh krr ata hai is ki dono side kaise spaces lau
        // but dude dono side lane li jrurt hi nhi hai agr right side me koi symbol nhi hai then its of no use



        /*
        QUESTION:-
           *
           * *
           * * *
           * * * *
           * * * * *
         */

        for (int r = 0; r < 5; r++) {
            for (int s = 0; s <= r; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /*
        QUESTION

                 *
               * *
             * * *
           * * * *
         * * * * *

         */

        for (int r = 1; r <= 5; r++) {
            for (int i = 1; i <= 5-r; i++) {
                System.out.print(" ");
            }
            for (int s = 1; s<=r; s++) {
                System.out.print("*"); // this will be less than equals to r kyunki apn ko number
                // of rows print krwane h n
                // if it were less than equals to 5 then 5 continous stars print ho jayenge
            }
            System.out.println();
        }

        /*

                          *
                        * * *
                      * * * * *
                    * * * * * * *
                  * * * * * * * * *
                    * * * * * * *
                      * * * * *
                        * * *
                          *

         */

        for (int r = 1; r <=5 ; r++) {
            for (int sp = 5 - r; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int s = 1; s <= (2 * r - 1); s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row < 5; row++) {
            for (int sp = 1; sp <= row; sp++) {
                System.out.print(" ");
            }

            for (int s = 1; s <= (7 + (row - 1) * (-2)); s++) {
                System.out.print("*");
            }System.out.println();
        }


        System.out.println();

        /*

                 *
               * * *
             * * * * *
           * * * * * * *
         * * * * * * * * *

         */
        System.out.println();

        for (int r = 1; r <=5 ; r++) {
            for (int sp = 5-r ; sp >= 1 ; sp--) {
                System.out.print(" ");
            }
            for (int s = 1; s <= (2*r-1) ; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Mam wala tarika
//        int k = 0;
//        for (int r = 1; r <=5 ; r++) {
//            for (int sp = 1 ; sp <= 5-sp ; sp++) {
//                System.out.print(" ");
//            }
//            while(k!=(2*r-1)){
//                System.out.print("*");
//                k++;
//            }
//            System.out.println();
//        }


        System.out.println();

        /*

         * * * * *
         * * * *
         * * *
         * *
         *

         */

        for (int r = 5; r > 0; r--) {
            for (int s = 0; s <r ; s++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*

         * * * * *
          * * * *
           * * *
            * *
             *

         */

        for (int r = 0; r < 5; r++) {
            for (int sp = 0; sp <= r; sp++) {
                System.out.print( " ");
            }
            for (int i = 1; i <= 5-r ; i++) {
                System.out.print("* ");
            }

            System.out.println();

        }


        /*

               5
              4 5
             3 4 5
            2 3 4 5
           1 2 3 4 5

         */
        System.out.println();


        for (int r = 1; r <=5 ; r++) {
            for (int sp = 1; sp <= 5-r ; sp++) {
                System.out.print(" ");
            }
            int a =5 ;
            for (int num = 0; num < r; num++) {

                System.out.print(a+" ");
                a++;
            } //b++;
            System.out.println();
        }

        /*
        1
        1 0
        1 0 1
        1 0 1 0
        1 0 1 0 1
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                if ( (j%2) == 0 ){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }

            } System.out.println();

        }


        /*
        1 0 1 0 1 0 1
          1 0 1 0 1
            1 0 1
              1
         */

        System.out.println();

        for (int i = 4; i >= 1 ; i--) {
            for (int sp = 4; sp > i ; sp--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*i-1) ; j++) {
                if((j%2)==0)
                System.out.print("0 ");
                else{
                    System.out.print("1 ");
                }
            }

            System.out.println();
        }

//        int a = 20;
//        a = 20%0;
//        System.out.println(a);

    }

}
