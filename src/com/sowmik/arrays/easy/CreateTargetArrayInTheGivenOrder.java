package com.sowmik.arrays.easy;

import java.util.*;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            index[i] = in.nextInt();
        }
        int[] ans = createTargetArray(nums, index);
        for (int an : ans) {
            System.out.print(an + " ");
        }
        System.out.println();
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);;
        }
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
