package com.sowmik.arrays.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int extra = in.nextInt();
        List<Boolean> ans = kidsWithCandies(arr, extra);
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(candies[i]>max) {
                max = candies[i];
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                ans.add(true);
            } else ans.add(false);
        }
        return ans;
    }
}
