import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval36Test {

    @Test
    public void testHumanEval_36() {
        // Test cases for FizzBuzz function
        assertEquals(0, humanEval_36(50)); // Output: 0 (multiple of 100)
        assertEquals(2, humanEval_36(78)); // Output: "fizz" (multiple of 3 but not 5)
        assertEquals(3, humanEval_36(79)); // Output: "fizzbuzz" 
        assertEquals(3, humanEval_36(100)); // Output: "fizz"
        assertEquals(6, humanEval_36(200)); // Output: "fizz" 
        assertEquals(192, humanEval_36(4000)); // Output: "fizz buzz buzz fizz"
        assertEquals(639, humanEval_36(10000)); // Output: "buzz buzz buzz fizzbuzz buzz fizz"
        assertEquals(8026, humanEval_36(100000)); // Output: "fizzbuzz fizz buzz buzz f"
    }

    public int humanEval_36(int input) {
        if (input % 3 == 0 && input % 5 == 0) { // multiple of both
            return 0;
        } else if (input % 3 == 0) { // multiple of 3 but not 5
            return 1;
        } else if (input % 5 == 0) { // multiple of 5 but not 3
            return 2;
        } else {
            return input % 10 / 3; // digit count modulo 3
        }
    }
}