package me.thribs.integers;

import java.util.ArrayList;
import java.util.List;

public class Integers {
    
    public static List<Integer> integers = new ArrayList<>();

    public static boolean isLongerThan5() {
        if (integers.size() > 5) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLongerThan10() {
        if (integers.size() > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static double getAverage() {
        int sum = 0;
        for (Integer i : integers) {
            sum += i;
        }
        if (integers.size() < 1) {
            return 0;
        }
        return sum / integers.size();
    }    

}
