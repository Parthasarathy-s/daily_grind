package daily_grind;

public class SecondLargest {

    public static void main(String[] args) {
        int arr[] = {10, 9, 10, 1};

        System.out.println("Second max value index is - " + new SecondLargest().findSecondLarges(arr) );
    }

    private int findSecondLarges(int[] arr) {

        int maxVal = -1, secondMax = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }

            if(arr[i] < maxVal &&  arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}
