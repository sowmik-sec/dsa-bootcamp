package com.sowmik.arrays.easy;

import java.util.Scanner;

public class FindTheHeightAltitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int ans = largestAltitude(arr);
        System.out.println(ans);
    }
    public static int largestAltitude(int[] gain) {
        int mx = gain[0];
        int temp = gain[0];
        for (int i = 1; i < gain.length; i++) {
            temp += gain[i];
            mx = Math.max(mx, temp);
        }
        mx = Math.max(0, mx);
        return mx;
    }
}
