package assignment2;
import java.util.Scanner;

class myClass{
    public void function(int i){
        int s = 5, sum = s+i;
        System.out.println(s + " + " + i+" = " + sum);
    }
}


public class classes_packages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:");
        myClass obj = new myClass();
        obj.function(in.nextInt());
    }
}
