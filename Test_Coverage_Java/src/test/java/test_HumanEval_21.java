import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval21Test {

    @Test
    public void testRescaleToUnit() {
        double[] result1 = {0.0, 1.0};
        double[] result2 = {1.0, 0.0};
        double[] result3 = {0.0, 0.25, 0.5, 0.75, 1.0};
        double[] result4 = {0.25, 0.0, 1.0, 0.5, 0.75};
        double[] result5 = {0.25, 0.0, 1.0, 0.5, 0.75};

        HumanEval21Impl impl = new HumanEval21Impl();
        
        assertTrue(Arrays.equals(impl.rescaleToUnit(new double[]{2.0, 49.9}), result1));
        assertTrue(Arrays.equals(impl.rescaleToUnit(new double[]{100.0, 49.9}), result2));
        assertTrue(Arrays.equals(impl.rescaleToUnit(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}), result3));
        assertTrue(Arrays.equals(impl.rescaleToUnit(new double[]{2.0, 1.0, 5.0, 3.0, 4.0}), result4));
        assertTrue(Arrays.equals(impl.rescaleToUnit(new double[]{12.0, 11.0, 15.0, 13.0, 14.0}), result5));
    }
}