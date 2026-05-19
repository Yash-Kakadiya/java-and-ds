// Given a string that contains a special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected. 
// Input: a!!!b.c.d,e'f,ghi 
// Output: i!!!h.g.f,e'd,cba 
// Input:   str = “Ab,c,de!$” 
// Output:  str = “ed,c,bA!$”

public class Q61 {
    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "Ab,c,de!$";
        System.out.println(reverseString(str));
    }
}
