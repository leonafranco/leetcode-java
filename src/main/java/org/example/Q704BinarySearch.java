package org.example;

public class Q704BinarySearch {
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            int mid = 0;
            while(left <= right) {
                mid = (left + (right - left)/2);
                if(nums[mid] > target) {
                    right = mid - 1;
                }
                if(nums[mid] < target) {
                    left = mid + 1;
                }
                if(nums[mid] == target){
                    return mid;
                }
            }
            return -1;
        }

        // 1 2 3 4 5 6 7 8 9 10 11
    }
}
