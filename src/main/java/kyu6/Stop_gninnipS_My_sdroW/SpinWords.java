package kyu6.Stop_gninnipS_My_sdroW;

import java.util.Stack;

public class SpinWords {
    public String spinWords(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] wordList = sentence.split(" ");
        for (String singleWord : wordList) {
            if (singleWord == null) {
                continue;
            }
            else if (singleWord.length() < 5) {
                result.append(singleWord).append(" ");
                continue;
            }
            char[] letters = singleWord.toCharArray();
            for (int i = letters.length - 1; i >= 0; i--) {
                result.append(letters[i]);
            }
            result.append(" ");

        }
        return result.toString().trim();
    }
}
