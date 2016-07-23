package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SingleNumbeIII {

    public int[] singleNumberEasy(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer integer : set) {
            result[index] = integer;
            index++;
        }
        return result;
    }

    public int[] singleNumberHard(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }

        int bitFlag = diff & ((~ diff) + 1);
        int[] singles = new int[2];
        for (int num : nums) {
            if ((num & bitFlag) == 0) {
                singles[0] ^= num;
            } else {
                singles[1] ^= num;
            }
            diff ^= num;
        }
        return singles;
    }

}
