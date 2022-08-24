package pattern_ques;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class quad_roots {
    public static void main(String[] args) {
        int a, b, c;
        while(true) {
            double dis = 0;
            int r1=0,r2=0;
//                    , r1 = 0, r2 = 0;
            System.out.println("Rnter coefficient of equation");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();

            dis = sqrt(b * b - 4 * a * c);

            int d = (int)dis;
            if (d > 0) {
                r1 = (-b + d) / (2 * a);
                r2 = (-b - d) / (2 * a);
            } else if (d == 0) {
                r1 = -b / (2 * a);
                r2 = r1;
            } else {
                System.out.println("Roots are imaginary");
            }
//            r1 = double.intValue(r1);
//            r1=Math.round(r1);
//            r2=Math.round(r2);
            System.out.println("Roots are " + r1 + " and "+r2);
        }

    }
}
