import java.util.Arrays;

public class Main {

    public static int[] maximum(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, arr.length - k, arr.length);
    }

}