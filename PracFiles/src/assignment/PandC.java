package assignment;
import java.util.Scanner;

public class PandC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PERMUTATION AND COMBINATION");
        System.out.println("Enter number of items in the set:");
        int num = in.nextInt();
        System.out.println("Enter number of items to be selected from set");
        int r = in.nextInt();

        if(r>num) {
           System.exit(0);
        }

        int p=0, c=0, rfac, nfac, nmrfac;
        rfac = factorial(r);
        nfac = factorial(num);
        nmrfac = factorial(num-r);

        c = nfac/(rfac*nmrfac);
        System.out.println("combination is:" + c);
        p = nfac/nmrfac;
        System.out.println("permutation is:" + p);


    //Shashwat wala code


//        float ans;
//
//        while (true)
//        {
//            System.out.print("\n1.nPr   2.nCr   3.X or exit: ");
//            char input = in.next().trim().charAt(0);
//
//            if (input == '1' || input == '2') {
//                System.out.print("Enter n & r: ");
//                int n = in.nextInt();
//                int r = in.nextInt();
//                int n1 = n, r1 = r;
//
//                if (n >= r) {
//                    if (input == '1') {
//                        int n_fact = 1, n_rFact = 1, a = n - r;
//                        while (n != 0) {
//                            n_fact *= n;
//                            n--;
//                        }
//                        while (a != 0) {
//                            n_rFact *= a;
//                            a--;
//                        }
//                        ans = (float) (n_fact) / n_rFact;
//                        System.out.print(n1 + "P" + r1 + " = " + ans);
//                        System.out.println();
//                    } else if (input == '2') {
//                        int n_fact = 1, n_rFact = 1, a = n - r, r_fact = 1;
//                        while (n != 0) {
//                            n_fact *= n;
//                            n--;
//                        }
//                        while (a != 0) {
//                            n_rFact *= a;
//                            a--;
//                        }
//                        while (r != 0) {
//                            r_fact *= r;
//                            r--;
//                        }
//                        ans = (float) (n_fact) / (n_rFact * r_fact);
//                        System.out.print(n1 + "C" + r1 + " = " + ans);
//                        System.out.println();
//                    }
//                }
//                else
//                    System.out.println("r can't be greater than n, try again!!!");
//            }
//            else if (input == 'x' || input == 'X')
//                break;
//
//            else{
//                System.out.print("\nInvalid Input, Try Again!!!");
//                System.out.println();
//            }

//        }

    }

    static int factorial(int number) {
        int fact = 1;
        for (int i = number; i > 0; i--) {
            fact = i * fact;
        }
        return fact;
    }
}

