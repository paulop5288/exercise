package questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> allNums = new HashMap<>();
        for (int num : nums) {
            allNums.put(num, 1 + allNums.getOrDefault(num, 0));
        }
        List<Integer> freqNums = new ArrayList<>(k);
        

        return new LinkedList<>();
    }
}
