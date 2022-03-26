package daily_grind;

public class TwoDArray {

    public static void main(String[] args) {
        new TwoDArray().createArray();
    }

    private void createArray() {
        int arr[][] = new int[3][];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
