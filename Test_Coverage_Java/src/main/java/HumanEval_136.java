import java.util.List;
import java.util.Arrays;

public class Main {
    ;
        System.out.println(largestSmallestIntegers(lst));
        
        int[] emptyList = {};
        System.out.println(largestSmallestIntegers(emptyList));
        
        int[] singleElementList = {0};
        System.out.println(largestSmallestIntegers(singleElementList));
    }

    public static class IntegerResult {
        public Integer smallestNegative;
        public Integer largestPositive;

        public IntegerResult(Integer smallestNegative, Integer largestPositive) {
            this.smallestNegative = smallestNegative;
            this.largestPositive = largestPositive;
        }
    }

    public static IntegerResult largestSmallestIntegers(int[] lst) {
        List<Integer> negativeNumbers = Arrays.stream(lst).filter(n -> n < 0).sorted().toList();
        List<Integer> positiveNumbers = Arrays.stream(lst).filter(n -> n > 0).sorted().toList();

        if (negativeNumbers.isEmpty()) {
            return new IntegerResult(null, positiveNumbers.isEmpty() ? null : positiveNumbers.get(0));
        } else if (positiveNumbers.isEmpty()) {
            return new IntegerResult(negativeNumbers.get(negativeNumbers.size() - 1), null);
        } else {
            return new IntegerResult(negativeNumbers.get(negativeNumbers.size() - 1), positiveNumbers.get(0));
        }
    }
}