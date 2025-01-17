import java.util.Arrays;

public class HumanEval_152 {
    public static double[] compare(int[] game, int[] guess) {
        double[] result = new double[game.length];
        for (int i = 0; i < game.length; i++) {
            result[i] = Math.abs(game[i] - guess[i]);
        }
        return result;
    }

   
}