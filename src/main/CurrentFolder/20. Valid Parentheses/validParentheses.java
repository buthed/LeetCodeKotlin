import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "](";
        String s5 = "{[]}";
        String s6 = "(){}}{";
        System.out.println(isValid(s1)); // Output: true
        System.out.println(isValid(s2)); // Output: true
        System.out.println(isValid(s3)); // Output: false
        System.out.println(isValid(s4)); // Output: false
        System.out.println(isValid(s5)); // Output: true
        System.out.println(isValid(s6)); // Output: false
    }

    public static boolean isValid(String s) {
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                if (s.charAt(i) == ')') {
                    if (stack.peek() == '(') stack.pop();
                    else return false;
                } else if (s.charAt(i) == ']') {
                    if (stack.peek() == '[') stack.pop();
                    else return false;
                } else if (s.charAt(i) == '}') {
                    if (stack.peek() == '{') stack.pop();
                    else return false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}