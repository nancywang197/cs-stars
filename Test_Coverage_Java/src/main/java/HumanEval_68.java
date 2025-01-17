import java.util.*;

public class Main {

    public static Object[] pluck(int[] arr) {
        if (arr.length == 0) return new Object[0];
        List<Integer> evens = filterEvenNumbers(arr);
        if (evens.isEmpty()) return new Object[0];
        int minIndex = Collections.min(evens).indexOf(Collections.min(evens));
        return new Object[]{Collections.min(evens), minIndex};
    }

    public static List<Integer> filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}