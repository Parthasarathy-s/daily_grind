package daily_grind.arrays;

import java.util.LinkedList;

public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(null);
        list.add(1);
        list.add(null);

        System.out.println(list);
    }
}
