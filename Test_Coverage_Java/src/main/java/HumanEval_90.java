import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {

    public static Integer nextSmallest(Integer[] lst) {
        // Remove duplicates and sort the array
        Set<Integer> set = new HashSet<>(Arrays.asList(lst));
        Integer[] sortedList = set.stream().mapToObj(Integer::intValue).toArray(Integer[]::new);
        Arrays.sort(sortedList);

        // Return None if the list has less than 2 elements, otherwise return the second element
        if (sortedList.length < 2) {
            return null;
        } else {
            return sortedList[1];
        }
    }

    ;
        System.out.println(nextSmallest(lst));
    }
}