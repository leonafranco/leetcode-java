package org.example;

import java.util.HashMap;
import java.util.Map;

class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> counter = new HashMap<>();

        for(char x : s.toCharArray()) {
            counter.put(x, counter.getOrDefault(x, 0) + 1);
        }

        for(char x : t.toCharArray()) {
            counter.put(x, counter.getOrDefault(x, 0) - 1);
        }

        for(int val : counter.values()) {
            if(val != 0) {
                return false;
            }
        }
        return true;
    }
}