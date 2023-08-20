package com.sowmik.arrays.medium;

public class HouseRobber {
    public static void main(String[] args) {

    }
    public int rob(int[] nums) {
        if(nums.length<1) {
            return 0;
        }
        if(nums.length==1) {
            return nums[0];
        }
        int[] maxAns = new int[nums.length];
        maxAns[0] = nums[0];
        maxAns[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            maxAns[i] = Math.max(nums[i]+maxAns[i-2], maxAns[i-1]);
        }
        return maxAns[nums.length-1];
    }
}
