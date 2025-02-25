package kyu4.Range_Extraction;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String rangeExtraction(int[] arr) {
        List<String> result = new ArrayList<>();
        List<Integer> windows = new ArrayList<>();
        windows.add(0);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                windows.add(i);
                continue;
            }
            int windowSize = windows.size();
            if (windowSize < 3) {
                for (Integer window : windows) {
                    result.add(String.valueOf(arr[window]));
                }
            } else {
                result.add( arr[windows.get(0)] + "-" + arr[windows.get(windowSize - 1)] );
            }
            windows.clear();
            windows.add(i);
        }
        int windowSize = windows.size();
        if (windowSize < 3) {
            for (Integer window : windows) {
                result.add(String.valueOf(arr[window]));
            }
        } else {
            result.add( arr[windows.get(0)] + "-" + arr[windows.get(windowSize - 1)] );
        }
        return String.join(",", result);
    }
}
