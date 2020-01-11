package com.yengchihang.serventyFive;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {2,0,2,1,1,0};
        Solution solution = new Solution();
        solution.sortColors(array);
        Arrays.stream(array).forEach(System.out::print);
    }

    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        quickSort(nums,left,right);
    }

    public int getMiddlePos(int[] nums,int left, int right){
        int buf = nums[left];
        while (left < right){
            while (left < right && nums[right] > buf){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] <= buf){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[right] = buf;
        return left;
    }

    public void quickSort(int[] nums,int left, int right){
        if (left < right){
            int pos = getMiddlePos(nums,left,right);
            quickSort(nums,left,pos-1);
            quickSort(nums,pos+1,right);
        }
    }
}
