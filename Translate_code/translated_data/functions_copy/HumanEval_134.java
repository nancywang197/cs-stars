package com.example.python_to_java.functions_copy;
public class HumanEval_134 {
    /**
     * Create a function that returns True if the last character
     * of a given string is an alphabetical character and is not
     * a part of a word, and False otherwise.
     * Note: "word" is a group of characters separated by space.
     * Examples:
     * check_if_last_char_is_a_letter("apple pie") => False
     * check_if_last_char_is_a_letter("apple pi e") => True
     * check_if_last_char_is_a_letter("apple pi e ") => False
     * check_if_last_char_is_a_letter("") => False
     */
    public boolean check_if_last_char_is_a_letter(String txt) {
        String[] words = txt.split(" ");
        String lastWord = words[words.length - 1];
        return lastWord.length() == 1 && Character.isLetter(lastWord.charAt(0));

    }
}
