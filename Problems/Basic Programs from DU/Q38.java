// Write a Function that returns either 1 or 0 based on following condition if the array is in ascending order and occurrence of that number at least 3 then it should return 1 otherwise it should return 0. 
// e.g. 
// if A=[1,1,1,2,2] it should return 0 
// if A=[1,1,1,3,3,3,3] it should return 1 
// if A=[2,2,2,1,1,1] it should return 0 

public class Q38 {
    public static int checkArray(int[] A) {
        boolean isAscending = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                isAscending = false;
                break;
            }
        }
        if (!isAscending) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                count++;
            } else {
                if (count < 3) {
                    return 0;
                }
                count = 1;
            }
        }
        return count >= 3 ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] A1 = { 1, 1, 1, 2, 2 };
        int[] A2 = { 1, 1, 1, 3, 3, 3, 3 };
        int[] A3 = { 2, 2, 2, 1, 1, 1 };
        System.out.println(checkArray(A1)); // Output: 0
        System.out.println(checkArray(A2)); // Output: 1
        System.out.println(checkArray(A3)); // Output: 0
    }
}
