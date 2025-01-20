import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class HumanEval_95Test {

    @Test
    public void testCheckDictCase() {
        HumanEval_95 checker = new HumanEval_95();

        Map<String, Object> dict1 = new HashMap<>();
        dict1.put("p", "pineapple");
        dict1.put("b", "banana");
        assertEquals(true, checker.check_dict_case(dict1));

        Map<String, Object> dict2 = new HashMap<>();
        dict2.put("p", "pineapple");
        dict2.put("A", "banana");
        dict2.put("B", "banana");
        assertEquals(false, checker.check_dict_case(dict2));

        Map<String, Object> dict3 = new HashMap<>();
        dict3.put("p", "pineapple");
        dict3.put("5", "banana");
        dict3.put("a", "apple");
        assertEquals(false, checker.check_dict_case(dict3));

        Map<String, Object> dict4 = new HashMap<>();
        dict4.put("Name", "John");
        dict4.put("Age", "36");
        dict4.put("City", "Houston");
        assertEquals(false, checker.check_dict_case(dict4));

        Map<String, Object> dict5 = new HashMap<>();
        dict5.put("STATE", "NC");
        dict5.put("ZIP", "12345");
        assertEquals(true, checker.check_dict_case(dict5));

        Map<String, Object> dict6 = new HashMap<>();
        dict6.put("fruit", "Orange");
        dict6.put("taste", "Sweet");
        assertEquals(true, checker.check_dict_case(dict6));

        Map<String, Object> dict7 = new HashMap<>();
        assertEquals(false, checker.check_dict_case(dict7));
    }
}
