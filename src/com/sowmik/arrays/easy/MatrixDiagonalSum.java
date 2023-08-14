package com.sowmik.arrays.easy;

public class MatrixDiagonalSum {
    public static void main(String[] args) {

    }
    public static int diagonalSum(int[][] mat) {
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            ans += mat[i][i];
            ans += mat[i][mat.length-i-1];
        }
        if(mat.length%2==1) {
            ans -= mat[mat.length / 2][mat.length / 2];
        }
        return ans;
    }
}
