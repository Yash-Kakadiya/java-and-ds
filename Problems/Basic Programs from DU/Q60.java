// Write a program that should decode the given pattern and print the resulting expanded string. 
// Input: 2a3bc4dE5F2G7H 
// Output: aabbbcddddEFFFFFGGHHHHHHH

public class Q60 {
    public static void main(String[] args) {
        String input = "2a3bc4dE5F2G7H";
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                int count = Character.getNumericValue(currentChar);
                if (i + 1 < input.length()) {
                    char nextChar = input.charAt(i + 1);
                    for (int j = 0; j < count; j++) {
                        output.append(nextChar);
                    }
                    i++; // Skip the next character as it's already processed
                }
            } else {
                output.append(currentChar); // Append non-digit characters directly
            }
        }
        System.out.println(output.toString());
    }
}
