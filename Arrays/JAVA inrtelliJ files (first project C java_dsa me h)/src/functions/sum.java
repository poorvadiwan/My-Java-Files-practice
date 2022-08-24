package functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//       int ans = sum();
//        System.out.println("The sum is "  + ans);
//
//        first();
//    }
//    public static int sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the first number:");
//        int num1 = in.nextInt();
//        System.out.print("Enter the second number:");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return sum;

        int type = sum3(20,67);
        System.out.println(type);

    }

    private static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void first(){
        System.out.println("**Second Function**");
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = in2.nextInt();
        System.out.print("Enter the second number:");
        int b = in2.nextInt();
        int sum = a + b;
        System.out.println("The sum is "+sum);
    }
}
