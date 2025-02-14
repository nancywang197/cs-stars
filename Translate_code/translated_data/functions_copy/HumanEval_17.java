package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanEval_17 {
    /**
     * Given a string representing music notation, parse it and return a list of integers representing the notes.
     *
     * @param music_string The music string to parse.
     * @return A list of integers representing the notes.
     */
    public List<Integer> parse_music(String music_string) {
        Map<String, Integer> note_map = new HashMap<>();
        note_map.put("o", 4);
        note_map.put("o|", 2);
        note_map.put(".|", 1);

        String[] notes = music_string.split(" ");
        List<Integer> result = new ArrayList<>();
        for (String note : notes) {
            if (!note.isEmpty()) {
                result.add(note_map.get(note));
            }
        }
        return result;
    }
}
