package com.sowmik.arrays.medium;

public class SpiralMatrixII {
    public static void main(String[] args) {

    }
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int ll=0,rl=n,ul=0,dl=n;
        int cnt = 0;
        int total = n*n;
        while (cnt!=total) {
            for (int i = ll; i < rl && cnt<total; i++) {
                arr[ul][i] = ++cnt;
            }
            ul++;
            for (int i = ul; i < dl && cnt<total; i++) {
                arr[i][rl-1] = ++cnt;
            }
            rl--;
            for(int i=rl-1;i>=ll && cnt<total;i--) {
                arr[dl-1][i] = ++cnt;
            }
            dl--;
            for(int i=dl-1; i>=ul && cnt<total; i--) {
                arr[i][ll] = ++cnt;
            }
            ll++;
        }
        return arr;
    }
}
