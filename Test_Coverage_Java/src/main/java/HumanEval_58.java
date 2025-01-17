import java.util.*;

public class HumanEval_58 {
    public static List<Object> common(List<Object> list1, List<Object> list2) {
        Set<Object> set = new HashSet<>();
        for (Object e1 : list1) {
            for (Object e2 : list2) {
                if (e1.equals(e2)) {
                    set.add(e1);
                }
            }
        }
        return new ArrayList<>(new TreeSet<>(set));
    }

    
}