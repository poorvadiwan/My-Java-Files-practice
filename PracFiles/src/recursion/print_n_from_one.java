package recursion;

public class print_n_from_one {
    public static void main(String[] args){
        int n = 5;
        print(5);
    }

    // this is for 5 to 1
    /*
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
     */

    //this is for 1 to 5
    public static void print(int n ){
        if(n == 0)
            return;

        print(n-1);
        System.out.println(n);
    }
}
