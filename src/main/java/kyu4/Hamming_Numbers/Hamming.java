package kyu4.Hamming_Numbers;

import java.util.ArrayList;
import java.util.List;

public class Hamming {
    public static long hamming(int n) {
        List<Long> resultList = new ArrayList<>();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int count = 1;
        resultList.add(1L);
        while (n > count) {
            long result = Math.min(resultList.get(i2) * 2, Math.min(resultList.get(i3) * 3, resultList.get(i5) * 5));
            if (result == resultList.get(i2) * 2) {
                i2++;
            }
            if (result == resultList.get(i3) * 3) {
                i3++;
            }
            if (result == resultList.get(i5) * 5) {
                i5++;
            }
            count++;
            resultList.add(result);
        }
        return resultList.get(resultList.size() - 1);
    }
}
