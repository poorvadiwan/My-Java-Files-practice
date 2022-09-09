package recursion;

public class sum_of_digits {
    public static void main(String[] args){
        int num = 111111111;
        System.out.println(sod(num));
    }

    public static int sod(int num){
        if(num == 0)
            return 0;
        int remainder = num%10;
        return remainder+sod(num/10);
    }
}
