// Write a program that recognize strings that contains a pattern wcwR (where w={a,b} and wR means reverse of string w)

import java.util.Stack;

public class Q57 {
    public static void main(String[] args) {
        String str = "abbcbba"; // Example string
        if (isPattern(str)) {
            System.out.println("The string contains the pattern wcwR(w={a,b}).");
        } else {
            System.out.println("The string does not contain the pattern wcwR.(w={a,b}).");
        }
    }

    public static boolean isPattern(String str) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < str.length() / 2 && (str.charAt(i) == 'a' || str.charAt(i) == 'b')) {
            stack.push(str.charAt(i));
            i++;
        }
        i++; // Skip the middle character
        while (i < str.length() && (str.charAt(i) == 'a' || str.charAt(i) == 'b')) {
            if (stack.isEmpty() || stack.pop() != str.charAt(i)) {
                return false;
            }
            i++;
        }
        return stack.isEmpty() && i == str.length();
    }
}
