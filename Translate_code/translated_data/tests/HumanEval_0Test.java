import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class HumanEval_0Test {

    @Test
    public void testHasCloseElements() {
        HumanEval_0 instance = new HumanEval_0();

        List<Float> list1 = new ArrayList<>(Arrays.asList(1.0f, 2.0f, 3.9f, 4.0f, 5.0f, 2.2f));
        assertTrue(instance.hasCloseElements(list1, 0.3f));

        List<Float> list2 = new ArrayList<>(Arrays.asList(1.0f, 2.0f, 3.9f, 4.0f, 5.0f, 2.2f));
        assertFalse(instance.hasCloseElements(list2, 0.05f));

        List<Float> list3 = new ArrayList<>(Arrays.asList(1.0f, 2.0f, 5.9f, 4.0f, 5.0f));
        assertTrue(instance.hasCloseElements(list3, 0.95f));

        List<Float> list4 = new ArrayList<>(Arrays.asList(1.0f, 2.0f, 5.9f, 4.0f, 5.0f));
        assertFalse(instance.hasCloseElements(list4, 0.8f));

        List<Float> list5 = new ArrayList<>(Arrays.asList(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 2.0f));
        assertTrue(instance.hasCloseElements(list5, 0.1f));

        List<Float> list6 = new ArrayList<>(Arrays.asList(1.1f, 2.2f, 3.1f, 4.1f, 5.1f));
        assertTrue(instance.hasCloseElements(list6, 1.0f));

        List<Float> list7 = new ArrayList<>(Arrays.asList(1.1f, 2.2f, 3.1f, 4.1f, 5.1f));
        assertFalse(instance.hasCloseElements(list7, 0.5f));
    }
}
