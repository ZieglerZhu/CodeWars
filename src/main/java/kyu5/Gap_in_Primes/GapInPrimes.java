package kyu5.Gap_in_Primes;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        long basePrimes = -1;
        for (long i = m; i <= n; i++) {
            boolean isPrimes = true;
            for (long j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimes = false;
                    break;
                }
            }
            if (isPrimes) {
                if (basePrimes == -1) {
                    basePrimes = i;
                }
                if (i - basePrimes == g) {
                    return new long[]{basePrimes, i};
                }
                basePrimes = i;
            }
        }
        return null;
    }
}
