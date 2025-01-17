import java.util.Arrays;

public class Main {
    public static double[] compare(int[] game, int[] guess) {
        double[] result = new double[game.length];
        for (int i = 0; i < game.length; i++) {
            result[i] = Math.abs(game[i] - guess[i]);
        }
        return result;
    }

    ;
        int[] guess = {4, 5, 6};

        double[] result = compare(game, guess);
        
        System.out.println(Arrays.toString(result));
    }
}