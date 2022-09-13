package daily_grind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoApp {

    public static void main(String[] args) {

        char[][] graph = new char[4][5];

        graph = new char[][]{{'1', '1', '0', '0', '1'}, {'1', '1', '0', '0', '5'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};

        System.out.println(graph.length);
        System.out.println(graph[0].length);

        System.out.println(graph[0][4]);


    }
}
