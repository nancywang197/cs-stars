import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_67Test {

    @Test
    public void test_FruitDistribution_SimpleCases() {
        // Check some simple cases
        assertEquals(8, HumanEval_67.fruitDistribution("5 apples and 6 oranges",19));
        assertEquals(10, HumanEval_67.fruitDistribution("5 apples and 6 oranges",21));
        assertEquals(2, HumanEval_67.fruitDistribution("0 apples and 1 oranges",3));
        assertEquals(2, HumanEval_67.fruitDistribution("1 apples and 0 oranges",3));
        assertEquals(95, HumanEval_67.fruitDistribution("2 apples and 3 oranges",100));
        assertEquals(0, HumanEval_67.fruitDistribution("2 apples and 3 oranges",5));
        assertEquals(19, HumanEval_67.fruitDistribution("1 apples and 100 oranges",120));
    }
}