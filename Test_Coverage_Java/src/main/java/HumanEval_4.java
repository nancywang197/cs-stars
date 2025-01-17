import java.util.List;

public class HumanEval_4 {
    public static double meanAbsoluteDeviation(List<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Cannot calculate MAE for an empty list");
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double mean = sum / numbers.size();

        double deviationSum = 0;
        for (double num : numbers) {
            deviationSum += Math.abs(num - mean);
        }

        return deviationSum / numbers.size();
    }

    
}