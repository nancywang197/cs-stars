public class Main {
    /**
     * Returns the maximum element from a list.
     *
     * @param list the input list
     * @return the maximum element in the list
     */
    public static int maxElement(int[] list) {
        if (list.length == 0) {
            throw new IllegalArgumentException("List is empty");
        }

        int max = list[0];
        for (int e : list) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }
}