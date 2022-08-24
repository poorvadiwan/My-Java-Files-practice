package Arrays_KK;
import java.util.ArrayList;
import java.util.Scanner;

public class multiarraylist {
    public static void main (String[] args){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //so basically this also works exactly like the milti array - ie. it also has aray ke andr array
        //ie ek bad array jiske hrr row me arrays honge
        //now we need to ddeclare the arraylist

        for (int i = 0; i < n; i++) {
            list.add( new ArrayList<>());
            //so this first decalres an new object and then creates one
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.get(i).add(in.nextInt());
            }System.out.println();
        }

        System.out.println(list);
    }
}
