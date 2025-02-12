package kyu6.Stop_gninnipS_My_sdroW;

public class SpinWords {
    public String spinWords(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] wordList = sentence.split(" ");
        for (String singleWord : wordList) {
            if (singleWord == null) {
                continue;
            }
            if (singleWord.length() >= 5) {
                singleWord = new StringBuilder(singleWord).reverse().toString();
            }
            result.append(singleWord).append(" ");
        }
        return result.toString().trim();
    }
}
