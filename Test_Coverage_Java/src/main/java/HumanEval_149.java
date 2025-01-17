import java.util.*;

public class Main {
    public static List<Integer> sortedListSum(List<Object> lst) {
        // Sort the list in ascending order
        Collections.sort(lst);

        // Initialize an empty list to store elements with even length
        List<Object> newLst = new ArrayList<>();

        // Iterate through each element in the sorted list
        for (Object i : lst) {
            // Check if the length of the current element is even
            if (((Comparable)i).compareTo(i) == 0 && ((Integer)i).length() % 2 == 0) {
                // If it's even, append it to the new list
                newLst.add(i);
            }
        }

        // Sort the new list based on the length of its elements
        Collections.sort(newLst, (a, b) -> ((String)a).length() - ((String)b).length());

        return newLst;
    }

    
}