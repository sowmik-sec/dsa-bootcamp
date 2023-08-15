package com.sowmik.arrays.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        while (j<nums.length) {
            if(nums[i]==nums[j]) {
                j++;
            }
            else {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
