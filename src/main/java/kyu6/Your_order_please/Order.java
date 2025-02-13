package kyu6.Your_order_please;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {
        String[] wordArray = words.split(" ");
        String[] resultArray = new String[wordArray.length];

        char baseLine = '1';
        for (String singleWord : wordArray) {
            for (char letter : singleWord.toCharArray()) {
                int offSet = letter - baseLine;
                if (offSet >= 0 && offSet < wordArray.length) {
                    resultArray[offSet] = singleWord;
                    break;
                }
            }
        }

        return Arrays.stream(resultArray).filter(Objects::nonNull).collect(Collectors.joining(" "));
    }
}
