package kyu6.Split_Strings;

public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
        if ((s.length() % 2) != 0) {
            s = s + "_";
        }
        String[] result = new String[(s.length()/2)];
        for (int i = 0, j = 0 ; (i + 2) <= s.length() ; i += 2, j++){
            result[j] = s.substring(i, i + 2);
        }
        return result;
    }
}
