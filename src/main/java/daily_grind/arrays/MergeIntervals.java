package daily_grind.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = { {8,10}, {2,6}, {15,18}, {1,3} };
        int[][] resultArr = new MergeIntervals().merge(intervals);
        for(int[] result : resultArr) {
            System.out.print(Arrays.toString(result) +",");
        }

    }

    private int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        LinkedList<int[]> list = new LinkedList<>();
        for(int[] interval: intervals) {
            if(list.isEmpty() ||  list.getLast()[1] < interval[0]) {
                list.add(interval);
            } else {
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
