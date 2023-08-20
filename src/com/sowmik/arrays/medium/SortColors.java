package com.sowmik.arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;

public class SortColors {
    public static void main(String[] args) {

    }
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        for(int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<3;i++) {
            if(map.containsKey(i)) {
                for(int j=0;j<map.get(i);j++) {
                    nums[cnt++] = i;
                }
            }
        }
    }
}
