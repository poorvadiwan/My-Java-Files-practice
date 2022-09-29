import java.util.Arrays;

public class class_practice {

    public static void main( String[] args){
        int arr[] = {5,4,3,2,1};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));

        int array[] = {6,5,4,3,2,1};
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 5; j++){
                if(array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        int array1[] = {7,6,5,4,3,2,1};
        insertion_sort(array1);
        System.out.println(Arrays.toString(array1));
    }

    public static int[] selection_sort(int[] arr){

        //int j = 0;
        for (int i= 0; i < arr.length ; i++) {
            int min = i;
            for ( int j = i; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void insertion_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return;
    }
}
