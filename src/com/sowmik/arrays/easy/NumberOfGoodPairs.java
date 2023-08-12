package com.sowmik.arrays.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int ans = numIdenticalPairs(arr);
        System.out.println(ans);
    }
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = map.get(nums[i]);
            map.put(nums[i], ++temp);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int temp2 = entry.getValue();
            ans += (temp2*(temp2+1))/2;
        }
        return ans;
    }
}
