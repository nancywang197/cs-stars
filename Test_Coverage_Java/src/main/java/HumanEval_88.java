import java.util.Arrays;

public class Main {
    public static int[] sortArray(int[] array) {
        if (array.length == 0) {
            return new int[0];
        }
        
        Arrays.sort(array);
        return array;
    }


}