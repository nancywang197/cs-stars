import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_158Test {

    @Test
    public void test1() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("string", solver.find_max(new String[]{"name", "of", "string"}));
    }

    @Test
    public void test2() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("enam", solver.find_max(new String[]{"name", "enam", "game"}));
    }

    @Test
    public void test3() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("aaaaaaa", solver.find_max(new String[]{"aaaaaaa", "bb", "cc"}));
    }

    @Test
    public void test4() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("abc", solver.find_max(new String[]{"abc", "cba"}));
    }
    @Test
    public void test5() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("footbott", solver.find_max(new String[]{"play", "this", "game", "of","footbott"}));
    }
    @Test
    public void test6() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("gonna", solver.find_max(new String[]{"we", "are", "gonna", "rock"}));
    }
    @Test
    public void test7() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("nation", solver.find_max(new String[]{"we", "are", "a", "mad", "nation"}));
    }
    @Test
    public void test8() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("this", solver.find_max(new String[]{"this", "is", "a", "prrk"}));
    }
    @Test
    public void test9() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("b", solver.find_max(new String[]{"b"}));
    }
    @Test
    public void test10() {
        HumanEval_158 solver = new HumanEval_158();
        assertEquals("play", solver.find_max(new String[]{"play", "play", "play"}));
    }
}
