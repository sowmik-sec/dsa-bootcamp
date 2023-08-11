package com.sowmik.arrays.easy;

import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] ans = getConcatenation(arr);
        for (int an : ans) {
            System.out.print(an + " ");
        }
        System.out.println();
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0, j=nums.length; i < nums.length; i++, j++) {
            ans[i] = nums[i];
            ans[j] = nums[i];
        }
        return ans;
    }
}
