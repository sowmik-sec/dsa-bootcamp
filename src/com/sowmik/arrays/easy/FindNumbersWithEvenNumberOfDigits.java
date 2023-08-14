package com.sowmik.arrays.easy;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        // solved
    }
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count(nums[i])%2==0) {
                ans++;
            }
        }
        return ans;
    }
    public static int count(int n) {
        int cnt = 0;
        while (n>0) {
            cnt++;
            n/=10;
        }
        return cnt;
    }
}
