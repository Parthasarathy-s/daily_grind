package daily_grind.tree;

public class InorderTree {

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private void traverseInorder(StringBuilder sb, Node node, String msg) {
        //logging the flow
        System.out.println(msg);
        if(node != null) {
            traverseInorder(sb, node.left, "LEFT ORDER " + node.value);
            System.out.println("VALUE " + node.value);
            sb.append(node.value).append("->");
            traverseInorder(sb, node.right, "RIGHT ORDER " + node.value);
        }
    }

    private void testInorder() {
        Node node = new Node(10);
        node.left = new Node(5);
        node.left.left = new Node(1);
        node.left.right = new Node(8);
        node.right = new Node( 15);

        StringBuilder sb = new StringBuilder();
        traverseInorder(sb, node, "ROOT");
        System.out.println("Tree -> " + sb.toString());
    }

    public static void main(String[] args) {
        new InorderTree().testInorder();
    }

}
