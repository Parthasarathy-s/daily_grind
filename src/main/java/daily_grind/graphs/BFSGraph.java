package daily_grind.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFSGraph {

    public static void main(String[] args) {
        System.out.println("BFS Graph ---");
        int capacity = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(capacity);

        for(int i = 0; i <= capacity; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);

        BFS(adj, capacity);
    }

    private static void BFS(ArrayList<ArrayList<Integer>> adj, int capacity) {
        boolean visited[] = new boolean[capacity + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        int index = 1;
        visited[index] = true;
        queue.add(index);

        while(queue.size() != 0) {
            index = queue.poll();
            System.out.print(index + " ");

            for(int i = 0; i < adj.get(index).size(); i++) {
                int node = adj.get(index).get(i);

                if(!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                }
            }

        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }
}
