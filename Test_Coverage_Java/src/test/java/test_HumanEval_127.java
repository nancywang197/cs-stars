import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_127Test {

    @Test
    public void test_HumanEval_127() {
 
        // Check some simple cases
        assertEquals("NO", intersection((1, 2), (2, 3)));
        assertEquals("NO", intersection((-1, 1), (0, 4)));
        assertEquals("YES", intersection((-3, -1), (-5, 5)));
        assertEquals("YES", intersection((-2, 2), (-4, 0)));

        // Check some edge cases that are easy to work out by hand.
        assertEquals("NO", intersection((-11, 2), (-1, -1)));
        assertEquals("NO", intersection((1, 2), (3, 5)));
        assertEquals("NO", intersection((1, 2), (1, 2)));
        assertEquals("NO", intersection((-2, -2), (-3, -2)));

    }

    public static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static String intersection(Interval interval1, Interval interval2) {
        // Your logic to find the intersection of two intervals
        if (interval1.end < interval2.start || interval2.end < interval1.start) {
            return "NO";
        } else {
            return "YES";
        }
    }

}