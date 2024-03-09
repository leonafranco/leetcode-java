package org.example;

public class Q7ReverseInteger {
    class Solution {
        public int reverse(int x) {
            int maxInt = Integer.MAX_VALUE;
            boolean isNegative = false;
            if (x < 0){
                x = x * -1;
                isNegative = true;
            }
            StringBuilder s = new StringBuilder(Integer.toString(x));
            s = s.reverse();
            try{
                int result = Integer.parseInt(String.valueOf(s));
                if (isNegative){
                    result = result * -1;
                }
                return result;
            }catch(Exception e){
                return 0;
            }
        }
    }
}
