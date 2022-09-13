package daily_grind.stack;

import org.w3c.dom.Node;

import java.util.NoSuchElementException;

public class CustomStack<T> {

    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    Node top;

    public CustomStack(T data) {
        top = new Node(data);
    }

    public void pushElem(T data) {
        Node temp = top;
        top = new Node(data);
        top.next = temp;
    }

    public T pop() {
        if(top == null) {
            throw new NoSuchElementException();
        }
        Node data = top;
        top = top.next;
        return data.data;
    }

    public T peek() {
        return top.data;
    }

    public void print() {
        Node curr = top;
        StringBuilder sb = new StringBuilder();
        while(curr != null) {
            sb.append(curr.data + "->");
            curr = curr.next;
        }
        System.out.println(sb.toString());
    }
}
