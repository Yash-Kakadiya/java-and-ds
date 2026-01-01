// Q28. Write a program that should decode the given pattern and print ther esulting expanded string. 
// Input: 2a3bc4dE5F2G7H 
// Output: aabbbcddddEFFFFFGGHHHHHHH

public class Q28 {
    public static void main(String[] args) {

        // Decompression
        String s = "2a3bc4dE5F2G7H";
        System.out.println("Input: " + s);

        StringBuilder decompressed = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            if (Character.isDigit(s.charAt(i))) {
                count = s.charAt(i) - '0';
                i++;
            }
            char ch = s.charAt(i);
            for (int c = 0; c < count; c++)
                System.out.print(ch);
        }
        System.out.println("Decompressed: " + decompressed.toString());

        String s2 = "aabbbcddddEFFFFFGGHHHHHHH";
        s2 = s2 + "\0"; // Sentinel character to handle the last group
        System.out.println("Input: " + s2);

        // Compression
        StringBuilder compressed = new StringBuilder();
        for (int i = 1; i < s2.length(); i++) {
            int count = 1;
            char chPrev = s2.charAt(i - 1);
            char chCurr = s2.charAt(i);
            while (chPrev == chCurr) {
                count++;
                i++;
                chCurr = s2.charAt(i);
            }
            if (count > 1)
                compressed.append(count);
            compressed.append(chPrev);
        }
        System.out.println("Compressed: " + compressed.toString());

    }
}
