import java.util.List;
import java.util.stream.Collectors;

public class HumanEval_42 {
    public static List<Integer> incrList(List<Integer> inputList) {
        return inputList.stream()
                .map(i -> i + 1)
                .collect(Collectors.toList());
    }

    
}