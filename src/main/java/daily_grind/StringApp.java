package daily_grind;

public class StringApp {

    void printString() {
        System.out.println("Hello World");

        System.out.println("Hello\\o World");

        System.out.println('B' - 'a' + 'A');
        isAlphaNumer('1');
    }

    private void isAlphaNumer(char ch) {
        System.out.println(ch >= '0' && ch <= '9' || ch >= 'a' && ch <='z' || ch >='A' && ch <='Z');
    }

    public static void main(String[] args) {
        new StringApp().printString();
    }
}
