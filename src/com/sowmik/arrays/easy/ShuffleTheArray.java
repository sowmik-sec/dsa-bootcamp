package com.sowmik.arrays.easy;

import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n*2];
        for (int i = 0; i < n*2; i++) {
            arr[i] = in.nextInt();
        }
        int[] ans = shuffle(arr, n);
        for (int i = 0; i < n*2; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int i = 0, k = 0, j = n;
        while (true) {
            if(j==n*2) {
                break;
            }
            if(i%2==0) {
                ans[i] = nums[k];
                i++; k++;
            }
            else {
                ans[i] = nums[j];
                i++; j++;
            }
        }
        return ans;
    }
}
