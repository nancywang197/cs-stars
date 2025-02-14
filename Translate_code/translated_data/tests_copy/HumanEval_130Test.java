package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_130;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_130Test {

    @Test
    public void testTri() {
        HumanEval_130 tri = new HumanEval_130();
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0), tri.tri(3));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0), tri.tri(4));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0), tri.tri(5));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0), tri.tri(6));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0), tri.tri(7));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0), tri.tri(8));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0), tri.tri(9));
        assertEquals(Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0), tri.tri(20));
        assertEquals(Arrays.asList(1), tri.tri(0));
        assertEquals(Arrays.asList(1, 3), tri.tri(1));
    }
}
