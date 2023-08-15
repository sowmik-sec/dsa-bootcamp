package com.sowmik.arrays.easy;

public class PlusOne {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
        boolean flag = false;
        int n = digits.length-1;
        int remainder = 0;
        int[] ans = new int[n+1];
        for (int i = n; i>=0; i--) {
            if(i==n && digits[i]==9) {
                flag = true;
                ans[i] = 0;
                remainder = 1;
            }
            if(flag && digits[i]==9) {
                ans[i] = 0;
            }
            if (flag && digits[i]!=9) {
                ans[i] = digits[i]+1;
                flag = false;
            }
            else ans[i] = digits[i];
        }
        if(remainder==1) {
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                arr[i+1] = digits[i];
            }
            return arr;
        }
        return ans;
    }
}
