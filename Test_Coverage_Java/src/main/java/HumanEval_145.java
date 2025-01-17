import java.util.Arrays;
import java.util.Comparator;

public class HumanEval_145 {

    private static int digitsSum(int num) {
        int neg = 1;
        if (num < 0) num *= -1; // multiply by -1 to make it positive for summing
        String strNum = Integer.toString(Math.abs(num));
        return Arrays.stream(strNum.split("")).mapToInt(Integer::parseInt).sum() * neg;
    }

    public static int[] orderByPoints(int[] nums) {
        Arrays.sort(nums, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return Integer.compare(digitsSum(a[0]), digitsSum(b[0]));
            }
        });
        return nums;
    }
}