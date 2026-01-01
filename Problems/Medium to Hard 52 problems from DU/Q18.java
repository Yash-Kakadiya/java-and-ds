// Q18: Given two integer arrays nums1 and nums2, return an array of their intersection.  
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in sorted order.

public class Q18 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3 };
        int[] b = { 2, 2, 3 };
        System.out.print("Intersection: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    b[j] = -1;
                    break;
                }
            }
        }
    }
}