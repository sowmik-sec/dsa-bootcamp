package com.sowmik.searching.fundamentals;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 10, 10, 11, 13, 14, 20, 28,35};
        int target = 100;
        int ans = ceiling(nums, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target) {
        int s = 0, e = arr.length-1;
        if(target>arr[arr.length-1]) {
            return -1;
        }
        while (s<=e) {
            int m = s + (e-s)/2;
            if(target>=arr[m]) {
                s = m+1;
            }
            else e = m-1;
        }
        return arr[s];
    }
}
