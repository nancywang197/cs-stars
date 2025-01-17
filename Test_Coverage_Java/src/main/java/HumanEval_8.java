public class HumanEval_8 {
    public static int[] sumProduct(int[] numbers) {
        int sumValue = 0;
        long prodValue = 1;

        for (int n : numbers) {
            sumValue += n;
            prodValue *= n;
        }
        
        // We return an array instead of a tuple
        return new int[]{sumValue, (int) prodValue};
    }
}