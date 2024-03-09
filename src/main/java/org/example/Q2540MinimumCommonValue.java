package org.example;

public class Q2540MinimumCommonValue {

    public int getCommon(int[] nums1, int[] nums2) {

        int i = 0;
        int y = 0;
        while(nums1.length > i && nums2.length > y){

            if(nums1[i] == nums2[y]){
                return nums1[i];
            }

            if(nums1[i] > nums2[y]){
                y = y +1;
            }else {
                i = i +1;
            }
        }
        return -1;
    }

    //just made this 4fun
}
