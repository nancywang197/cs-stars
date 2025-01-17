import java.util.Arrays;

public class Main {

    /**
     * Returns true if there are three elements in the list that sum up to zero, false otherwise.
     *
     * @param l The input list of integers
     * @return True if there are three elements in the list that sum up to zero, false otherwise
     */
    public static boolean triplesSumToZero(int[] l) {
        Arrays.sort(l); // Sort the array for efficient two-pointer approach
        for (int i = 0; i < l.length - 2; i++) { // Iterate over the array with three pointers
            int j = i + 1, k = l.length - 1;
            while (j < k) {
                if (l[i] + l[j] + l[k] == 0) {
                    return true;
                } else if (l[i] + l[j] + l[k] < 0) { // If the sum is less than zero, move the left pointer to the right
                    j++;
                } else { // If the sum is greater than zero, move the right pointer to the left
                    k--;
                }
            }
        }
        return false;
    }
}