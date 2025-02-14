package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_67;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_67Test {

    @Test
    public void testFruitDistribution() {
        HumanEval_67 obj = new HumanEval_67();
        assertEquals(obj.fruit_distribution("5 apples and 6 oranges", 19), 8);
        assertEquals(obj.fruit_distribution("5 apples and 6 oranges", 21), 10);
        assertEquals(obj.fruit_distribution("0 apples and 1 oranges", 3), 2);
        assertEquals(obj.fruit_distribution("1 apples and 0 oranges", 3), 2);
        assertEquals(obj.fruit_distribution("2 apples and 3 oranges", 100), 95);
        assertEquals(obj.fruit_distribution("2 apples and 3 oranges", 5), 0);
        assertEquals(obj.fruit_distribution("1 apples and 100 oranges", 120), 19);
    }
}
