import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<Integer> filterIntegers(List<Object> values) {
        return values.stream()
                .filter(value -> value instanceof Integer)
                .map(Object::intValue)
                .collect(Collectors.toList());
    }

    
}