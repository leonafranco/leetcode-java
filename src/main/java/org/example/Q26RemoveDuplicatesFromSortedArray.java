package org.example;

public class Q26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[k]){
                k++;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }

    //couldnt found i solution from this one, but was a two pointer
}
