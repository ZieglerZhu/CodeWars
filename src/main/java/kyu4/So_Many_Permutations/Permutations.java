package kyu4.So_Many_Permutations;

import java.util.*;

public class Permutations {
    public static List<String> singlePermutations(String s) {
        Set<String> resultSet = new HashSet<>();

        char[] charArray = s.toCharArray();
        int totalLength = charArray.length;
        boolean[] used = new boolean[totalLength];
        char[] curPermutation = new char[totalLength];

        permute(charArray, totalLength, resultSet, 0, curPermutation, used );

        return new ArrayList<>(resultSet);
    }

    private static void permute(char[] charArray, int totalLength, Set<String> resultSet,
                                int depth, char[] curPermutation, boolean[] used) {
        if (depth == totalLength) {
            resultSet.add(String.valueOf(curPermutation));
            return;
        }
        for (int i = 0; i < totalLength; i++) {
            if (!used[i]) {
                used[i] = true;
                curPermutation[depth] = charArray[i];
                permute(charArray, totalLength, resultSet, depth + 1, curPermutation, used);
                used[i] = false;
            }
        }
    }


}
