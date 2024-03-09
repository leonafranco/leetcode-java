package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Q3LongestSubstringWithoutRepetingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            char[] letterInArray = s.toCharArray();
            Queue<Character> result = new LinkedList<>();
            int sizeOfWord = 0;
            int positionFirstLetter = 0;
            int arraysize = 0;


            for(char letter : letterInArray ) {
                arraysize = result.size();
                if(!result.contains(letter)){
                    result.add(letter);
                }else{
                    for(int y= 0; y < arraysize; y++){
                        char x = result.remove();
                        if(x == letter) break;
                    }
                    result.add(letter);
                }
                if(positionFirstLetter < result.size()) {
                    positionFirstLetter = result.size();
                }
            }
            return positionFirstLetter;
        }
    }//1st + last - 1?
//0 2 = 3 ( 2 - 0 = 2 + 1 = 3)
//1 3 = 3 (3-1 = 2 +1 = 3)
//2 4 = 3 (2-4 = 2 + 1 = 3)
// 0 1 2 3 4 5 6 7
// a b c a b c b b
//d v d f
//d v d f
//0 1 2 3 4 5 6
//b b b b b b
//a = 0 - 0 + 1
//this can be the biggest piece of sh** that i ever created. n * k


}
