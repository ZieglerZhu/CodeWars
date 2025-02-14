package kyu7.Find_the_next_perfect_square;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double base = Math.sqrt((double) sq);
        if (base != Math.floor(base)) {
            return -1;
        }
        return (long) Math.pow((base + 1), 2    );
    }
}
