public class HumanEval_77 {
    public static boolean isCube(int a) {
        // Take absolute value of 'a' to handle negative numbers
        int absA = Math.abs(a);
        
        // Calculate cube root and round it to the nearest integer
        int cubeRoot = (int) Math.round(Math.cbrt(absA));
        
        // Check if the cube of the rounded cube root equals the original number
        return cubeRoot * cubeRoot * cubeRoot == absA;
    }

    
}