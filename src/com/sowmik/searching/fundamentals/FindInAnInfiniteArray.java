package com.sowmik.searching.fundamentals;

public class FindInAnInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 10, 11, 13, 14, 20, 28,35};
        int target = 13;
        int ans = ans(nums, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] arr, int target, int s, int e) {
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
