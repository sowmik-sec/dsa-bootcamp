package com.sowmik.arrays.medium;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int flag = 0;
        int mul2 = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) {
                flag++;
            }
            else {
                mul2 *= nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0 && flag==nums.length) {
                nums[i] = 0;
            }
            else if(flag>=2){
                nums[i] = 0;
            }
            else if(nums[i]==0) {
                nums[i] = mul2;
            }
            else if(flag>=1 && nums[i]!=0) {
                nums[i] = mul2;
            }
            else {
                nums[i] = mul2/nums[i];
            }
        }
        return nums;
    }
}
