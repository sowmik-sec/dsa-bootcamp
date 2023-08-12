package com.sowmik.arrays.easy;

import java.util.Scanner;

public class FlippingAnImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int[][] ans = flipAndInvertImage(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = image[i].length-1, k=0; j >= 0; j--, k++) {
                ans[i][k] = image[i][j];
                if(ans[i][k]==0) {
                    ans[i][k] = 1;
                }
                else {
                    ans[i][k] = 0;
                }
            }
        }
        return ans;
    }
}
