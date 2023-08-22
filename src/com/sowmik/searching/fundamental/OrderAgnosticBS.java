package com.sowmik.searching.fundamental;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] nums = {2, 3, 7, 10, 11, 13, 14, 20, 28,35};
        int[] nums = {35, 23, 20, 10, 8, 3, 2, 1, -7, -10};
        int target = -7;
        int ans = orderAgnosticBS(nums, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0, e = arr.length-1;
        boolean isAsc = arr[s] < arr[e];
        while (s<=e) {
            int m = s + (e-s)/2;
            if(arr[m]==target) {
                return m;
            }
            if(isAsc) {
                if (target > arr[m]) {
                    s = m+1;
                }
                else {
                    e = m-1;
                }
            }
            else {
                if(target<arr[m]) {
                    s = m+1;
                }
                else {
                    e = m-1;
                }
            }
        }
        return -1;
    }
}
