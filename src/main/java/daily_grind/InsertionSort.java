package daily_grind;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 1, 10};
        new InsertionSort().insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private int[] insertionSort(int[] array) {
       for(int i = 1; i < array.length; i++) {

           int key = array[i];
           int j = i - 1;

           while( j >= 0 && array[j] > key) {
               array[j + 1] = array[j];
               j--;
           }

           array[j + 1] = key;

       }
        return array;
    }
}
