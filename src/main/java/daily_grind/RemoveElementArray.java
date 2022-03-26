package daily_grind;

import java.util.Arrays;

public class RemoveElementArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3};
        int val =3;
        System.out.println("Array lastIndex position -- " + new RemoveElementArray().removeElement(arr, val));
        System.out.println("Array -- " + Arrays.toString(arr));
    }

    /**
     * Two pointer solution
     * We can ignore values exceeding the final index value
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int lastIndex = nums.length - 1;
        while(index <= lastIndex) {
            if(nums[index] == val) {
                nums[index] = nums[lastIndex];
                lastIndex--;
            } else {
                index++;
            }
        }
        return lastIndex + 1;
        // int index = 0;
        //  for(int i = 0; i < nums.length; i++) {
        //      if(nums[i] != val) {
        //          nums[index++] = nums[i];
        //      }
        //  }
        //  return index;
    }
}
