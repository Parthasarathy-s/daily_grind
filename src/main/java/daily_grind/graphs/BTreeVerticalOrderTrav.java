package daily_grind.graphs;

import java.util.*;

public class BTreeVerticalOrderTrav {

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        int arr[] = new int[2];
        List<List<Integer>> result = new ArrayList<>();
        Map<TreeNode, Integer> weightedMap = new HashMap<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        weightedMap.put(root, 0);
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int min = 0;

        while(!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            int weight = weightedMap.get(treeNode);

            if(!graph.containsKey(weight)) {
                graph.put(weight, new ArrayList<>());
            }
            graph.get(weight).add(treeNode.val);

            if(treeNode.left != null) {
                queue.offer(treeNode.left);
                weightedMap.put(treeNode.left, weight - 1);
            }
            if(treeNode.right != null) {
                queue.offer(treeNode.right);
                weightedMap.put(treeNode.right, weight + 1);
            }

            min = Math.min(min, weight);
        }

        while(graph.containsKey(min)) {
            result.add(graph.get(min++));
        }
        return result;
    }

    public void main(String[] args) {
//        root = [3,9,8,4,0,1,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(0);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);

        System.out.println(verticalOrder(root));

    }
}
