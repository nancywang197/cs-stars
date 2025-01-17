import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> getPositiveNumbers(List<Integer> numbers) {
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }

    
}