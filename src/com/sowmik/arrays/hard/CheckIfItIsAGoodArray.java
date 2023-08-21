package com.sowmik.arrays.hard;

public class CheckIfItIsAGoodArray {
    public static void main(String[] args) {

    }
    public boolean isGoodArray(int[] nums) {
        if(nums.length<2 && nums[0]!=1) return false;
        int gcd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            gcd = findGCD(gcd, nums[i]);
        }
        return gcd==1;
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
