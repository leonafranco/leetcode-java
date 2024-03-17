package org.example;

import java.util.HashMap;
import java.util.Map;

class Q1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> counter = new HashMap<>();

        int value = 0;
        for(int i = 0; i < nums.length; i++) {
            value = target - nums[i];
            if(counter.get(value) != null) {
                int[] sample = {i, counter.get(value)};
                return sample;
            }
            counter.put(nums[i],i);
        }
        return null;
    }
}
