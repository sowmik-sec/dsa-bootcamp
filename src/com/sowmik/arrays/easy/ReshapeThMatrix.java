package com.sowmik.arrays.easy;

import java.util.ArrayList;

public class ReshapeThMatrix {
    public static void main(String[] args) {

    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[r][c];
        if(m*n!=r*c) {
            return mat;
        }
        //ArrayList<Integer> list= new ArrayList<>();
        // for (int[] ints : mat) {
        //     for (int j = 0; j < n; j++) {
        //         list.add(ints[j]);
        //     }
        // }
        //int k = 0;
        int row = 0, col = 0;
        for (int[] ints : mat) {
            for (int j = 0; j < n; j++) {
                ans[row][col++] = ints[j];
                if (col == c) {
                    row++;
                    col = 0;
                }
            }
        }
        return ans;
    }
}
