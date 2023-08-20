package com.sowmik.arrays.hard;


import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) {
                set.add(nums[i]);
            }
        }
        int i;
        for( i=1;i<nums.length;i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return i;
    }
}
