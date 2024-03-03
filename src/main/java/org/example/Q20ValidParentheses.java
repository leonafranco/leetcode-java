package org.example;

import java.util.Stack;

public class Q20ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            Stack stack = new Stack();
            char result[] = s.toCharArray();
            for(char parentheses : result) {
                if(parentheses == '(' || parentheses == '[' || parentheses == '{') {
                    stack.push(parentheses);
                }
                if((parentheses == ')' || parentheses == '}' || parentheses == ']') && stack.size() == 0) {
                    return false;
                }
                if(parentheses == ')' && stack.size() != 0){
                    char isValid = (char) stack.pop();
                    if(isValid != '(') return false;
                }
                if(parentheses == ']' && stack.size() != 0) {
                    char isValid = (char) stack.pop();
                    if(isValid != '[') return false;
                }
                if(parentheses == '}' && stack.size() != 0) {
                    char isValid = (char) stack.pop();
                    if(isValid != '{') return false;
                }
            }
            if(stack.size() != 0){
                return false;
            }
            return true;
        }

    }

//100000
//'()[]{}'
//3 possibilites
//all alphanumeric 26 letters 10 numbers = 36 letters
}
