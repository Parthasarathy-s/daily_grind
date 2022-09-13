package daily_grind.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketsBalanced {


    public static void main(String[] args) {
        String value = "(())";
//        System.out.println("Result --- " + new BracketsBalanced().isBalanced(value));

        System.out.println("Result --- " + new BracketsBalanced().isBalanced("aafwgaga()[]a{}{gggg"));
    }

    private boolean isBalanced(String str) {
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("}", "{");
        map.put("]", "[");
        String[] strArr = str.split("");
        Stack<String> stack = new Stack<>();
        String brackets = "(){}[]";
        for(int i = 0; i < strArr.length; i++) {
            String letter = strArr[i];
            if(brackets.indexOf(letter) == -1) {
                continue;
            }
            if(map.get(letter) == null) {
                stack.push(letter);
            } else {

                if(stack.isEmpty()) {
                    return false;
                }

                if(stack.peek().equals(map.get(letter))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
