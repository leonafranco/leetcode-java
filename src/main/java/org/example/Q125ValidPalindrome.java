package org.example;

public class Q125ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {

            s = s.replaceAll("[^a-zA-Z0-9]", ""); //N
            s = s.toLowerCase(); //N
            char result[] = s.toCharArray();
            int pointer2 = result.length -1;

            for(int pointer1 = 0; pointer1 < result.length; pointer1++) { //N/2
                if(result[pointer1] != result[pointer2]) {
                    return false;
                }
                pointer2--;
                if(pointer1 == result.length / 2) {
                    break;
                }
            }
            return true;
        }
    }
}
