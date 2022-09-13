package daily_grind.arrays;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequenceList = List.of(1, 6, -1, 11);

        boolean result = new ValidateSubsequence().isValidSubSeq(array, sequenceList);

        System.out.println("Is ValidSequence -- " + result);
    }

    private boolean isValidSubSeq(List<Integer> array, List<Integer> sequenceList) {
        int index = 0;
        for(Integer val : array) {
            if (sequenceList.get(index).equals(val)){
                index++;
            }
        }
        return index == sequenceList.size();
    }
}
