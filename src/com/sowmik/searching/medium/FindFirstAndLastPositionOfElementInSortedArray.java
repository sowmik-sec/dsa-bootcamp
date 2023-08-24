package com.sowmik.searching.medium;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        
    }
    public static int[] searchRange(int[] nums, int target) {
        int low = lower_bound(nums, target);
        int high = upper_bound(nums, target);
        System.out.println(low+" "+high);
        return new int[]{low, high};
    }
    public static int lower_bound(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<high) {
            int mid = low + (high-low)/2;
            if(target<=nums[mid]) {
                high = mid;
            }
            else low = mid + 1;
        }
        if(low<nums.length && nums[low]==target) {
            return low;
        }
        else return -1;
    }
    public static int upper_bound(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while (low<high) {
            int mid = low + (high-low)/2;
            if(target>=nums[mid]) {
                low = mid+1;
            }
            else high = mid;
        }
        System.out.println(low+" "+high);
        if(high<nums.length && nums[high]==target) {
            return high;
        }
        if(high<=nums.length && high>0 && nums[high-1]==target) {
            return --high;
        }
        return -1;
    }
}
