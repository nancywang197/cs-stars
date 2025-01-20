import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_27Test {

    HumanEval_27 flipCase = new HumanEval_27();

    @Test
    public void testEmpty() {
        assertEquals("", flipCase.flip_case(""));
    }

    @Test
    public void testHelloWorld() {
        assertEquals("hELLO!", flipCase.flip_case("Hello!"));
    }

    @Test
    public void testLongString() {
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", flipCase.flip_case("These violent delights have violent ends"));
    }
}
