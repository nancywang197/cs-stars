import java.util.List;

class HumanEval_4 {
    /**
     * Given a list of numbers, return the mean absolute deviation.
     * The mean absolute deviation is the average of the absolute differences between each number and the mean of the numbers.
     *
     * @param numbers A list of numbers.
     * @return The mean absolute deviation.
     */
    public double mean_absolute_deviation(List<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        double mean = sum / numbers.size();
        double mad = 0;
        for (double number : numbers) {
            mad += Math.abs(number - mean);
        }
        return mad / numbers.size();
    }
}
