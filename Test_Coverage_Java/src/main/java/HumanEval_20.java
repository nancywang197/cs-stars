import java.util.*;

public class HumanEval_20 {
    public static List Double> findClosestElements(double[] numbers) {
        double minDistance = Double.MAX_VALUE;
        List<Double> closestPair = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                double distance = Math.abs(numbers[i] - numbers[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                    closestPair.clear();
                    closestPair.add(numbers[i]);
                    closestPair.add(numbers[j]);
                } else if (distance == minDistance) {
                    closestPair.add(numbers[i]);
                    closestPair.add(numbers[j]);
                }
            }
        }

        return closestPair;
    }
}