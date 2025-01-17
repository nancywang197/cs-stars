import java.util.stream.Stream;
import java.util.function.Predicate;

public class HumanEval_128 {

    public static Integer prodSigns(int[] arr) {
        if (arr.length == 0) return null;

        int posCount = Stream.of(arr).filter(x -> x > 0).count();
        boolean isNegative = false;
        for (int i : arr) {
            if (i < 0) isNegative = true;
        }

        int product = (isNegative ? -1 : 1) * Math.abs(posCount - arr.stream().filter(Java8Predicate::test).count());

        return product;
    }
}