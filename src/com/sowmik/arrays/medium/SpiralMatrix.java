package com.sowmik.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rl = matrix[0].length;
        int dl = matrix.length;
        int ll = 0;
        int ul = 0;
        int total = rl*dl;
        int cnt = 0;
        int track = 0;
        while (cnt != total) {
            if (track == 0) {
                track++;
                for (int i = ll; i < rl && cnt < total; i++) {
                    list.add(matrix[ul][i]);
                    cnt++;
                }
                ul++;
            }
            if (track == 1) {
                track++;
                for (int i = ul; i < dl && cnt < total; i++) {
                    list.add(matrix[i][rl-1]);
                    cnt++;
                }
                rl--;
            }
            if (track == 2) {
                track++;
                for (int i = rl-1; i >= ll && cnt < total; i--, cnt++) {
                    list.add(matrix[dl - 1][i]);
                }
                dl--;
            }
            if (track == 3) {
                track++;
                for (int i = dl-1; i >= ul && cnt < total; i--, cnt++) {
                    list.add(matrix[i][ll]);
                }
                ll++;
            }
            if (track == 4) {
                track = 0;
            }
        }
        return list;
    }
}
