package questions;

import org.junit.Test;
import org.omg.CORBA.StringSeqHelper;

import java.util.HashSet;
import java.util.Set;

public class ReverseString {
    @Test
    public String reverseString(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            sb.append(s.charAt(i));
        }
        HashSet<Integer> integers = new HashSet<>();
        return s;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }
        int[] intArray = new int[set.size()];
        int i = 0;
        for (Integer val: set) {
            intArray[i] = val;
            i++;
        }
        return intArray;
    }
}
