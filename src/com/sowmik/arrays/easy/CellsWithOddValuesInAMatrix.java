package com.sowmik.arrays.easy;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        // problem solved Alhamdulillah
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int ans = 0;
        for (int i = 0; i < indices.length; i++) {
            /*
                indices[0][0] indices[0][1]
                indices[1][0] indices[1][1]
                indices[2][0] indices[2][1]
                indices[3][0] indices[3][1]
             */
            for (int j = 0; j < n; j++) {
                arr[indices[i][0]][j]++;
            }
            for (int j = 0; j < m; j++) {
                arr[j][indices[i][1]]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]%2==1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
