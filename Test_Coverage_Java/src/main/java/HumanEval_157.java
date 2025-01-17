public class Main {
    public static boolean isRightAngleTriangle(int a, int b, int c) {
        // Sort sides in ascending order to simplify the calculation
        int[] sortedSides = {Math.min(a, Math.min(b, c)), 
                              Math.max(a, Math.max(b, c))};
        
        // Use Pythagorean theorem to check for right-angled triangle
        return (sortedSides[0] * sortedSides[0]) == (sortedSides[1] * sortedSights[1]);
    }

    
}