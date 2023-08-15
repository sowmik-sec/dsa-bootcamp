package com.sowmik.arrays.easy;

public class MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {

    }
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for(int num: position) {
            if(num%2==0) {
                even++;
            }
            else odd++;
        }
        return Math.min(even, odd);
    }
}
