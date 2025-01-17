import java.util.Arrays;

public class Main {
    public static boolean hasCloseElements(float[] numbers, float threshold) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (Math.abs(numbers[i] - numbers[j]) < threshold) {
                    return true;
                }
            }
        }
        return false;
    }
}