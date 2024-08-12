import java.util.*;

public class stack {
    static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '[' || current == '{' || current == '(') {
                st.push(current);
            } else if (current == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else if (current == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if (current == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "[{()}]";
        boolean result = isValid(str);
        System.out.println("Parenthesis true or false: " + result);
    }
}
