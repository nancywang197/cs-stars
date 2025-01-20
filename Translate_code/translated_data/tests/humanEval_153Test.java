import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_153Test {

    @Test
    public void testStrongestExtension() {
        HumanEval_153 tester = new HumanEval_153();

        // Check some simple cases
        assertEquals("Watashi.eIGHt8OKe", tester.Strongest_Extension("Watashi", new String[]{"tEN", "niNE", "eIGHt8OKe"}));
        assertEquals("Boku123.YEs.WeCaNe", tester.Strongest_Extension("Boku123", new String[]{"nani", "NazeDa", "YEs.WeCaNe", "32145tggg"}));
        assertEquals("__YESIMHERE.NuLl__", tester.Strongest_Extension("__YESIMHERE", new String[]{"t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321"}));
        assertEquals("K.TAR", tester.Strongest_Extension("K", new String[]{"Ta", "TAR", "t234An", "cosSo"}));
        assertEquals("__HAHA.123", tester.Strongest_Extension("__HAHA", new String[]{"Tab", "123", "781345", "-_-"}));
        assertEquals("YameRore.okIWILL123", tester.Strongest_Extension("YameRore", new String[]{"HhAas", "okIWILL123", "WorkOut", "Fails", "-_-"}));
        assertEquals("finNNalLLly.WoW", tester.Strongest_Extension("finNNalLLly", new String[]{"Die", "NowW", "Wow", "WoW"}));

        // Check some edge cases that are easy to work out by hand.
        assertEquals("_.Bb", tester.Strongest_Extension("_", new String[]{"Bb", "91245"}));
        assertEquals("Sp.671235", tester.Strongest_Extension("Sp", new String[]{"671235", "Bb"}));
    }
}
