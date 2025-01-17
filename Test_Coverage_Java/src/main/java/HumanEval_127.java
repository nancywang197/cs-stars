public class Main {
    public static String intersection(int[] interval1, int[] interval2) {
        boolean isPrime(int num) {
            if (num == 0 || num == 1) {
                return false;
            }
            if (num == 2) {
                return true;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        int left = Math.max(interval1[0], interval2[0]);
        int right = Math.min(interval1[1], interval2[1]);
        int length = right - left;
        if (length > 0 && isPrime(length)) {
            return "YES";
        }
        return "NO";
    }

    ;
        int[] interval2 = {4, 8};
        System.out.println(intersection(interval1, interval2));
    }
}