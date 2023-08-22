package com.sowmik.searching.fundamental;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {35, 23, 20, 10, 8, 3, 2, 1, -7, -10};
        int target = -7;
        int ans = linearSearch(nums, target, 2, nums.length);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end ; i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
