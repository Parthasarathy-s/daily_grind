package daily_grind;

public class FindElementInRotatedSortedArray {

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8 , 9, 10, 1, 2, 3};
        int arr2[] = {3, 5, 1, 2};
        int l = 0, h = arr.length;
        int searchVal = 10;
        int index = new FindElementInRotatedSortedArray().findElement(arr, l, h - 1, searchVal);
        int index2 = new FindElementInRotatedSortedArray().findElement(arr2, l, arr2.length - 1, searchVal);
        System.out.println("Value is present at index - " + index);
        System.out.println("Value 2nd array is present at index - " + index2);
    }

    private int findElement(int[] arr, int l, int h, int searchVal) {

        int mid = (l + h) / 2;

        if(l > h) {
            return -1;
        }

        if(arr[mid] == searchVal) {
            return mid;
        }

        if(arr[l] < arr[mid]) {

            if(searchVal >= arr[l] && searchVal < arr[mid]) {
                return findElement(arr, l, mid - 1, searchVal);
            }
            return findElement(arr, mid + 1, h, searchVal);
        } else {
            if(searchVal <= arr[h] && searchVal > arr[mid]) {
                return findElement(arr,  mid + 1, h, searchVal);
            }
            return findElement(arr, l, mid - 1, searchVal);
        }
    }
}
