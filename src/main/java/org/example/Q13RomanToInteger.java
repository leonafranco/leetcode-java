package org.example;

class Q13RomanToInteger {
    public int romanToInt(String s) {
        int checkNext = 1;
        int result = 0;
        int[] nums = new int[]{1,2,3,4,5,6};

        char lettersArray[] = s.toCharArray();

        for(int i = 0; i < lettersArray.length ;i++) {
            int value = checkRomanToInt(lettersArray[i]);
            if(checkNext < lettersArray.length){
                int nextValue = checkRomanToInt(lettersArray[checkNext]);
                if(value < nextValue){
                    result = result - value;
                }else{
                    result = result + value;
                }
            }else{
                result = result + value;
            }
            checkNext++;
        }
        return result;
    }

    public int checkRomanToInt(Character c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}



//1000 100 1000 10 100 1 5
//1000 + (-100 + 1000) + (-10 + 100) + (-1 + 5)
//M C M X C I
