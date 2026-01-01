// Q32: Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
// Input: s1 = “geeks” s2 = “kseeg” 
// Output: true 
// Explanation: Both the strings have the same characters with same frequency. So, they are anagrams.

public class Q32 {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";

        if (areAnagrams(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
