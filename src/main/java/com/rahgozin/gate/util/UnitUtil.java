package com.rahgozin.gate.util;

import java.util.Arrays;
import java.util.List;

public class UnitUtil {

    public static List<String> title = Arrays.asList("مگ", "گیگ");

    public static String humanReadableByteCountBin(long bytes) {
        long absB = bytes == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(bytes);
        if (absB < 1024) {
            return bytes + " بایت ";
        }
        long value = absB;
        int index = 0;
        String result = " کیلو بایت ";
        for (int i = 40; i >= 0 && absB > 0xfffccccccccccccL >> i; i -= 10) {
            value >>= 10;
            result = title.get(index);
            index++;
        }
        value *= Long.signum(bytes);
        return String.format("%.1f %s", value / 1024.0, result);
    }

    public static String humanReadableSecondCountBin(long second) {
        if (second < 60) {
            return second + " ثانیه";
        }
        return second / 60 + " دقیقه";
    }

}
