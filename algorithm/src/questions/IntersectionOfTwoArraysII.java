package questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> firstMap = new HashMap<>();
        for (int i : nums1) {
            if (firstMap.containsKey(i)) {
                firstMap.put(i, firstMap.get(i) + 1);
            } else {
                firstMap.put(i, 1);
            }
        }

        Map<Integer, Integer> secMap = new HashMap<>();
        for (int i : nums2) {
            if (firstMap.containsKey(i)) {
                if (secMap.containsKey(i)) {
                    secMap.put(i, secMap.get(i) + 1);
                } else {
                    secMap.put(i, 1);
                }
            }
        }
        int sum = secMap.values().stream().mapToInt(i -> i.intValue()).sum();
        int[] intersect = new int[sum];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : secMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                intersect[index++] = entry.getKey();
            }
        }

        return intersect;
    }

}
