import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<String> filterByPrefix(List<String> strings, String prefix) {
        return strings.stream()
                .filter(s -> s.startsWith(prefix))
                .collect(Collectors.toList());
    }

    
}