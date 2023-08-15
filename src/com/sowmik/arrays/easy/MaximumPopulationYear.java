package com.sowmik.arrays.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        int a = maximumPopulation(arr);
        System.out.println(a);
    }
    public static int maximumPopulation(int[][] logs) {

        int ans = 1950;
        int cnt = 0;
        for (int i = 1950; i<=2050; i++) {
            int curMax = 0;
            for (int j = 0; j < logs.length; j++) {
                if(i>=logs[j][0] && i<logs[j][1]) {
                    curMax++;
                }
            }
            if(curMax>cnt) {
                cnt = curMax;
                ans = i;
            }
        }
        return ans;
    }
}
