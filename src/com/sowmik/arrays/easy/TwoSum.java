package com.sowmik.arrays.easy;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> comp = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++) {
            if(comp.containsKey(nums[i])) {
                result[0] = i;
                result[1] = comp.get(nums[i]);
            }
            else {
                comp.put(target-nums[i],i);
            }
        }
        return result;
    }

}
