package kyu4.Strip_Comments;

import java.util.ArrayList;
import java.util.List;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String[] split = text.split("\n");
        for (int i = 0; i < split.length; i++) {
            List<Integer> indexList = new ArrayList<>();
            for (String commentSymbol : commentSymbols) {
                int index = split[i].indexOf(commentSymbol);
                if (index != -1) {
                    indexList.add(index);
                }
            }
            Integer index = indexList.stream().sorted().findFirst().orElse(null);
            if (index != null) {
                split[i] = split[i].substring(0, index);
            }
            if (split[i].endsWith(" ")) {
                split[i] = split[i].stripTrailing();
            }
        }

        return String.join("\n", split);
    }
}


