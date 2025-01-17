public class Main {
    ;
        int[] result = sumProduct(numbers);
        System.out.println("Sum: " + result[0]);
        System.out.println("Product: " + result[1]);
    }

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