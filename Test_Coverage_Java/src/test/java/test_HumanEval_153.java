import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_153Test {

    @Test
    public void test_HumanEval_153() {
 
        // Check some simple cases
        String result = StrongestExtension("Watashi", new String[] {"tEN", "niNE", "eIGHt8OKe"});
        assertEquals("Watashi.eIGHt8OKe", result);
        
        result = StrongestExtension("Boku123", new String[] {"nani", "NazeDa", "YEs.WeCaNe", "32145tggg"});
        assertEquals("Boku123.YEs.WeCaNe", result);
        
        result = StrongestExtension("__YESIMHERE", new String[] {"t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321"});
        assertEquals("__YESIMHERE.NuLl__', result);
        
        result = StrongestExtension("K", new String[] {"Ta", "TAR", "t234An", "cosSo"});
        assertEquals("K.TAR", result);
        
        result = StrongestExtension("__HAHA", new String[] {"Tab", "123", "781345", "-_-"});
        assertEquals("__HAHA.123", result);
        
        result = StrongestExtension("YameRore", new String[] {"HhAas", "okIWILL123", "WorkOut", "Fails", "-_-"});
        assertEquals("YameRore.okIWILL123", result);
        
        result = StrongestExtension("finNNalLLly", new String[] {"Die", "NowW", "Wow", "WoW"});
        assertEquals("finNNalLLly.WoW", result);
 
        // Check some edge cases that are easy to work out by hand.
        result = StrongestExtension("_", new String[] {"Bb", "91245"});
        assertEquals("_.Bb", result);
        
        result = StrongestExtension("Sp", new String[] {"671235", "Bb"});
        assertEquals("Sp.671235", result);
    }

    // Assuming the method exists in the HumanEval_153 class
    public static String StrongestExtension(String input, String[] extensions) {
        StringBuilder sb = new StringBuilder();
        for (String ext : extensions) {
            if (input.contains(ext)) {
                sb.append(ext).append(".");
            }
        }
        return sb.toString().trim();
    }
}