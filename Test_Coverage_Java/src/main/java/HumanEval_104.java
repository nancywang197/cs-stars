import java.util.*;

public class Main {
    public static List<Integer> uniqueDigits(int[] x) {
        Set<Integer> oddDigitElements = new HashSet<>();
        for (int i : x) {
            if (Integer.toString(i).chars()
                    .allMatch(c -> Character.getNumericValue(c) % 2 == 1)) {
                oddDigitElements.add(i);
            }
        }
        return new ArrayList<>(oddDigitElements);
    }

}