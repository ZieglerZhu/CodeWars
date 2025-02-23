package kyu5.Integers_Recreation_One;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        StringBuilder sb = new StringBuilder();
        List<String> resultList = new ArrayList<>();
        for (long i = m ; i <= n ; i ++) {
            Set<Long> divisors = new HashSet<>();
            for (long j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    divisors.add(j);
                    divisors.add(i / j);
                }
            }
            long sum = 0;
            for (Long divisor : divisors) {
                sum += divisor * divisor;
            }
            if ((Math.sqrt(sum) % 1) == 0) {
                resultList.add("[" + i + ", " + sum + "]");
            }
        }
        String resultStr = String.join(", ", resultList);
        return sb.append("[").append(resultStr).append("]").toString();
    }
}
