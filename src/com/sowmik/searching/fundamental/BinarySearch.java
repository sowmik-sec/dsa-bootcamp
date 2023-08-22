package com.sowmik.searching.fundamental;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 10, 11, 13, 14, 20, 28,35};
        int target = 111;
        int ans = search(nums, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        int s=0, e = arr.length-1;
        while (s<=e) {
            int m = s + (e-s)/2;
            if(arr[m]==target) {
                return m;
            }
            else if(target>arr[m]) {
                s = m+1;
            }
            else {
                e = m-1;
            }
        }
        return -1;
    }
}
