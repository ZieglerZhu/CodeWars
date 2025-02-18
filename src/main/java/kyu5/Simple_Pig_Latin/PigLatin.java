package kyu5.Simple_Pig_Latin;

public class PigLatin {
    public static String pigIt(String str) {
        final String suffix = "ay";
        String[] src = str.split(" ");
        for (int i = 0; i < src.length; i++) {
            if (src[i].charAt(0) < 'A' || src[i].charAt(0) > 'z') {
                continue;
            }
            src[i] = src[i].substring(1) + src[i].charAt(0) + suffix;
        }
        return String.join(" ", src);
    }
}
