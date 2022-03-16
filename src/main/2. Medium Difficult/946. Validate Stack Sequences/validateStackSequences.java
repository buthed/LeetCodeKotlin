import java.util.Stack;

public class validateStackSequences {
    public static void main(String[] args) {
        int[] pushed1 = {1,2,3,4,5};
        int[] popped1 = {4,5,3,2,1};
        int[] pushed2 = {1,2,3,4,5};
        int[] popped2 = {4,3,5,1,2};
        int[] pushed3 = {1,0};
        int[] popped3 = {1,0};
        System.out.println(validateStackSequences(pushed1,popped1)); // Output: true
        System.out.println(validateStackSequences(pushed2,popped2)); // Output: false
        System.out.println(validateStackSequences(pushed3,popped3)); // Output: true

    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int pushPos = 0;
        int popPos = 0;
        Stack<Integer> stack = new Stack<Integer>();
        do {
            if (stack.isEmpty()) {
                stack.push(pushed[pushPos]);
                pushPos++;
            }
            if (stack.peek()==popped[popPos]){
                stack.pop();
                popPos++;
            } else {
                if (pushPos==pushed.length) return false;
                stack.push(pushed[pushPos]);
                pushPos++;
            }

        } while (popPos<popped.length);
        if (stack.isEmpty()) return true;
        else return false;
    }
}