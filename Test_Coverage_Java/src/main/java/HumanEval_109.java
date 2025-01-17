import java.util.Arrays;

public class Main {
    public static boolean moveOneBall(int[] arr) {
        // Check for empty array
        if (arr.length == 0) {
            return true;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        int minIndex = -1;
        // Find the index of minimum value in the original array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Math.min(arr)) {
                minIndex = i;
                break;
            }
        }

        // Swap elements around the minIndex to create two separate parts
        int[] result = new int[arr.length];
        System.arraycopy(arr, 0, result, 0, minIndex);
        System.arraycopy(arr, minIndex + 1, result, minIndex, arr.length - (minIndex + 1));
        System.arraycopy(arr, 0, result, arr.length - (minIndex + 1), minIndex + 1);

        // Compare the original array with the modified array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != result[i]) {
                return false;
            }
        }

        return true;
    }

    ;
        System.out.println(moveOneBall(testArray)); // prints: true

        int[] emptyArray = {};
        System.out.println(moveOneBall(emptyArray)); // prints: true
    }
}