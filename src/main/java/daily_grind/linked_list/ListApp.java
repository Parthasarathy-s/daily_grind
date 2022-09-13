package daily_grind.linked_list;


/**
 * 1. It is linear data structure like array, but the data is not stored at contiguous memory location
 *
 * 2. This one contains Reversing linked list
 *
 */
public class ListApp {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    public static void main(String[] args) {

        ListApp linkedList = new ListApp();

        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);
        linkedList.head.next.next.next = new Node(4);
        linkedList.head.next.next.next.next = new Node(5);
        
        linkedList.printList();
        linkedList.reverse();
        linkedList.printList();
    }

    private void reverse() {

        Node curr = head;
        Node prev = null;
        Node temp = null;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    private void printList() {
        Node curr = head;
        StringBuilder sb = new StringBuilder();
        while(curr != null) {
            sb.append(curr.data + " => ");
            curr = curr.next;
        }
        sb.append("NULL");
        System.out.println("Output :- " + sb);
    }
}
