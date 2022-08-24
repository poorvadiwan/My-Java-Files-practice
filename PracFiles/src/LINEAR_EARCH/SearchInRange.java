package LINEAR_EARCH;

public class SearchInRange {
    // in this one we will search in range for both integer ad string

    public static void main(String[] args) {
      int[] arr = {45,44,5,6,7,77,423,64,71,546,676};
      int target = 5, start = 0, end = 5;
        System.out.println(search_in_int(arr, target, start, end));


        String name = "Poorva";
        int s = 1 ,en = 5;
        char tar = 'u';
        System.out.println(Search_in_String(name, tar, s, en));
    }


    //Search in inclusive range
    static int search_in_int(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if(arr[i] == target)
                return i;
        }

        return -1;
    }


    public static boolean Search_in_String(String str, char target, int start , int end){
        if(str.length()==0)
            return false;

        for (int i = start; i < end; i++) {
            if(str.charAt(i) == target)
                return true;
        }

        return false;
    }
}
