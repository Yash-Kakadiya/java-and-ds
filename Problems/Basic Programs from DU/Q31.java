// WAP to enter an element at specific position into array. (Do not take a new array)

public class Q31 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Integer.MIN_VALUE };
        int element = 99;
        int position = 5;

        // Shift elements to the right
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[position] = element;

        // Print the updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
