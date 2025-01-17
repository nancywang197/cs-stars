import java.util.List;

public class HumanEval_21 {

    /**
     * Rescales a list of numbers to be between 0 and 1.
     *
     * @param numbers A list of float numbers
     * @return The rescaled list of numbers
     */
    public static List<Double> rescaleToUnit(List<Double> numbers) {
        double minNumber = Math.min(numbers.stream().mapToDouble(Double::doubleValue).toArray());
        double maxNumber = Math.max(numbers.stream().mapToDouble(Double::doubleValue).toArray());
        
        // Ensure max is not zero to avoid division by zero
        if (maxNumber == 0) {
            throw new ArithmeticException("Cannot rescale numbers to unit range with all zeros.");
        }

        return numbers.stream()
                .map(x -> (x - minNumber) / (maxNumber - minNumber))
                .boxed()
                .collect(java.util.Collections.toList());
    }

    
}