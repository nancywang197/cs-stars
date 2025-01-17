public class HumanEval100 {
    public static int[] makeAPile(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input should be greater than 0");
        }
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i * 2 + 1;
        }
        return result;
    }

    
}