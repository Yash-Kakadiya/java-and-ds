// Q31: Given a string S of length n, the task is to find the earliest repeated character in it. The earliest repeated character  means,  the  character  that  occurs  more  than  once  and  whose  second  occurrence  has  the smallest index than other repeated characters. 
// Input: s = "geeksforgeeks"  
// Output: e  
// Explanation: e is the first element that repeats in the string e at index 1,2

public class Q31 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(earliestRepeatedCharacter(s));
    }

    public static char earliestRepeatedCharacter(String s) {
        int[] index = new int[256]; // Assuming ASCII character set
        for (int i = 0; i < 256; i++) {
            index[i] = -1; // Initialize all indices to -1
        }
        char result = '\0';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (index[ch] == -1) {
                index[ch] = i; // Store the first occurrence index
            } else {
                result = ch;
                return result;
            }
        }

        System.err.println("No repeated character found");
        return result;
    }

}
