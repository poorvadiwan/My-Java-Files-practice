package recursion.pattern;

public class pattern_1 {
        public static void main(String[] args){
            print_pattern(4,0);
            System.out.println();
            print2(1,1,4);

        }

        public static void print_pattern(int r, int c){
            if(r == 0){
                return;
            }
            /*
                     * * * *
                     * * *
                     * *
                     *
             */

            if(r>c){
                System.out.print("* ");
                print_pattern(r,c+1);
            }else{
                System.out.println();
                print_pattern(r-1,0);
            }
        }

        public static void print2(int r, int c, int n){
            if(r > n){
                return;
            }
            /*
             *
             * *
             * * *
             * * * *
             */

            if(r<=c){
                System.out.print("* ");
                print2(r+1,c,n);
            }else{
                System.out.println();
                print2(1,c+1,n);
            }
        }


}
