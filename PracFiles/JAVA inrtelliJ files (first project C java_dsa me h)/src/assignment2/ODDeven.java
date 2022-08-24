package assignment2;

import java.util.Scanner;
public class ODDeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%2==0){
            System.out.println("The number is even");
        }else
        {
            System.out.println("The number is odd");
        }
    }
}
