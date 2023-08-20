package com.sowmik.arrays.hard;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length) {
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[nums[i]-1]) {
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = temp;
            }
            else i++;
        }
        int j;
        for (j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1) return j+1;
        }
        return j+1;
    }
}
