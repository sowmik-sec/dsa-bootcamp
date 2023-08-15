package com.sowmik.arrays.easy;

import java.util.Scanner;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ans = sumZero(n);
        for (int an : ans) {
            System.out.print(an + " ");
        }
        System.out.println();
    }
    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n==0) {
            return new int[]{0};
        }
        if(n%2==1) {
            ans[0] = 0;
            for (int i = 1; i <= n/2; i++) {
                ans[i] = i;
            }
            for (int i = 1, j = n/2+1; i <= n/2; i++,j++) {
                ans[j] = -i;
            }
        }
        else {
            for (int i=0;i<n/2;i++) {
                ans[i] = i+1;
            }
            for (int j = n/2,i=1;j<n;j++,i++) {
                ans[j] = -i;
            }
        }
        return ans;
    }

}
