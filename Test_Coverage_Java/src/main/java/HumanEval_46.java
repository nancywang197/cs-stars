public class HumanEval_46 {
    public static int fib(int n) {
        int[] results = new int[5]; // initializing with [0, 0, 2, 0]
        if (n < 4) {
            return results[n];
        }

        for (int i = 4; i <= n + 1; i++) {
            results[i] = results[i - 1] + results[i - 2] + results[i - 3] + results[i - 4];
            if (i > 4) { // to avoid arrayIndexOutOfBoundsException
                results = new int[5]; 
                System.arraycopy(results, 0, results, 1, i); 
            }
        }

        return results[n];
    }

    
}