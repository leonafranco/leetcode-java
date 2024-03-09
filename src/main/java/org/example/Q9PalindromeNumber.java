package org.example;

public class Q9PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            if(x < 0) return false;
            StringBuilder s = new StringBuilder(Integer.toString(x));
            StringBuilder reversed = new StringBuilder(s);
            reversed.reverse();
            if(s.compareTo(reversed) == 0){
                return true;
            }
            return false;
        }
    }
}
