package com.sowmik.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = in.nextInt();
        }
        int[] ans = smallerNumbersThanCurrent(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        ans = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = map.get((ans[i]));
        }
        return ans;
    }
}
