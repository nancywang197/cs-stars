import java.util.Arrays;

public class Main {

    public static boolean willItFly(int[] q, int w) {
        if (Arrays.stream(q).sum() > w) {
            return false;
        }

        for (int i = 0; i < q.length / 2; i++) {
            if (q[i] != q[q.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    ;
        System.out.println(willItFly(test1, 5));  // Should print: false

        int[] test2 = {3, 2, 3};
        System.out.println(willItFly(test2, 1));  // Should print: false

        int[] test3 = {3, 2, 3};
        System.out.println(willItFly(test3, 9));  // Should print: true

        int[] test4 = {3};
        System.out.println(willItFly(test4, 5));  // Should print: true
    }
}