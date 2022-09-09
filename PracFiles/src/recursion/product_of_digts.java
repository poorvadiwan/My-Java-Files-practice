package recursion;

public class product_of_digts {
    public static void main(String[] args){
        int num = 3532;
        System.out.println(product(num));
    }

    public static int product(int num){
        if(num == 0) //this will not be n == 1,otherwise stack overflow ho jayega
            return 1;

        int remainder = num%10;
        return remainder*(product(num/10));
    }
}
