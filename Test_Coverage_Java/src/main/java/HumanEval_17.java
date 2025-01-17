import java.util.ArrayList;
import java.util.List;

public class HumanEval_17 {
    private static final String NOTE_MAP = "o|.|";

    public List<Integer> parseMusic(String musicString) {
        List<Integer> notes = new ArrayList<>();
        for (char c : musicString.toCharArray()) {
            if (NOTE_MAP.indexOf(c) != -1) {
                int noteValue = getNoteValue(c);
                notes.add(noteValue);
            }
        }
        return notes;
    }

    private int getNoteValue(char c) {
        switch (c) {
            case 'o':
                return 4;
            case '|':
                if (c == '.') {
                    return 1;
                } else {
                    return 2;
                }
            default:
                return -1; // Invalid note
        }
    }

    
}