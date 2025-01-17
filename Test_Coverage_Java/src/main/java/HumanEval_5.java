import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> intersperse(List<Integer> numbers, int delimiter) {
        if (numbers.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        for (int n : numbers.subList(0, numbers.size() - 1)) {
            result.add(n);
            result.add(delimiter);
        }

        result.add(numbers.get(numbers.size() - 1));

        return result;
    }

    
}