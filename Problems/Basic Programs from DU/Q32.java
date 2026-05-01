// WAP to delete an element from array specified by user. if element is not found print a message “Element is not found” (do not take a new array).

public class Q32 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int elementToDelete = 3;
        boolean found = false;

        // Print original array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToDelete) {
                found = true;
                // Shift elements to the left
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                // Set the last element to a default value (e.g., 0)
                arr[arr.length - 1] = 0;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + elementToDelete + " deleted. Updated array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Element is not found");
        }
    }
}
