package kyu5.int32_to_IPv4;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static String longToIP(long ip) {
        List<String> resultList = new ArrayList<>(4);
        String longIPStr = Long.toBinaryString(ip);
        String fullLengthIPStr = StringUtils.leftPad(longIPStr, 32, "0");
        for (int i = 0; i < fullLengthIPStr.length(); i += 8) {
            String octetStr = fullLengthIPStr.substring(i, i + 8);
            int octetInt = Integer.parseInt(octetStr, 2);
            String result = String.valueOf(octetInt);
            resultList.add(result);
        }
        return String.join(".", resultList);
    }
}
