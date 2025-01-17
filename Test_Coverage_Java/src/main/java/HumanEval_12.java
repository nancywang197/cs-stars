import java.util.List;
import java.util.Optional;

public class HumanEval_12 {

    public static Optional<String> longest(List<String> strings) {
        if (strings.isEmpty()) {
            return Optional.empty();
        }

        int maxlen = 0;
        for (String s : strings) {
            if (s.length() > maxlen) {
                maxlen = s.length();
            }
        }

        for (String s : strings) {
            if (s.length() == maxlen) {
                return Optional.of(s);
            }
        }

        // This should never be reached, but added for completeness
        throw new RuntimeException("No longest string found");
    }

    
}