package Demo;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openingBracket = stack.pop();
                if ((bracket == ')' && openingBracket != '(')
                        || (bracket == ']' && openingBracket != '[')
                        || (bracket == '}' && openingBracket != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String sequence1 = "{[()]}";
        String sequence2 = "{[(])}";

        System.out.println("Sequence 1 is balanced: " + isBalanced(sequence1)); // Output: true
        System.out.println("Sequence 2 is balanced: " + isBalanced(sequence2)); // Output: false
    }
}
