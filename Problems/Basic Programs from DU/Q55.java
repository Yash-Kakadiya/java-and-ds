// Find a next lexicographical order string from a given string, if input is abc output is acb (2 condition must be followed 1st the string must be greater than the inputted string and the outputted string must be the smallest string from all possible string.  
// Suppose there another string possible from this is acb, bac, bca, etc., but smallest is acb )

public class Q55 {
    public static void main(String[] args) {
        String str = "abcdb";
        String nextString = findNextLexicographicalString(str);
        System.out.println("Next lexicographical string: " + nextString);
    }

    public static String findNextLexicographicalString(String str) {
        char[] chars = str.toCharArray();
        int i = chars.length - 2;

        // Step 1: Find the rightmost pair of characters where the left character is
        // smaller than the right character
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }

        // If no such pair exists, we are at the last permutation
        if (i < 0) {
            return "No next lexicographical string";
        }

        // Step 2: Find the rightmost character that is greater than the left character
        // found in step 1
        int j = chars.length - 1;
        while (chars[j] <= chars[i]) {
            j--;
        }

        // Step 3: Swap the characters found in step 1 and step 2
        swap(chars, i, j);

        // Step 4: Reverse the substring to the right of the left character found in
        // step 1
        reverse(chars, i + 1, chars.length - 1);

        return new String(chars);
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            swap(chars, start, end);
            start++;
            end--;
        }
    }
}
