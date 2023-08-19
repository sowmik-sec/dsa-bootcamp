package com.sowmik.arrays.medium;

import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums) {
        if(nums.length==1) {
            return true;
        }
        int goal = nums.length-1;
        for(int i=nums.length-1;i>=0;i--) {
            if(i+nums[i]>=goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}
