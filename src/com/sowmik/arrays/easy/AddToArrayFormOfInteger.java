package com.sowmik.arrays.easy;

import java.math.BigInteger;
import java.util.*;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        List<Integer> ans = addToArrayForm(num,k);
        for(Integer nn:ans) {
            System.out.print(nn+" ");
        }
        System.out.println();
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {

        BigInteger numFromArray = number(num);
        //System.out.println("Number = "+numFromArray);
        BigInteger ansInNumber = numFromArray.add(BigInteger.valueOf(k));
        //System.out.println("ans = "+ansInNumber);
        return arrayFromNum(ansInNumber);
    }

    public static List<Integer> arrayFromNum(BigInteger ansInNumber) {
        List<Integer> ans = new ArrayList<>();
        //System.out.println("inside = "+ansInNumber);
        BigInteger zero = BigInteger.ZERO;
        while (ansInNumber.compareTo(zero) > 0) {
            ans.add(ansInNumber.mod(BigInteger.TEN).intValue());
            ansInNumber = ansInNumber.divide(BigInteger.TEN);
        }
//        System.out.print("inside a function:  ");
//        for(Integer n: ans) {
//            System.out.print(n+" ");
//        }
//        System.out.println();
        Collections.reverse(ans);
        return ans;
    }

    public static BigInteger number(int[] num) {
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < num.length; i++) {
            ans = ans.multiply(BigInteger.TEN);
            ans = ans.add(BigInteger.valueOf(num[i]));
        }
        return ans;
    }
}
