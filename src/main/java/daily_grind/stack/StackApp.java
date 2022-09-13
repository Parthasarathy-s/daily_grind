package daily_grind.stack;

public class StackApp {

    public static void main(String[] args) {
        System.out.println("Initializing stack...");
        CustomStack<Integer> customStack = new CustomStack<>(1);
        customStack.pushElem(2);
        customStack.pushElem(3);

        System.out.println("Printing stack ....");
        customStack.print();

        System.out.println("Popping last value");
        System.out.println("Peeking : " + customStack.peek());
        customStack.pop();

        customStack.print();
    }
}
