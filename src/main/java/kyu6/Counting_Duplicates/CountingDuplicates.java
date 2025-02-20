package kyu6.Counting_Duplicates;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int duplicateCount = 0;
        Set<Character> wordSet = new HashSet<>();
        Set<Character> duplicateWordSet = new HashSet<>();
        for (char c : text.toCharArray()) {
            boolean isDuplicate = wordSet.add(c);
            if (!isDuplicate) {
                duplicateCount++;
                boolean notCounted = duplicateWordSet.add(c);
                if (!notCounted){
                    duplicateCount--;
                }
            }
        }
        return duplicateCount;
    }
}
