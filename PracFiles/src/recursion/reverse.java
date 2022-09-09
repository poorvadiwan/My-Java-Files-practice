package recursion;

public class reverse {
    // There are multiple ways in which we can make this problem.

    // Method 1:-
    // we wront this function reverse1 before main following convention.
    static int rev = 0;
    public static void reverse1(int n){
        if(n == 0)
            return;

        rev = rev*10 + n%10;
        reverse1(n/10);
    }

    //Method 2
    public static int reverse2(int n) {
        //sometimes when we need some additonal arguments in that case we need to declare explicit functions.
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    public static int helper(int n , int digits){
        // this is to check whether the number is a one digit number or what
        if(n % 10 == n){
            return n;
        }
        int remainder = n%10;
        return remainder*((int)(Math.pow(10,digits-1))) + helper(n/10, digits -1);
    }


    public static void main(String[] args){
        int n = 45637;
        reverse1(n);
        System.out.println(rev);

        System.out.println(reverse2(n));
    }


}
