package com.sowmik.arrays.easy;

import java.util.Scanner;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] ans = runningSum(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
