package com.sowmik.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {

    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int num = matrix[i][0];
            int min = Integer.MAX_VALUE;
            int max = num;
            int col = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            boolean flag = true;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][col]>min) {
                    flag = false;
                    break;
                }
            }
            System.out.println(min+" "+max);
            if(flag) {
                list.add(min);
            }
        }
        return list;
    }
}
