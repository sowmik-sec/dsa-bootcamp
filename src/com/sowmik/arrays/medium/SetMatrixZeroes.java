package com.sowmik.arrays.medium;

public class SetMatrixZeroes {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0) {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==Integer.MAX_VALUE) {
                    for (int k = 0; k < matrix[i].length; k++) {
                        matrix[i][k] = 0;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
    }
}
