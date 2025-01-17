public class Triangle {
    private static final boolean[] expectedResults = {
            true, false,
            false, false,
            true, true, true, true,
            true,
            false, false
    };

    

    public static boolean rightAngleTriangle(int a, int b, int c) {
        // Check if the triangle is valid (sum of two smaller sides > largest side)
        return a + b > c && a + c > b && b + c > a;
    }
}