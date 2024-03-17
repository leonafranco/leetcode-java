package org.example;

import java.util.HashSet;

class Q217ContainDuplicate {
    public boolean containsDuplicate_217(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        boolean result = false;

        for(int i = 0; i < nums.length; i++) {
            if(values.contains(nums[i])){
                result = true;
                break;
            }
            values.add(nums[i]);
        }
        return result;
    }
}
