package com.sowmik.arrays.easy;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {

    }
    public boolean findRotation(int[][] mat, int[][] target) {
        if(checkModify(mat,target)) {
            return true;
        }
        int[][] modify1 = modify(mat);
        if (checkModify(modify1,target)) {
            return true;
        }
        int[][] modify2 = modify(modify1);
        if (checkModify(modify2,target)) {
            return true;
        }
        int[][] modify3 = modify(modify2);
        if(checkModify(modify3,target)) {
            return true;
        }
        return false;
    }
    public static int[][] modify(int[][] mat) {
        int[][] modify = new int[mat.length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = mat[i].length-1, k = 0; j >= 0; j--, k++) {
                modify[k][i] = mat[i][j];
            }
        }
        return modify;
    }
    public static boolean checkModify(int[][] mat, int[][] target) {
        boolean ans = true;
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[0].length; j++) {
                if(mat[i][j]!=target[i][j]) {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
}
