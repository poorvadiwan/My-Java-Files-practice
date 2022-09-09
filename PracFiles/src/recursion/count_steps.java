package recursion;

// Problem Statement : Count the number of steps needed to render the number zero
// if number is even divide by two and if off then subtract 1

public class count_steps {

    public static void main(String[] args) {
        System.out.println(count_steps(14));
    }
    public static int count_steps(int n){
         int count = 0;
         return helper(n,count);
    }

    public static int helper( int n, int count){
        if( n == 0){
            return count;
        }
        if( n%2 == 0){
            return helper( n/2,count+1);
        }else{
            return helper( n-1, count+1);
        }
    }
}
